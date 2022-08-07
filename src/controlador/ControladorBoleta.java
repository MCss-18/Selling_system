package controlador;
//LIBRERIAS
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//MODULOS
import vista.form_ConsultaClientes;
import vista.form_ConsultasProductos;
import vista.form_boletas;
import modelo.Boleta;
import DAO.CRUDboleta;
public class ControladorBoleta implements ActionListener{
    
    form_boletas fBoleta;
    CRUDboleta crudBoleta = new CRUDboleta();
    Boleta bl= new Boleta();
    form_ConsultaClientes fConCliente = new form_ConsultaClientes();
    form_ConsultasProductos fConProd = new form_ConsultasProductos();
    ControladorConCliente conCL = new ControladorConCliente(fConCliente, this);
    DefaultTableModel modeloTblPrd=null;
    controladorMain fmain;
//    CONSTRUCTOR
    public ControladorBoleta(form_boletas fBol, controladorMain main) {
        fBoleta=fBol;
        fmain=main;
        fBoleta.BTbuscarCliente.addActionListener(this);
        fBoleta.BTbuscarProducto.addActionListener(this);
        fBoleta.BTeliminar.addActionListener(this); 
        fBoleta.BTelimContTbl.addActionListener(this);
        fBoleta.BTcalcular.addActionListener(this);
        fBoleta.BTrealizarVenta.addActionListener(this); 
        modeloTblPrd=(DefaultTableModel) fBoleta.TBLprodBoleta.getModel();  
        fBoleta.TXTfecha.setText(bl.getFecha());
        cargarCodBoleta();
    }
    public void cargarCodBoleta(){
        int numFilas=crudBoleta.contarRegistros()+1;
        String digCero="000";
        if(numFilas>9 && numFilas<=99){ 
            digCero="00";
        }else if(numFilas>99 && numFilas<=999){
            digCero="0";
        }else if(numFilas>999){
            digCero="";
        }
        fBoleta.TXTnBoleta.setText("BL" + digCero + numFilas);
    }
    private void limpiar(){
        fBoleta.TXTcod_cliente.setText("");
        fBoleta.TXTnombreCliente.setText("");
        fBoleta.TXTapellidoCliente.setText("");
        fBoleta.TXTdireccion.setText("");
        fBoleta.TXTdniOpasaporte.setText("");
        fBoleta.TXTtotalBoleta.setText("");
        for(int i = modeloTblPrd.getRowCount() - 1; i >= 0; i--){
            modeloTblPrd.removeRow(i);
        }
    }    
    
    public void SumarImporteT(){
        float filaTbl=0;
        float total=0;
        for(int i=0;i<fBoleta.TBLprodBoleta.getRowCount(); i++){
            filaTbl=Float.parseFloat(fBoleta.TBLprodBoleta.getValueAt(i,4).toString());
            total+=filaTbl;
        }
        fBoleta.TXTtotalBoleta.setText(String.valueOf(total));
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==fBoleta.BTbuscarCliente){
           
            fConCliente.setVisible(true);
            fConCliente.setLocationRelativeTo(null);
            
        }else if(e.getSource()==fBoleta.BTbuscarProducto){
            ControladorConProd conProd = new ControladorConProd(fConProd, this);
            fConProd.setVisible(true);
            fConProd.setLocationRelativeTo(null);
        }else if(e.getSource()==fBoleta.BTeliminar){
            
            int filaSelec=fBoleta.TBLprodBoleta.getSelectedRow();
            if(filaSelec>=0){
                modeloTblPrd.removeRow(filaSelec); 
            }else{
                JOptionPane.showMessageDialog(null, "SELECCIONAR UNA FILA");
            }
        }else if(e.getSource()==fBoleta.BTelimContTbl){
                limpiar();
        }else if(e.getSource()==fBoleta.BTcalcular){
            
            SumarImporteT();
            
        }else if(e.getSource()==fBoleta.BTrealizarVenta){
            
            String codBol=fBoleta.TXTnBoleta.getText();
            bl.setFecha(fBoleta.TXTfecha.getText());
            bl.setMoneda(fBoleta.CBtipoMoneda.getSelectedItem().toString());
            bl.setTipoPago(fBoleta.CBtipoPago.getSelectedItem().toString());
            float total=Float.parseFloat(fBoleta.TXTtotalBoleta.getText());
            String codUsuario=fmain.vistaMain.LBcodUsuario.getText();
            
            if(fBoleta.TBLprodBoleta.getRowCount()>0){
                
                crudBoleta.guardarRegistro(codBol, fBoleta.TXTcod_cliente.getText(), codUsuario, bl.getFecha(), bl.getMoneda(),bl.getTipoPago(),total, "EMITIDO");
                for(int j=0; j<fBoleta.TBLprodBoleta.getRowCount(); j++){
                    
                    crudBoleta.guardarBolDetalles(codBol, fBoleta.TBLprodBoleta.getValueAt(j, 0).toString(),fBoleta.TBLprodBoleta.getValueAt(j, 1).toString(), Float.parseFloat(fBoleta.TBLprodBoleta.getValueAt(j, 2).toString()),Integer.parseInt(fBoleta.TBLprodBoleta.getValueAt(j, 3).toString()),Float.parseFloat(fBoleta.TBLprodBoleta.getValueAt(j, 4).toString()));
                }
                
                limpiar();
                cargarCodBoleta();
                
            }else{
                JOptionPane.showMessageDialog(null, "AGREGE PRODUCTO A LA BOLETA");
            }
        }
    }
     
}
