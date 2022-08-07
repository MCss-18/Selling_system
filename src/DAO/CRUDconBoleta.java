package DAO;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CRUDconBoleta {
    Connection con=ConexionSQL.getConexion();
    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsmd;

    public CRUDconBoleta() {
    }
    
//      SELECCIONAR REGISTRO BOLETA   (Cargar datos en la tabla) 
    public void seleccionarRegistro(DefaultTableModel modeloTabla){
        int columnas;
        try{
            ps=con.prepareStatement("SELECT * FROM boleta");
            
            rs=ps.executeQuery();
            rsmd=rs.getMetaData();
            columnas=rsmd.getColumnCount();
            
            while(rs.next()){
                Object[] fila=new Object[columnas];
                for(int i=0; i<columnas ;i++){
                    fila[i]=rs.getObject(i+1);
                }
                modeloTabla.addRow(fila);
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

//      BUSQUEDA POR CODIGO BOLETA
    public void busqCodBoleta(DefaultTableModel modeloTabla, String conCodBol){
        int columnas;
        try{
            ps=con.prepareStatement("SELECT * FROM boleta WHERE COD_BOLETA LIKE '" + conCodBol + "%'");
            
            rs=ps.executeQuery();
            rsmd=rs.getMetaData();
            columnas=rsmd.getColumnCount();
            
            while(rs.next()){
                Object[] fila=new Object[columnas];
                for(int i=0; i<columnas ;i++){
                    fila[i]=rs.getObject(i+1);
                }
                modeloTabla.addRow(fila);
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }    
//      BUSQUEDA POR COD_CLIENTE
    public void busqCodCliente(DefaultTableModel modeloTabla, String conCodCliente){
        int columnas;
        try{
            ps=con.prepareStatement("SELECT * FROM boleta WHERE COD_CLIENTE LIKE '" + conCodCliente + "%'");
            
            rs=ps.executeQuery();
            rsmd=rs.getMetaData();
            columnas=rsmd.getColumnCount();
            
            while(rs.next()){
                Object[] fila=new Object[columnas];
                for(int i=0; i<columnas ;i++){
                    fila[i]=rs.getObject(i+1);
                }
                modeloTabla.addRow(fila);
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    } 
    
//      SELECCIONAR ITEM DE LA TABLA BOLETA   
    public String[] selecItemTable(String selectCodBoleta){
           
        try{
            ps=con.prepareStatement("SELECT COD_CLIENTE, COD_USUARIO, FECHA, TIPO_MONEDA, TIPO_PAGO, TOTAL, ESTADO FROM boleta WHERE COD_BOLETA=?");
            ps.setString(1, selectCodBoleta);
            rs=ps.executeQuery();
            
            while(rs.next()){
                String[] lineaRegistro={selectCodBoleta, rs.getString("COD_CLIENTE"), rs.getString("COD_USUARIO"), rs.getString("FECHA"), rs.getString("TIPO_MONEDA"), rs.getString("TIPO_PAGO"), rs.getString("TOTAL"), rs.getString("ESTADO")};
                return lineaRegistro;
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
        return null;
    }    

//      Cargar detalles del la boleta 
    public void cargarDetalles(DefaultTableModel modeloTabla, String codBol){
        int columnas;
        try{
            ps=con.prepareStatement("SELECT COD_PRODUCTO, DESCRIPCION, PRECIO, CANTIDAD, TOTAL FROM detalles_boleta WHERE COD_BOLETA='" + codBol +"'");
            
            rs=ps.executeQuery();
            rsmd=rs.getMetaData();
            columnas=rsmd.getColumnCount();
            
            while(rs.next()){
                Object[] fila=new Object[columnas];
                for(int i=0; i<columnas ;i++){
                    fila[i]=rs.getObject(i+1);
                }
                modeloTabla.addRow(fila);
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
}
