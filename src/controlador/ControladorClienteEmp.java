package controlador;
//LIBRERIAS
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
//MODULOS
import vista.form_registroClientesEmpresa;
import modelo.ClienteEmpresa;
import DAO.CRUDregisCLienteEmp;

public class ControladorClienteEmp implements ActionListener{

    //    atributos
    ClienteEmpresa clEmp = new ClienteEmpresa();
    form_registroClientesEmpresa fClienteEmp;
    CRUDregisCLienteEmp crudClienteEmp=new CRUDregisCLienteEmp();

    public ControladorClienteEmp(form_registroClientesEmpresa fclE) {
        fClienteEmp=fclE;
        fClienteEmp.BTnuevoClienteE.addActionListener(this);
        fClienteEmp.BTguardar.addActionListener(this);
        fClienteEmp.BTactualizar.addActionListener(this);
        fClienteEmp.BTlimpiar.addActionListener(this);
        fClienteEmp.TBLclientesEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBLclienteMouseClicked(evt);
            }
        });
        
        cargarTablaCliente();
        updateCodigoCliente();
        lockTXT(false);
        
        fClienteEmp.BTguardar.setEnabled(false);    //DESHABILITAR BOTON GUARDAR
        fClienteEmp.BTactualizar.setEnabled(false);  //DESHABILITAR BOTON ACTUALIZAR
        
    }
    
//    FUNCIONES
    private void limpiar(){
        fClienteEmp.TXTcod_clienteEmpresa.setText(null);
        fClienteEmp.TXTnombres.setText(null);
        fClienteEmp.TXTrucEmpresa.setText(null);
        fClienteEmp.TXTdireccionCliente.setText(null);
    }
    
    private void lockTXT(boolean valor){
        fClienteEmp.TXTnombres.setEditable(valor);
        fClienteEmp.TXTrucEmpresa.setEditable(valor);
        fClienteEmp.TXTdireccionCliente.setEditable(valor);
        
    }
    
    private void cargarTablaCliente(){
        DefaultTableModel modeloTabla=(DefaultTableModel) fClienteEmp.TBLclientesEmpresa.getModel();
        modeloTabla.setRowCount(0);
        
        crudClienteEmp.seleccionarRegistro(modeloTabla);
    }
    
//    FUNCION ACT. CODIGO
    private void updateCodigoCliente(){
        DefaultTableModel TPC=(DefaultTableModel) fClienteEmp.TBLclientesEmpresa.getModel();
        int countColum=fClienteEmp.TBLclientesEmpresa.getRowCount()+1;
        String digCero="000";
        if(countColum>9 && countColum<=99){ 
            digCero="00";
        }else if(countColum>99 && countColum<=999){
            digCero="0";
        }else if(countColum>999){
            digCero="";
        }
        fClienteEmp.TXTcod_clienteEmpresa.setText("CLE" + digCero + countColum);
    }
        
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==fClienteEmp.BTnuevoClienteE){
            
            limpiar();
            updateCodigoCliente();
            lockTXT(true);
            
            
            fClienteEmp.BTguardar.setEnabled(true);  //HABILITAR BOTON GUARDAR
            fClienteEmp.BTactualizar.setEnabled(false);  //DESHABILITAR BOTON ACTUALIZAR
            
        }else if(e.getSource()==fClienteEmp.BTguardar){
            
            if(fClienteEmp.TXTnombres.getText().isEmpty() || fClienteEmp.TXTrucEmpresa.getText().isEmpty() || fClienteEmp.TXTdireccionCliente.getText().isEmpty()){
                
                JOptionPane.showMessageDialog(null, "Falta ingresar datos");
                
            }else{
                
                clEmp.setCodClEmpresa(fClienteEmp.TXTcod_clienteEmpresa.getText());
                clEmp.setNomClEmpresa(fClienteEmp.TXTnombres.getText());
                clEmp.setRucEmpresa(fClienteEmp.TXTrucEmpresa.getText());
                clEmp.setDirecClEmpresa(fClienteEmp.TXTdireccionCliente.getText());

                // Guardando registro      
                crudClienteEmp.GuardarRegistro(clEmp.getCodClEmpresa(), clEmp.getNomClEmpresa(), clEmp.getRucEmpresa(), clEmp.getDirecClEmpresa());
                limpiar();
                cargarTablaCliente();
                updateCodigoCliente();
            }
            
        }else if(e.getSource()==fClienteEmp.BTactualizar){
            clEmp.setCodClEmpresa(fClienteEmp.TXTcod_clienteEmpresa.getText());
            clEmp.setNomClEmpresa(fClienteEmp.TXTnombres.getText());
            clEmp.setRucEmpresa(fClienteEmp.TXTrucEmpresa.getText());
            clEmp.setDirecClEmpresa(fClienteEmp.TXTdireccionCliente.getText());
        
            crudClienteEmp.actualizarRegistro(clEmp.getCodClEmpresa(), clEmp.getNomClEmpresa(), clEmp.getRucEmpresa(), clEmp.getDirecClEmpresa());
            limpiar();
            cargarTablaCliente();
            updateCodigoCliente();
            
        }else if(e.getSource()==fClienteEmp.BTlimpiar){
            limpiar();
        }
            
    }
    
     public void TBLclienteMouseClicked(MouseEvent evt){
        
        fClienteEmp.BTguardar.setEnabled(false);   //DESHABILITAR BOTON GUARDAR
        fClienteEmp.BTactualizar.setEnabled(true);  //HABILITAR BOTON ACTUALIZAR
        //EDITANDO CAMPOS
        lockTXT(true);
        
        int fila=fClienteEmp.TBLclientesEmpresa.getSelectedRow();
        String selectCodCl=fClienteEmp.TBLclientesEmpresa.getValueAt(fila, 0).toString();
        
        String[] valor = crudClienteEmp.selecItemTable(selectCodCl);
        
        fClienteEmp.TXTcod_clienteEmpresa.setText(valor[0]);
        fClienteEmp.TXTnombres.setText(valor[1]);
        fClienteEmp.TXTrucEmpresa.setText(valor[2]);
        fClienteEmp.TXTdireccionCliente.setText(valor[3]);
    }   
    
    
}
