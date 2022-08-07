package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQL {

    public static Connection getConexion() {
      
        
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String conexionUrl="jdbc:sqlserver://localhost:1433;" 
                + "database=PCMASTER;" 
                + "user=sa;"
                + "trustServerCertificate=true;"
                + "password=123;"
                + "loginTimeout=30;";
        try{
            Connection con=DriverManager.getConnection(conexionUrl);
            System.out.println("Conexion exitosa");  
            return con;
        }catch(SQLException error){
            System.out.println("Abrir error: " + error.getMessage());
            return null;
        }
        
    }
   
}