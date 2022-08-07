package controlador;
//LIBRERIAS
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
//MODULOS
import vista.form_factura;
import modelo.Factura;
import vista.form_ConsultasClienteEmpresa;
import vista.form_ConsultasProductos;
import DAO.CRUDfactura;

public class ControladorFactura implements ActionListener{
    
    form_factura fFactura;
    Factura fct = new Factura();
    CRUDfactura crudFactura=new CRUDfactura();
    form_ConsultasClienteEmpresa fConClEmpre = new form_ConsultasClienteEmpresa();  
    form_ConsultasProductos fConProd = new form_ConsultasProductos();
    ControladorConClEmp conCLE = new ControladorConClEmp(fConClEmpre, this);  //El this hace referencia al ControladorFactura
    ControladorConProd conProd = new ControladorConProd(fConProd, this);
    DefaultTableModel modeloTblPrd=null;
    controladorMain fmain;
    
    public ControladorFactura(form_factura fac, controladorMain main) {
        fFactura=fac;
        fmain=main;
        fFactura.BTbuscarCliente.addActionListener(this);
        fFactura.BTbuscarProducto.addActionListener(this);
        fFactura.BTeliminar.addActionListener(this);
        fFactura.BTlimpiarTodo.addActionListener(this);
        fFactura.BTcalcular.addActionListener(this);
        fFactura.BTrealizarVenta.addActionListener(this);
        modeloTblPrd=(DefaultTableModel) fFactura.TBLprodFactura.getModel();  
        fFactura.TXTfecha.setText(fct.getFecha());
        cargarCodFactura();
    }
    
    public void cargarCodFactura(){
        int numFilas=crudFactura.contarRegistros()+1;
        String digCero="000";
        if(numFilas>9 && numFilas<=99){ 
            digCero="00";
        }else if(numFilas>99 && numFilas<=999){
            digCero="0";
        }else if(numFilas>999){
            digCero="";
        }
        fFactura.TXTnFactura.setText("FC" + digCero + numFilas);
    }
    private void limpiar(){
        fFactura.TXTcod_clienteEm.setText("");
        fFactura.TXTnombreEmpresa.setText("");
        fFactura.TXTruc.setText("");
        fFactura.TXTdireccion.setText("");
        fFactura.TXTsubTotal.setText("");
        fFactura.TXTigv.setText("");
        fFactura.TXTtotal.setText("");
        for(int i = modeloTblPrd.getRowCount() - 1; i >= 0; i--){
            modeloTblPrd.removeRow(i);
        }
        
    }  
    
    public void calcularTotal(){
        float filaTbl=0;
        float total=0;
        
        for(int i=0;i<fFactura.TBLprodFactura.getRowCount(); i++){
            filaTbl=Float.parseFloat(fFactura.TBLprodFactura.getValueAt(i,4).toString());
            total+=filaTbl;
        }
    
        fct.setTotal(total);
        fFactura.TXTsubTotal.setText(String.valueOf(fct.calSubtotal()));
        fFactura.TXTigv.setText(String.valueOf(fct.calcularIgv()));
        fFactura.TXTtotal.setText(String.valueOf(fct.calcularTotal()));
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==fFactura.BTbuscarCliente){
            
            fConClEmpre.setVisible(true);
            fConClEmpre.setLocationRelativeTo(null);
            
        }else if(e.getSource()==fFactura.BTbuscarProducto){
  
            fConProd.setVisible(true);
            fConProd.setLocationRelativeTo(null);
            
        }else if(e.getSource()==fFactura.BTeliminar){
            
            int filaSelec=fFactura.TBLprodFactura.getSelectedRow();
            if(filaSelec>=0){
                modeloTblPrd.removeRow(filaSelec); 
            }else{
                JOptionPane.showMessageDialog(null, "SELECCIONAR UNA FILA");
            }
            
        }else if(e.getSource()==fFactura.BTlimpiarTodo){
                limpiar();
        }else if(e.getSource()==fFactura.BTcalcular){
            
            calcularTotal();
        
        }else if(e.getSource()==fFactura.BTrealizarVenta){
            
            String codFactura=fFactura.TXTnFactura.getText();
            fct.setFecha(fFactura.TXTfecha.getText());
            fct.setMoneda(fFactura.CBtipoMoneda.getSelectedItem().toString());
            fct.setTipoPago(fFactura.CBtipoPago.getSelectedItem().toString());
            
            float subtotal=Float.parseFloat(fFactura.TXTsubTotal.getText());
            float igv=Float.parseFloat(fFactura.TXTigv.getText());
            float total=Float.parseFloat(fFactura.TXTtotal.getText());
            String codUsuario=fmain.vistaMain.LBcodUsuario.getText();
            
            if(fFactura.TBLprodFactura.getRowCount()>0){
                
                crudFactura.guardarRegistro(codFactura, fFactura.TXTcod_clienteEm.getText(), codUsuario, fct.getFecha(), fct.getMoneda(),fct.getTipoPago(), subtotal, igv, total, "EMITIDO");
                for(int j=0; j<fFactura.TBLprodFactura.getRowCount(); j++){
                    
                    crudFactura.guardarFacDetalles(codFactura, fFactura.TBLprodFactura.getValueAt(j, 0).toString(),fFactura.TBLprodFactura.getValueAt(j, 1).toString(), Float.parseFloat(fFactura.TBLprodFactura.getValueAt(j, 2).toString()),Integer.parseInt(fFactura.TBLprodFactura.getValueAt(j, 3).toString()),Float.parseFloat(fFactura.TBLprodFactura.getValueAt(j, 4).toString()));
                }
                
                limpiar();
                cargarCodFactura();
                
            }else{
                JOptionPane.showMessageDialog(null, "AGREGE PRODUCTO A LA FACTURA");
            }
            
        }
    }
    
}
