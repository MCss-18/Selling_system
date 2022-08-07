package controlador;
//LIBRERIA
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

//MODULOS
import vista.form_ConsultasBoletas;
import vista.form_detallesBoletas;
import modelo.Boleta;
import DAO.CRUDconBoleta;

public class ControladorConBoleta implements ActionListener{
    
    //    atributos
    Boleta cbol = new Boleta();
    form_ConsultasBoletas fConBol;
    form_detallesBoletas fDetBoleta=new form_detallesBoletas();
    CRUDconBoleta crudConBol=new CRUDconBoleta();
    DefaultTableModel modeloTabla=null;
    DefaultTableModel modelTblDetBol=null;
//    CONSTRUCTOR
    public ControladorConBoleta(form_ConsultasBoletas fconBoleta) {
        fConBol=fconBoleta;
        modeloTabla=(DefaultTableModel) fConBol.TBLregistroBoletas.getModel();
        modelTblDetBol=(DefaultTableModel) fDetBoleta.TBLdetallesBoleta.getModel();
        fConBol.BTbuscar.addActionListener(this);
        fConBol.BTmostrarTodo.addActionListener(this);
        fConBol.MIverDetalles.addActionListener(this); 
        cargarTablaProd();
    }

//Cargar los datos del DB a al Jtabla 
    private void cargarTablaProd(){
        
        modeloTabla.setRowCount(0);
        crudConBol.seleccionarRegistro(modeloTabla);
    }   
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==fConBol.BTbuscar){
            modeloTabla.setRowCount(0);
                
            if(fConBol.CBtipoBusqueda.getSelectedItem().equals("CODIGO BOLETA")){
                
                crudConBol.busqCodBoleta(modeloTabla, fConBol.TXTbuscador.getText());
                
            }else if(fConBol.CBtipoBusqueda.getSelectedItem().equals("CODIGO CLIENTE")){
                
                crudConBol.busqCodCliente(modeloTabla, fConBol.TXTbuscador.getText());
                
            }
            
        }else if(e.getSource()==fConBol.BTmostrarTodo){
            cargarTablaProd();
        }else if(e.getSource()==fConBol.MIverDetalles){
            
            
            fDetBoleta.setVisible(true);
            fDetBoleta.setLocationRelativeTo(null);
            
            int fila=fConBol.TBLregistroBoletas.getSelectedRow();
            String selectCodBol=fConBol.TBLregistroBoletas.getValueAt(fila, 0).toString();
            String[] valor=crudConBol.selecItemTable(selectCodBol);
            
            fDetBoleta.TXTnBoleta.setText(valor[0]); 
            fDetBoleta.TXTcod_Cliente.setText(valor[1]); 
            fDetBoleta.TXTcodUsuario.setText(valor[2]); 
            fDetBoleta.TXTfecha.setText(valor[3]); 
            fDetBoleta.TXTtipo_moneda.setText(valor[4]); 
            fDetBoleta.TXTtipo_pago.setText(valor[5]); 
            fDetBoleta.TXTtotal.setText(valor[6]); 
            fDetBoleta.TXTestado.setText(valor[7]); 
            
            crudConBol.cargarDetalles(modelTblDetBol,selectCodBol);
        }
    }
    
}
