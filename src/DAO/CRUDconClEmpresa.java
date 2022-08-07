package DAO;
//LIBRERIAS
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class CRUDconClEmpresa {
    Connection con=ConexionSQL.getConexion();
    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsmd;

    public CRUDconClEmpresa() {
    }
    
    //      SELECCIONAR REGISTRO CLIENTE EMPRESA (Cargar datos en la tabla) 
    public void seleccionarRegistro(DefaultTableModel modeloTabla){
        int columnas;
        try{
            ps=con.prepareStatement("SELECT * FROM clienteEmpresa");
            
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
    
 //      BUSQUEDA POR CODIGO PRODUCTO
    public void busqCodProd(DefaultTableModel modeloTabla, String conCodClienteEm){
        int columnas;
        try{
            ps=con.prepareStatement("SELECT * FROM clienteEmpresa WHERE COD_CLIENTEEMPRESA LIKE '" + conCodClienteEm + "%'");
            
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
    public void busqNomCliente(DefaultTableModel modeloTabla, String conNomClienteEm){
        int columnas;
        try{
            ps=con.prepareStatement("SELECT * FROM clienteEmpresa WHERE NOMBRE_CLIENTE LIKE '" + conNomClienteEm + "%'");
            
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
//      BUSQUEDA POR RUC
    public void busqRucCliente(DefaultTableModel modeloTabla, String conrucCliente){
        int columnas;
        try{
            ps=con.prepareStatement("SELECT * FROM clienteEmpresa WHERE RUC LIKE '" + conrucCliente + "%'");
            
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
    
//      SELECCIONAR ITEM DE LA TABLA CLIENTE EMPRESA  
    public String[] selecItemTable(String selectCodClienEm){
           
        try{
            ps=con.prepareStatement("SELECT NOMBRE_CLIENTE, RUC, DIRECCION FROM clienteEmpresa WHERE COD_CLIENTEEMPRESA=?");
            ps.setString(1, selectCodClienEm);
            rs=ps.executeQuery();
            
            while(rs.next()){
                String[] lineaRegistro={selectCodClienEm, rs.getString("NOMBRE_CLIENTE"), rs.getString("RUC"), rs.getString("DIRECCION")};
                return lineaRegistro;
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
        return null;
    }
    
}
