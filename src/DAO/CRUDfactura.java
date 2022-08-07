package DAO;
//LIBRERIAS
import java.sql.*;
import javax.swing.JOptionPane;

public class CRUDfactura {
    Connection con=ConexionSQL.getConexion();
    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsmd;

    public CRUDfactura() {
    }

//    INSERT DATOS
    public void guardarRegistro(String codFactura, String codClienteEmp, String codUsuario, String fecha, String tipoMoneda, String tipoPago, float subTotal, float igv, float total, String estado){
        try{
            
            ps=con.prepareStatement("INSERT INTO facturas(COD_FACTURA, COD_CLIENTEEMPRESA, COD_USUARIO, FECHA, TIPO_MONEDA, TIPO_PAGO, SUBTOTAL, IGV, TOTAL, ESTADO) VALUES(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, codFactura);
            ps.setString(2, codClienteEmp);
            ps.setString(3, codUsuario);
            ps.setString(4, fecha);
            ps.setString(5, tipoMoneda);
            ps.setString(6, tipoPago);
            ps.setFloat(7, subTotal);
            ps.setFloat(8, igv);
            ps.setFloat(9, total);
            ps.setString(10, estado);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "FACTURA EMITIDA CON EXITO");
            
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null, ex.toString());
        }
    }    

//    INSERT DETALLES DE LA BOLETA    
    public void guardarFacDetalles(String codFactura,String codProd, String descrProd, float preicoProd, int cantProd, float importeBol){
        try{
            
            ps=con.prepareStatement("INSERT INTO detalles_facturas(COD_FACTURA, COD_PRODUCTO, DESCRIPCION, PRECIO, CANTIDAD, TOTAL) VALUES(?,?,?,?,?,?)");
            ps.setString(1, codFactura);
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
            ps=con.prepareStatement("SELECT * FROM facturas");
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
