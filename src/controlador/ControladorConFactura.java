package controlador;
//LIBRERIA
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

//MODULOS
import vista.form_ConsultasFacturas;
import vista.form_detallesFacturas;
import modelo.Factura;
import DAO.CRUDconFactura;

public class ControladorConFactura implements ActionListener{
        
//    ATRIBUTOS
    Factura cfact = new Factura();
    form_ConsultasFacturas fConFact;
    form_detallesFacturas fDetFactura=new form_detallesFacturas();
    CRUDconFactura crudConFact=new CRUDconFactura();
    DefaultTableModel modeloTabla=null;
    DefaultTableModel modelTblDetFact=null;
    
//    CONSTRUCTOR    
    ControladorConFactura(form_ConsultasFacturas fconFactura){
        fConFact=fconFactura;
        modeloTabla=(DefaultTableModel) fConFact.TBLregistroFacturas.getModel();
        modelTblDetFact=(DefaultTableModel) fDetFactura.TBLdetallesFactura.getModel();
        fConFact.BTbuscarFactura.addActionListener(this);
        fConFact.BTmostrarTodo.addActionListener(this);
        fConFact.MIverDetalles.addActionListener(this); 
        cargarTablaProd();
    }
    
//Cargar los datos del DB a al Jtabla 
    private void cargarTablaProd(){
        modeloTabla.setRowCount(0);
        crudConFact.seleccionarRegistro(modeloTabla);
    } 
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==fConFact.BTbuscarFactura){
            modeloTabla.setRowCount(0);
                
            if(fConFact.CBtipoBusqueda.getSelectedItem().equals("CODIGO FACTURA")){
                
                crudConFact.busqCodFactura(modeloTabla, fConFact.TXTbuscador.getText());
                
            }else if(fConFact.CBtipoBusqueda.getSelectedItem().equals("CODIGO CLIENTE")){
                
                crudConFact.busqCodCliente(modeloTabla, fConFact.TXTbuscador.getText());
                
            }
            
        }else if(e.getSource()==fConFact.BTmostrarTodo){
            
            cargarTablaProd();
        
        }else if(e.getSource()==fConFact.MIverDetalles){
            
            
            fDetFactura.setVisible(true);
            fDetFactura.setLocationRelativeTo(null);
            
            int fila=fConFact.TBLregistroFacturas.getSelectedRow();
            String selectCodFac=fConFact.TBLregistroFacturas.getValueAt(fila, 0).toString();
            String[] valor=crudConFact.selecItemTable(selectCodFac); 
            
            fDetFactura.TXTnFactura.setText(valor[0]); 
            fDetFactura.TXTcod_Empresa.setText(valor[1]); 
            fDetFactura.TXTcodUsuario.setText(valor[2]); 
            fDetFactura.TXTfecha.setText(valor[3]); 
            fDetFactura.TXTtipoMoneda.setText(valor[4]); 
            fDetFactura.TXTtipoPago.setText(valor[5]); 
            fDetFactura.TXTsubtotal.setText(valor[6]); 
            fDetFactura.TXTigv.setText(valor[7]); 
            fDetFactura.TXXtotal.setText(valor[8]); 
            fDetFactura.TXTestado.setText(valor[9]); 
            
            crudConFact.cargarDetalles(modelTblDetFact,selectCodFac);
        }
    }
    
}
