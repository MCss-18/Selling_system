package DAO;
//LIBRERIAS
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CRUDregistroProd {
    
    Connection con=ConexionSQL.getConexion();
    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsmd;
        
    public CRUDregistroProd() {
    }
    
//      GUARDAR REGISTRO PRODUCTO
    public void GuardarRegistro(String codProducto, String descripcionPr, String cateProd, int cantProd, float precioProd){
        try{
            
            ps=con.prepareStatement("INSERT INTO productos(COD_PRODUCTO, DESCRIPCION, CATEGORIA, STOCK, PRECIO, ESTADO) VALUES(?,?,?,?,?,?)");
          
            ps.setString(1, codProducto);
            ps.setString(2, descripcionPr);
            ps.setString(3, cateProd);
            ps.setInt(4, cantProd);
            ps.setFloat(5, precioProd);
            
            if(cantProd<=0){
                ps.setString(6, "NO DISPONIBLE");
            }else{
                ps.setString(6, "DISPONIBLE");
            }
                    
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro guardado");

            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex.toString());
 
            }
    }
    
//      ACTUALIZAR REGISTRO PRODUCTO
    public void actualizarRegistro(String codProducto, String descripcionPr, String cateProd, int cantProd, float precioProd){
        try{
            
            ps=con.prepareStatement("UPDATE productos SET DESCRIPCION=?, CATEGORIA=?, STOCK=?, PRECIO=? WHERE COD_PRODUCTO=?");

            ps.setString(1, descripcionPr);
            ps.setString(2, cateProd);
            ps.setInt(3, cantProd);
            ps.setFloat(4, precioProd);
            ps.setString(5, codProducto);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro modificado");

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
         
        }
        
    }
    
//      SELECCIONAR REGISTRO CLIENTE   (Cargar datos en la tabla) 
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
    
//      SELECCIONAR UN ITEM DE LA TABLA PRODUCTOS PARA ENVIAR A LA TABLA DE BOLETA Y/O FACTURA  
    public String[] selecItemTable(String selectCodProd){
        try{
            ps=con.prepareStatement("SELECT DESCRIPCION, CATEGORIA, STOCK, PRECIO FROM productos WHERE COD_PRODUCTO=?");
            ps.setString(1, selectCodProd);
            rs=ps.executeQuery();
            
            while(rs.next()){
                String[] lineaRegistro={selectCodProd, rs.getString("DESCRIPCION"), rs.getString("CATEGORIA"), rs.getString("PRECIO"), rs.getString("STOCK")};
                return lineaRegistro;
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
        return null;
    }
    
}
