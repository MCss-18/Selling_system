package DAO;
//LIBRERIAS
import java.sql.*;
import javax.swing.JOptionPane;

public class CRUDboleta {
    Connection con=ConexionSQL.getConexion();
    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsmd;

    public CRUDboleta() {
        
    }   
//    INSERT DATOS
    public void guardarRegistro(String codBoleta, String codCliente, String codUsuario, String fecha, String tipoMoneda, String tipoPago, float total, String estado){
        try{
            
            ps=con.prepareStatement("INSERT INTO boleta(COD_BOLETA, COD_CLIENTE, COD_USUARIO, FECHA, TIPO_MONEDA, TIPO_PAGO, TOTAL, ESTADO) VALUES(?,?,?,?,?,?,?,?)");
            ps.setString(1, codBoleta);
            ps.setString(2, codCliente);
            ps.setString(3, codUsuario);
            ps.setString(4, fecha);
            ps.setString(5, tipoMoneda);
            ps.setString(6, tipoPago);
            ps.setFloat(7, total);
            ps.setString(8, estado);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "BOLETA EMITIDA CON EXITO");
            
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
//    INSERT DETALLES DE LA BOLETA    
    public void guardarBolDetalles(String codBoleta,String codProd, String descrProd, float preicoProd, int cantProd, float importeBol){
        try{
            
            ps=con.prepareStatement("INSERT INTO detalles_boleta(COD_BOLETA, COD_PRODUCTO, DESCRIPCION, PRECIO, CANTIDAD, TOTAL) VALUES(?,?,?,?,?,?)");
            ps.setString(1, codBoleta);
            ps.setString(2, codProd);
            ps.setString(3, descrProd);
            ps.setFloat(4, preicoProd);
            ps.setInt(5, cantProd);
            ps.setFloat(6, importeBol);
            ps.executeUpdate();
            
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    
//    NUM. REGISTROS
    public int contarRegistros(){
        
        int contador=0;
        try{
            ps=con.prepareStatement("SELECT * FROM boleta");
            rs=ps.executeQuery();
            
            while (rs.next()) {
                contador++;
            }
            
            return contador;
        
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null, ex.toString());
        }
        return 0;
    }
    
    
}
