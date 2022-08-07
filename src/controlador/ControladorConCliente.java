package controlador;
//LIBRERIA
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
//MODULOS
import vista.form_ConsultaClientes;
import DAO.CRUDconCliente;
public class ControladorConCliente implements ActionListener{
    //    atributos
    form_ConsultaClientes fConCl;
    ControladorBoleta conBol;
    CRUDconCliente crudConCliente=new CRUDconCliente();
    
//    CONSTRUCTOR
    public ControladorConCliente(form_ConsultaClientes fconcliente, ControladorBoleta cBl) {
        fConCl=fconcliente;
        fConCl.BTbuscar.addActionListener(this);
        fConCl.BTmostrarTodo.addActionListener(this);
        fConCl.enviarDatos.addActionListener(this);
        conBol=cBl;
        cargarTablaProd();
        
    }    

     //Cargar los datos del DB a al Jtabla 
    private void cargarTablaProd(){
        DefaultTableModel modeloTabla=(DefaultTableModel) fConCl.TBLclientes.getModel();
        modeloTabla.setRowCount(0);
        
        crudConCliente.seleccionarRegistro(modeloTabla);
    }    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==fConCl.BTbuscar){
                
            DefaultTableModel modeloTabla=(DefaultTableModel) fConCl.TBLclientes.getModel();
            modeloTabla.setRowCount(0);
                
            if(fConCl.CBtipoBusqueda.getSelectedItem().equals("CODIGO CLIENTE")){
                
                crudConCliente.busqCodCliente(modeloTabla, fConCl.TXTbuscador.getText());
                
            }else if(fConCl.CBtipoBusqueda.getSelectedItem().equals("NOMBRE CLIENTE")){
                
                crudConCliente.busqNomCliente(modeloTabla, fConCl.TXTbuscador.getText());
                
            }else if(fConCl.CBtipoBusqueda.getSelectedItem().equals("DOCUMENTO")){
                
                crudConCliente.busqDocCliente(modeloTabla, fConCl.TXTbuscador.getText());
            }
            
        }else if(e.getSource()==fConCl.BTmostrarTodo){
            cargarTablaProd();
        
        }else if(e.getSource()==fConCl.enviarDatos){
            int fila=fConCl.TBLclientes.getSelectedRow();
            String selectCodCliente=fConCl.TBLclientes.getValueAt(fila, 0).toString();
            String[] valor=crudConCliente.selecItemTable(selectCodCliente);
            
            conBol.fBoleta.TXTcod_cliente.setText(valor[0]); 
            conBol.fBoleta.TXTnombreCliente.setText(valor[1]); 
            conBol.fBoleta.TXTapellidoCliente.setText(valor[2]); 
            conBol.fBoleta.TXTdniOpasaporte.setText(valor[4]); 
            conBol.fBoleta.TXTdireccion.setText(valor[5]); 
            JOptionPane.showMessageDialog(null, "DATOS ENVIADOS");

        }
    }
    
}
