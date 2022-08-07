package controlador;
//LIBRERIAS
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
//MODULOS
import vista.form_registroClientes;
import modelo.Cliente;
import DAO.CRUDregisCliente;

public class ControladorCliente implements ActionListener{
//    atributos
    Cliente cl = new Cliente();
    form_registroClientes fCliente;
    CRUDregisCliente crudCliente=new CRUDregisCliente();
//    CONSTRUCTOR
    public ControladorCliente(form_registroClientes fcl) {
        fCliente=fcl;
        fCliente.BTnuevocliente.addActionListener(this);
        fCliente.BTguardar.addActionListener(this);
        fCliente.BTactualizar.addActionListener(this);
        fCliente.BTlimpiar.addActionListener(this);
        fCliente.TBLclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBLclienteMouseClicked(evt);
            }
        });
        
        cargarTablaCliente();
        updateCodigoCliente();
        lockTXT(false);
        
        fCliente.BTguardar.setEnabled(false);    //DESHABILITAR BOTON GUARDAR
        fCliente.BTactualizar.setEnabled(false);  //DESHABILITAR BOTON ACTUALIZAR
        
    }
//    FUNCIONES
    private void limpiar(){
        fCliente.TXTcod_cliente.setText(null);
        fCliente.TXTnombres.setText(null);
        fCliente.TXTapellido.setText(null);
        fCliente.CBtipoDocCliente.setSelectedIndex(0);
        fCliente.TXTdocCliente.setText(null);
        fCliente.TXTdireccionCliente.setText(null);
    }
    
    private void lockTXT(boolean valor){
        fCliente.TXTnombres.setEditable(valor);
        fCliente.TXTapellido.setEditable(valor);
        fCliente.TXTdocCliente.setEditable(valor);
        fCliente.TXTdireccionCliente.setEditable(valor);
        
    }
    
    private void cargarTablaCliente(){
        DefaultTableModel modeloTabla=(DefaultTableModel) fCliente.TBLclientes.getModel();
        modeloTabla.setRowCount(0);
        
        crudCliente.seleccionarRegistro(modeloTabla);
    }
    
//    FUNCION ACT. CODIGO
    private void updateCodigoCliente(){
        DefaultTableModel TPC=(DefaultTableModel) fCliente.TBLclientes.getModel();
        int countColum=fCliente.TBLclientes.getRowCount()+1;
        String digCero="000";
        if(countColum>9 && countColum<=99){ 
            digCero="00";
        }else if(countColum>99 && countColum<=999){
            digCero="0";
        }else if(countColum>999){
            digCero="";
        }
        fCliente.TXTcod_cliente.setText("CL" + digCero + countColum);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==fCliente.BTnuevocliente){
            
            limpiar();
            updateCodigoCliente();
            lockTXT(true);
            
            
            fCliente.BTguardar.setEnabled(true);  //HABILITAR BOTON GUARDAR
            fCliente.BTactualizar.setEnabled(false);  //DESHABILITAR BOTON ACTUALIZAR
            
        }else if(e.getSource()==fCliente.BTguardar){
            
            if(fCliente.TXTnombres.getText().isEmpty() || fCliente.TXTapellido.getText().isEmpty() || fCliente.TXTdocCliente.getText().isEmpty() || fCliente.TXTdireccionCliente.getText().isEmpty()){
                
                JOptionPane.showMessageDialog(null, "Falta ingresar datos");
                
            }else{
                
                cl.setCodCliente(fCliente.TXTcod_cliente.getText());
                cl.setNomCliente(fCliente.TXTnombres.getText());
                cl.setApeCliente(fCliente.TXTapellido.getText());
                cl.setTipoDocCliente(fCliente.CBtipoDocCliente.getSelectedItem().toString());
                cl.setDocCliente(fCliente.TXTdocCliente.getText());
                cl.setDirecCliente(fCliente.TXTdireccionCliente.getText());

//              Guardando registro      
                crudCliente.GuardarRegistro(cl.getCodCliente(), cl.getNomCliente(), cl.getApeCliente(), cl.getTipoDocCliente(), cl.getDocCliente(), cl.getDirecCliente());
                limpiar();
                cargarTablaCliente();
                updateCodigoCliente();
            }
            
        }else if(e.getSource()==fCliente.BTactualizar){
            cl.setCodCliente(fCliente.TXTcod_cliente.getText());
            cl.setNomCliente(fCliente.TXTnombres.getText());
            cl.setApeCliente(fCliente.TXTapellido.getText());
            cl.setTipoDocCliente(fCliente.CBtipoDocCliente.getSelectedItem().toString());
            cl.setDocCliente(fCliente.TXTdocCliente.getText());
            cl.setDirecCliente(fCliente.TXTdireccionCliente.getText());
        
            crudCliente.actualizarRegistro(cl.getCodCliente(), cl.getNomCliente(), cl.getApeCliente(), cl.getTipoDocCliente(), cl.getDocCliente(), cl.getDirecCliente());
            limpiar();
            cargarTablaCliente();
            updateCodigoCliente();
            
        }else if(e.getSource()==fCliente.BTlimpiar){
            limpiar();
        }
    
    }
    
    public void TBLclienteMouseClicked(MouseEvent evt){
        
        fCliente.BTguardar.setEnabled(false);   //DESHABILITAR BOTON GUARDAR
        fCliente.BTactualizar.setEnabled(true);  //HABILITAR BOTON ACTUALIZAR
        //EDITANDO CAMPOS
        lockTXT(true);
        
        int fila=fCliente.TBLclientes.getSelectedRow();
        String selectCodCl=fCliente.TBLclientes.getValueAt(fila, 0).toString();
        
        String[] valor = crudCliente.selecItemTable(selectCodCl);
        
        fCliente.TXTcod_cliente.setText(valor[0]);
        fCliente.TXTnombres.setText(valor[1]);
        fCliente.TXTapellido.setText(valor[2]); 
        fCliente.CBtipoDocCliente.setSelectedItem(valor[3]);
        fCliente.TXTdocCliente.setText(valor[4]);
        fCliente.TXTdireccionCliente.setText(valor[5]);
    }
    
}
