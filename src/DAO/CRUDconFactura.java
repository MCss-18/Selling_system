package DAO;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CRUDconFactura {
    Connection con=ConexionSQL.getConexion();
    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsmd;

    public CRUDconFactura() {
    }

//      SELECCIONAR REGISTRO FACTURA   (Cargar datos en la tabla) 
    public void seleccionarRegistro(DefaultTableModel modeloTabla){
        int columnas;
        try{
            ps=con.prepareStatement("SELECT * FROM facturas");
            
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
    
//      BUSQUEDA POR CODIGO FACTURA
    public void busqCodFactura(DefaultTableModel modeloTabla, String conCodFac){
        int columnas;
        try{
            ps=con.prepareStatement("SELECT * FROM facturas WHERE COD_FACTURA LIKE '" + conCodFac + "%'");
            
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

//      BUSQUEDA POR COD_CLIENTEEMP
    public void busqCodCliente(DefaultTableModel modeloTabla, String conCodClienteEm){
        int columnas;
        try{
            ps=con.prepareStatement("SELECT * FROM facturas WHERE COD_CLIENTEEMPRESA LIKE '" + conCodClienteEm + "%'");
            
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

//      SELECCIONAR ITEM DE LA TABLA FACTURA   
    public String[] selecItemTable(String selectCodFactura){
           
        try{
            ps=con.prepareStatement("SELECT COD_FACTURA, COD_CLIENTEEMPRESA, COD_USUARIO, FECHA, TIPO_MONEDA, TIPO_PAGO, SUBTOTAL, IGV, TOTAL, ESTADO FROM facturas WHERE COD_FACTURA=?");
            ps.setString(1, selectCodFactura);
            rs=ps.executeQuery();
            
            while(rs.next()){
                String[] lineaRegistro={selectCodFactura, rs.getString("COD_CLIENTEEMPRESA"), rs.getString("COD_USUARIO"), rs.getString("FECHA"), rs.getString("TIPO_MONEDA"), rs.getString("TIPO_PAGO"), rs.getString("SUBTOTAL"), rs.getString("IGV"), rs.getString("TOTAL"), rs.getString("ESTADO")};
                return lineaRegistro;
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
        return null;
    }    

//      Cargar detalles del la Factura 
    public void cargarDetalles(DefaultTableModel modeloTabla, String codFact){
        int columnas;
        try{
            ps=con.prepareStatement("SELECT COD_PRODUCTO, DESCRIPCION, PRECIO, CANTIDAD, TOTAL FROM detalles_facturas WHERE COD_FACTURA='" + codFact +"'");
            
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
