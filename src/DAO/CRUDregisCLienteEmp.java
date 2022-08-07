package DAO;
//LIBRERIAS
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CRUDregisCLienteEmp {
    Connection con=ConexionSQL.getConexion();
    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsmd;

    public CRUDregisCLienteEmp() {
    }
    
//    GUARDAR REGISTRO CLIENTE    
    public void GuardarRegistro(String codCLEmp, String nombreCLEmp, String rucCLEmp, String direcCLEmp){
        try{
            ps=con.prepareStatement("INSERT INTO clienteEmpresa(COD_CLIENTEEMPRESA, NOMBRE_CLIENTE, RUC, DIRECCION) VALUES(?,?,?,?)");
            ps.setString(1, codCLEmp);
            ps.setString(2, nombreCLEmp);
            ps.setString(3, rucCLEmp);
            ps.setString(4, direcCLEmp);
                    
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro guardado");

            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex.toString());

            }
    }    


//    ACTUALIZAR REGISTRO CLIENTE
    public void actualizarRegistro(String codCLEmp, String nombreCLEmp, String rucCLEmp, String direcCLEmp){
        try{
            
            ps=con.prepareStatement("UPDATE clienteEmpresa SET NOMBRE_CLIENTE=?, RUC=?, DIRECCION=? WHERE COD_CLIENTEEMPRESA=?");

            ps.setString(1, nombreCLEmp);
            ps.setString(2, rucCLEmp);
            ps.setString(3, direcCLEmp);
            ps.setString(4, codCLEmp);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro modificado");

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
    }
     
//    SELECCIONAR REGISTRO CLIENTE EMPRESA
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
    
//    SELECCIONAR UN ITEM DE LA TABLA
    public String[] selecItemTable(String selectCodClEm){
           
        try{
            
            ps=con.prepareStatement("SELECT NOMBRE_CLIENTE, RUC, DIRECCION FROM clienteEmpresa WHERE COD_CLIENTEEMPRESA=?");
            ps.setString(1, selectCodClEm);
            rs=ps.executeQuery();
            
            while(rs.next()){
                String[] lineaRegistro={selectCodClEm, rs.getString("NOMBRE_CLIENTE"), rs.getString("RUC"), rs.getString("DIRECCION")};
                
                return lineaRegistro;
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
        return null;
    }
    
 
}