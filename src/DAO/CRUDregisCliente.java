package DAO;
//LIBRERIAS
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CRUDregisCliente {
    Connection con=ConexionSQL.getConexion();
    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsmd;
        
    public CRUDregisCliente() {
    }
    
//    GUARDAR REGISTRO CLIENTE
    public void GuardarRegistro(String codCLiente, String nombreCliente, String apellidoCliente, String tipoDocCLiente, String docCliente, String direccionCliente){
        try{
            
            ps=con.prepareStatement("INSERT INTO clientes(COD_CLIENTE, NOMBRE, APELLIDO, TIPO_DOCUMENTO, DOCUMENTO, DIRECCION) VALUES(?,?,?,?,?,?)");
            ps.setString(1, codCLiente);
            ps.setString(2, nombreCliente);
            ps.setString(3, apellidoCliente);
            ps.setString(4, tipoDocCLiente);
            ps.setString(5, docCliente);
            ps.setString(6, direccionCliente);
                    
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro guardado");

            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex.toString());

            }
    }
    
//    ACTUALIZAR REGISTRO CLIENTE
    public void actualizarRegistro(String codCLiente, String nombreCliente, String apellidoCliente, String tipoDocCLiente, String docCliente, String direccionCliente){
        try{
            
            ps=con.prepareStatement("UPDATE clientes SET NOMBRE=?, APELLIDO=?, TIPO_DOCUMENTO=?, DOCUMENTO=?, DIRECCION=? WHERE COD_CLIENTE=?");

            ps.setString(1, nombreCliente);
            ps.setString(2, apellidoCliente);
            ps.setString(3, tipoDocCLiente);
            ps.setString(4, docCliente);
            ps.setString(5, direccionCliente);
            ps.setString(6, codCLiente);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro modificado");

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());

        }
        
    }
    
//    SELECCIONAR REGISTRO CLIENTE
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
    
//    SELECCIONAR UN ITEM DE LA TABLA
    public String[] selecItemTable(String selectCodCl){
           
        try{
            
            ps=con.prepareStatement("SELECT NOMBRE, APELLIDO, TIPO_DOCUMENTO, DOCUMENTO, DIRECCION FROM clientes WHERE COD_CLIENTE=?");
            ps.setString(1, selectCodCl);
            rs=ps.executeQuery();
            
            while(rs.next()){
                String[] lineaRegistro={selectCodCl, rs.getString("NOMBRE"), rs.getString("APELLIDO"), rs.getString("TIPO_DOCUMENTO"), rs.getString("DOCUMENTO"), rs.getString("DIRECCION")};
                
                return lineaRegistro;
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
        return null;
    }
    
}
