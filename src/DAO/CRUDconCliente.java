package DAO;
//LIBRERIAS
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CRUDconCliente {
    Connection con=ConexionSQL.getConexion();
    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsmd;

    public CRUDconCliente() {
    }
    
//      SELECCIONAR REGISTRO CLIENTE   (Cargar datos en la tabla) 
    public void seleccionarRegistro(DefaultTableModel modeloTabla){
        int columnas;
        try{
            ps=con.prepareStatement("SELECT * FROM clientes");
            
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
        
//      BUSQUEDA POR CODIGO CLIENTE
    public void busqCodCliente(DefaultTableModel modeloTabla, String conCodCliente){
        int columnas;
        try{
            ps=con.prepareStatement("SELECT * FROM clientes WHERE COD_CLIENTE LIKE '" + conCodCliente + "%'");
            
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
   
//      BUSQUEDA POR NOMBRE CLIENTE
    public void busqNomCliente(DefaultTableModel modeloTabla, String conNomCliente){
        int columnas;
        try{
            ps=con.prepareStatement("SELECT * FROM clientes WHERE NOMBRE LIKE '" + conNomCliente + "%'");
            
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
    
//      BUSQUEDA POR DOCUMENTO
    public void busqDocCliente(DefaultTableModel modeloTabla, String conDocCliente){
        int columnas;
        try{
            ps=con.prepareStatement("SELECT * FROM clientes WHERE DOCUMENTO LIKE '" + conDocCliente + "%'");
            
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
    
//      SELECCIONAR ITEM DE LA TABLA CLIENTE   
    public String[] selecItemTable(String selectCodCliente){
           
        try{
            ps=con.prepareStatement("SELECT NOMBRE, APELLIDO, TIPO_DOCUMENTO, DOCUMENTO, DIRECCION FROM clientes WHERE COD_CLIENTE=?");
            ps.setString(1, selectCodCliente);
            rs=ps.executeQuery();
            
            while(rs.next()){
                String[] lineaRegistro={selectCodCliente, rs.getString("NOMBRE"), rs.getString("APELLIDO"), rs.getString("TIPO_DOCUMENTO"), rs.getString("DOCUMENTO"), rs.getString("DIRECCION")};
                return lineaRegistro;
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
        return null;
    }

    
}
