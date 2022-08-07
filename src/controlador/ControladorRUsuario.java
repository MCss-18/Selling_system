package controlador;
import DAO.CRUDregistroUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.form_registroUsuario;
import modelo.Usuario;
public class ControladorRUsuario implements ActionListener{
    
    Usuario user=new Usuario();
    form_registroUsuario fRUser;
    CRUDregistroUsuario crudRUsuario = new CRUDregistroUsuario();
    
    public ControladorRUsuario(form_registroUsuario frUsuario) {
        fRUser=frUsuario;
        fRUser.BTnuevoUsuario.addActionListener(this);
        fRUser.BTguardarUsuario.addActionListener(this);
        fRUser.BTlimpiar.addActionListener(this);
        fRUser.BTactualizarUsuario.addActionListener(this);
        
        fRUser.TBLusuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBLproductosMouseClicked(evt);
            }
        });
        
        cargarTablaProd();
        updateCodigoProd();
        lockTXT(false);
        
        fRUser.BTguardarUsuario.setEnabled(false);    //DESHABILITAR BOTON GUARDAR
        fRUser.BTactualizarUsuario.setEnabled(false);  //DESHABILITAR BOTON ACTUALIZAR
        
    }

//    FUNCION LIMPIAR
    private void limpiar(){
        fRUser.TXTnombre.setText("");
        fRUser.TXTnombreUsuario.setText("");
        fRUser.TXTclaveUsuario.setText("");
        fRUser.CBrol.setSelectedIndex(0);
        fRUser.CBestado.setSelectedIndex(0);
    }
//    FUNCION ACT. CODIGO
    private void updateCodigoProd(){
        DefaultTableModel TPC=(DefaultTableModel) fRUser.TBLusuarios.getModel();
        int countColum=fRUser.TBLusuarios.getRowCount()+1;
        String digCero="000";
        if(countColum>9 && countColum<=99){ 
            digCero="00";
        }else if(countColum>99 && countColum<=999){
            digCero="0";
        }else if(countColum>999){
            digCero="";
        }
        fRUser.TXTcodUsuario.setText("CU" + digCero + countColum);
    }
    
 //Cargar los datos del DB a al Jtabla 
    private void cargarTablaProd(){
        DefaultTableModel modeloTabla=(DefaultTableModel) fRUser.TBLusuarios.getModel();
        modeloTabla.setRowCount(0);
        
        crudRUsuario.seleccionarRegistro(modeloTabla);
        
    }
    
    private void lockTXT(boolean valor){
        fRUser.TXTnombre.setEditable(valor);
        fRUser.TXTnombreUsuario.setEditable(valor);
        fRUser.TXTclaveUsuario.setEditable(valor);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==fRUser.BTnuevoUsuario){
            
            lockTXT(true);
            limpiar();
            updateCodigoProd();
            fRUser.BTguardarUsuario.setEnabled(true);  //HABILITAR BOTON GUARDAR
            fRUser.BTactualizarUsuario.setEnabled(false);  //DESHABILITAR BOTON ACTUALIZAR
            
        }else if(e.getSource()==fRUser.BTguardarUsuario){
            
            //validando el contenido de los campos
            if(fRUser.TXTnombre.getText().isEmpty() || fRUser.TXTnombreUsuario.getText().isEmpty() || fRUser.TXTclaveUsuario.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Falta ingresar datos");
            }else{
                              
                user.setCodUsuario(fRUser.TXTcodUsuario.getText());
                user.setNombres(fRUser.TXTnombre.getText());
                user.setNomUsuario(fRUser.TXTnombreUsuario.getText());
                user.setClaveUsuario(fRUser.TXTclaveUsuario.getText());
                user.setrolUsuario(fRUser.CBrol.getSelectedItem().toString());
                user.setEstadoUsuario(fRUser.CBestado.getSelectedItem().toString());
                
                crudRUsuario.GuardarRegistro(user.getCodUsuario(), user.getNombres(), user.getNomUsuario(), user.getClaveUsuario(), user.getrolUsuario(), user.getEstadoUsuario());
                limpiar();
                cargarTablaProd();
                updateCodigoProd();
    
            }
            
        }else if(e.getSource()==fRUser.BTactualizarUsuario){
            
            user.setCodUsuario(fRUser.TXTcodUsuario.getText());
                user.setNombres(fRUser.TXTnombre.getText());
                user.setNomUsuario(fRUser.TXTnombreUsuario.getText());
                user.setClaveUsuario(fRUser.TXTclaveUsuario.getText());
                user.setrolUsuario(fRUser.CBrol.getSelectedItem().toString());
                user.setEstadoUsuario(fRUser.CBestado.getSelectedItem().toString());
            
            crudRUsuario.actualizarRegistro(user.getCodUsuario(), user.getNombres(), user.getNomUsuario(), user.getClaveUsuario(), user.getrolUsuario(), user.getEstadoUsuario());
            
            limpiar();
            cargarTablaProd();
            updateCodigoProd();
            
        }else if(e.getSource()==fRUser.BTlimpiar){
            limpiar();
        } 
    }
    
    public void TBLproductosMouseClicked(MouseEvent evt){
        
        fRUser.BTguardarUsuario.setEnabled(false);   //DESHABILITAR BOTON GUARDAR
        fRUser.BTactualizarUsuario.setEnabled(true);  //HABILITAR BOTON ACTUALIZAR
        //EDITANDO CAMPOS
        lockTXT(true);
        int fila=fRUser.TBLusuarios.getSelectedRow();
        String selectCodProd=fRUser.TBLusuarios.getValueAt(fila, 0).toString();
        
        String[] valor=crudRUsuario.selecItemTable(selectCodProd);
        
        fRUser.TXTcodUsuario.setText(valor[0]);
        fRUser.TXTnombre.setText(valor[1]);
        fRUser.TXTnombreUsuario.setText(valor[2]); 
        fRUser.TXTclaveUsuario.setText(valor[3]);
        fRUser.CBrol.setSelectedItem(valor[4]);
        fRUser.CBestado.setSelectedItem(valor[5]);
    }
    
}
