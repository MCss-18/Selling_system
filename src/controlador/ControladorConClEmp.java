package controlador;
//LIBRERIA
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
//MODULOS
import vista.form_ConsultasClienteEmpresa;
import DAO.CRUDconClEmpresa;
public class ControladorConClEmp implements ActionListener{
    //    atributos
    form_ConsultasClienteEmpresa fConClEmp;
    ControladorFactura cFct;
    CRUDconClEmpresa crudConClEmpresa=new CRUDconClEmpresa();
    
//  CONSTRUCTOR
    public ControladorConClEmp(form_ConsultasClienteEmpresa fconClE, ControladorFactura cFc) {
        fConClEmp=fconClE;
        fConClEmp.BTbuscar.addActionListener(this);
        fConClEmp.BTmostrarTodo.addActionListener(this);
        fConClEmp.enviarDatosE.addActionListener(this);
        cFct=cFc;
        cargarTablaProd();
        
    }
    
     //Cargar los datos del DB a al Jtabla 
    private void cargarTablaProd(){
        DefaultTableModel modeloTabla=(DefaultTableModel) fConClEmp.TBLclientesEmp.getModel();
        modeloTabla.setRowCount(0);
        
        crudConClEmpresa.seleccionarRegistro(modeloTabla);
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==fConClEmp.BTbuscar){
                
            DefaultTableModel modeloTabla=(DefaultTableModel) fConClEmp.TBLclientesEmp.getModel();
            modeloTabla.setRowCount(0);
                
            if(fConClEmp.CBtipoBusqueda.getSelectedItem().equals("CODIGO CLIENTE")){
                
                crudConClEmpresa.busqCodProd(modeloTabla, fConClEmp.TXTbuscador.getText());
                
            }else if(fConClEmp.CBtipoBusqueda.getSelectedItem().equals("NOMBRE")){
                
                crudConClEmpresa.busqNomCliente(modeloTabla, fConClEmp.TXTbuscador.getText());
                
            }else if(fConClEmp.CBtipoBusqueda.getSelectedItem().equals("RUC")){
                
                crudConClEmpresa.busqRucCliente(modeloTabla, fConClEmp.TXTbuscador.getText());
            }
            
        }else if(e.getSource()==fConClEmp.BTmostrarTodo){
            cargarTablaProd();
        
        }else if(e.getSource()==fConClEmp.enviarDatosE){
            int fila=fConClEmp.TBLclientesEmp.getSelectedRow();
            String selectCodCliente=fConClEmp.TBLclientesEmp.getValueAt(fila, 0).toString();
            String[] valor=crudConClEmpresa.selecItemTable(selectCodCliente);
            
            
            cFct.fFactura.TXTcod_clienteEm.setText(valor[0]);
            cFct.fFactura.TXTnombreEmpresa.setText(valor[1]);
            cFct.fFactura.TXTruc.setText(valor[2]);
            cFct.fFactura.TXTdireccion.setText(valor[3]); 
           
            JOptionPane.showMessageDialog(null, "DATOS ENVIADOS");

        }
    }
        
}
