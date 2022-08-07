package controlador;
// LIBRERIAS
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JOptionPane;
import DAO.ConexionSQL;

import vista.form_login;
import vista.form_main;

public class controladorLogin implements ActionListener{
    form_login vistaFL;
    
    public controladorLogin(form_login fLogin) {
        this.vistaFL=fLogin;
        this.vistaFL.BTiniciarSesion.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vistaFL.BTiniciarSesion){
            String user=vistaFL.TXTnombreUsuario.getText();
            String pass=vistaFL.TXTclaveUsuario.getText();
            
            String url="SELECT COD_USUARIO, NOMBRES, NOMBRE_USUARIO, CLAVE_USUARIO, ROL "
                    + "FROM usuarios WHERE estado='ACTIVO' and NOMBRE_USUARIO='" + user +"'";
            
            try{
                Connection con=ConexionSQL.getConexion();
                PreparedStatement ps=con.prepareStatement(url);
                ResultSet rs= ps.executeQuery();
                
                if(rs.next()){
                    String codUser=rs.getString("COD_USUARIO"); 
                    String u=rs.getString("NOMBRE_USUARIO"); 
                    String p=rs.getString("CLAVE_USUARIO");
                    String rol=rs.getString("ROL");
                    
                    if(pass.equals(p)){
                        // VALIDAR ROL(ADMIN O VENDEDOR)
                        form_main formMain=new form_main();
                        controladorMain ctrlMain= new controladorMain(formMain);
                        formMain.LBnombreUsuario.setText(rs.getString("NOMBRES")); 
                        formMain.setVisible(true);
                        formMain.LBcodUsuario.setText(codUser);
                        if(rol.equals("ADMINISTRADOR")){
                            formMain.LBrolUsuario.setText("Admin");
                            vistaFL.setVisible(false);
                        }else if(rol.equals("VENDEDOR")){
                            formMain.BTregistroProductos.setVisible(false);
                            formMain.BTregistroUsuario.setVisible(false);
                            formMain.LBrolUsuario.setText("Seller");
                            vistaFL.setVisible(false);
                        }
                        
                    }else{
                        vistaFL.LBclaveIncorrecta.setText("Contraseña incorrecta");
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(null, "EL USUARIO NO EXISTE O ESTA INACTIVO");
                }
                
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex.toString());
            }
            
        }
    }
      
    
}
