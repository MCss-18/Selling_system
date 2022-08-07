package DAO;
//LIBRERIAS
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CRUDconsultaProd {
    
    Connection con=ConexionSQL.getConexion();
    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsmd;

    public CRUDconsultaProd() {
    }
    
//      SELECCIONAR REGISTRO PRODUCTO   (Cargar datos en la tabla) 
    public void seleccionarRegistro(DefaultTableModel modeloTabla){
        int columnas;
        try{
            ps=con.prepareStatement("SELECT * FROM productos");
            
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
    public void busqCodProd(DefaultTableModel modeloTabla, String conCodProd){
        int columnas;
        try{
            ps=con.prepareStatement("SELECT * FROM productos WHERE COD_PRODUCTO LIKE '" + conCodProd + "%'");
            
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
    
//      BUSQUEDA POR NOMBRE PRODUCTO
    public void busqNomProd(DefaultTableModel modeloTabla, String conNomProd){
        int columnas;
        try{
            ps=con.prepareStatement("SELECT * FROM productos WHERE DESCRIPCION LIKE '" + conNomProd + "%'");
            
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
    
//      BUSQUEDA POR CATEGORIA
    public void busqCatProd(DefaultTableModel modeloTabla, String conCatProd){
        int columnas;
        try{
            ps=con.prepareStatement("SELECT * FROM productos WHERE CATEGORIA LIKE '" + conCatProd + "%'");
            
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
//      SELECCIONAR ITEM DE LA TABLA PRODUCTO       
    public String[] selecItemTable(String selectCodProd){
           
        try{
            ps=con.prepareStatement("SELECT DESCRIPCION, CATEGORIA, STOCK, PRECIO FROM productos WHERE COD_PRODUCTO=?");
            ps.setString(1, selectCodProd);
            rs=ps.executeQuery();
            
            while(rs.next()){
                String[] lineaRegistro={selectCodProd, rs.getString("DESCRIPCION"), rs.getString("CATEGORIA"), rs.getString("STOCK"), rs.getString("PRECIO")};
                return lineaRegistro;
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
        return null;
    }
    
}
