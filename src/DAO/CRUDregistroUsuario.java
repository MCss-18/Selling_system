package DAO;
//LIBRERIAS
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CRUDregistroUsuario {
    
    Connection con=ConexionSQL.getConexion();
    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsmd;  //Permite analizar la estructura de una base de datos (que tablas tiene, que columnas cada tabla, de qué tipos, etc) o de un ResultSet de una consulta, para averiguar cuántas columnas tiene dicho ResulSet, de qué columnas de base de datos proceden, de qué tipo son, etc.
    
    public CRUDregistroUsuario() {
    }
    
//      GUARDAR REGISTRO USUARIO
    public void GuardarRegistro(String codUsuario, String nombres, String nomUsuario, String claveUsuario, String rolUusario, String estadoUsuario){
        try{
            
            ps=con.prepareStatement("INSERT INTO usuarios(COD_USUARIO, NOMBRES, NOMBRE_USUARIO, CLAVE_USUARIO, ROL, ESTADO) VALUES(?,?,?,?,?,?)");
            ps.setString(1, codUsuario);
            ps.setString(2, nombres);
            ps.setString(3, nomUsuario);
            ps.setString(4, claveUsuario);
            ps.setString(5, rolUusario);
            ps.setString(6, estadoUsuario);
                    
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro guardado");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
         
        }
    }

//      ACTUALIZAR REGISTRO USUARIO    
    public void actualizarRegistro(String codUsuario, String nombres, String nomUsuario, String claveUsuario, String rolUusario, String estadoUsuario){
        try{
            
            ps=con.prepareStatement("UPDATE usuarios SET NOMBRES=?, NOMBRE_USUARIO=?, CLAVE_USUARIO=?, ROL=?, ESTADO=? WHERE COD_USUARIO=?");

            ps.setString(1, nombres);
            ps.setString(2, nomUsuario);
            ps.setString(3, claveUsuario);
            ps.setString(4, rolUusario);
            ps.setString(5, estadoUsuario);
            ps.setString(6, codUsuario);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro modificado");

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
         
        }
        
    }   
    
    
//      SELECCIONAR REGISTRO CLIENTE    
    public void seleccionarRegistro(DefaultTableModel modeloTabla){
        int columnas;
        try{
            
            ps=con.prepareStatement("SELECT * FROM usuarios"); //Ayuda a realizar consultas, insertas datos, modificarlos, borrarlos

            rs=ps.executeQuery();  //Ejecuta la consulta SQL (CRUD)
            rsmd=rs.getMetaData();
            columnas=rsmd.getColumnCount();
            
            while(rs.next()){   // next() Retorna true si existen registros en la consulta
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
    
    
//      SELECCIONAR UN ITEM DE LA TABLA    
    public String[] selecItemTable(String selectCodUsuario){
           
        try{
            ps=con.prepareStatement("SELECT NOMBRES, NOMBRE_USUARIO, CLAVE_USUARIO, ROL, ESTADO FROM usuarios WHERE COD_USUARIO=?");
            ps.setString(1, selectCodUsuario);
            rs=ps.executeQuery();
            
            while(rs.next()){
                String[] lineaRegistro={selectCodUsuario, rs.getString("NOMBRES"), rs.getString("NOMBRE_USUARIO"), rs.getString("CLAVE_USUARIO"), rs.getString("ROL"), rs.getString("ESTADO")};
                return lineaRegistro;
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
        return null;
    }
    
}
