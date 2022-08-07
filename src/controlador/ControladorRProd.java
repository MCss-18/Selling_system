package controlador;
//LIBRERIAS
import DAO.CRUDregistroProd;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//MODULOS
import vista.form_registroProductos;
import modelo.Producto;
public class ControladorRProd implements ActionListener{
    
    Producto pd=new Producto();
    form_registroProductos fRProdu;
    CRUDregistroProd crudProd = new CRUDregistroProd();
    
    public ControladorRProd(form_registroProductos frProductos) {
    
        fRProdu=frProductos;
        fRProdu.BTnuevoProducto.addActionListener(this);
        fRProdu.BTguardar.addActionListener(this);
        fRProdu.BTlimpiar.addActionListener(this);
        fRProdu.BTactualizar.addActionListener(this);
        
        fRProdu.TBLproductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBLproductosMouseClicked(evt);
            }
        });
        
        cargarTablaProd();
        updateCodigoProd();
        lockTXT(false);
        
        fRProdu.BTguardar.setEnabled(false);    //DESHABILITAR BOTON GUARDAR
        fRProdu.BTactualizar.setEnabled(false);  //DESHABILITAR BOTON ACTUALIZAR
        
    }
    
//    FUNCION LIMPIAR
    private void limpiar(){
        fRProdu.TXTdescripcionProd.setText("");
        fRProdu.CBcategoriaProd.setSelectedIndex(0);
        fRProdu.TXTcantidadProd.setText("");
        fRProdu.TXTprecioProd.setText("");
    }
//    FUNCION ACT. CODIGO
    private void updateCodigoProd(){
        DefaultTableModel TPC=(DefaultTableModel) fRProdu.TBLproductos.getModel();
        int countColum=fRProdu.TBLproductos.getRowCount()+1;
        String digCero="000";
        if(countColum>9 && countColum<=99){ 
            digCero="00";
        }else if(countColum>99 && countColum<=999){
            digCero="0";
        }else if(countColum>999){
            digCero="";
        }
        fRProdu.TXTcod_prod.setText("PD" + digCero + countColum);
    }
    
 //Cargar los datos del DB a al Jtabla 
    private void cargarTablaProd(){
        DefaultTableModel modeloTabla=(DefaultTableModel) fRProdu.TBLproductos.getModel();
        modeloTabla.setRowCount(0);
        
        crudProd.seleccionarRegistro(modeloTabla);
        
    }
    
    private void lockTXT(boolean valor){
        fRProdu.TXTdescripcionProd.setEditable(valor);
        fRProdu.TXTcantidadProd.setEditable(valor);
        fRProdu.TXTprecioProd.setEditable(valor);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==fRProdu.BTnuevoProducto){
            
            lockTXT(true);
            limpiar();
            updateCodigoProd();
            fRProdu.BTguardar.setEnabled(true);  //HABILITAR BOTON GUARDAR
            fRProdu.BTactualizar.setEnabled(false);  //DESHABILITAR BOTON ACTUALIZAR
            
        }else if(e.getSource()==fRProdu.BTguardar){
            
            //validando el contenido de los campos
            if(fRProdu.TXTdescripcionProd.getText().isEmpty() || fRProdu.TXTcantidadProd.getText().isEmpty() || fRProdu.TXTprecioProd.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Falta ingresar datos");
            }else{
                              
                pd.setCodProducto(fRProdu.TXTcod_prod.getText());
                pd.setDescrProducto(fRProdu.TXTdescripcionProd.getText());
                pd.setCategoriaProducto(fRProdu.CBcategoriaProd.getSelectedItem().toString());
                pd.setCantProducto(Integer.parseInt(fRProdu.TXTcantidadProd.getText()));
                pd.setPrecioProducto(Float.parseFloat(fRProdu.TXTprecioProd.getText()));
                
                crudProd.GuardarRegistro(pd.getCodProducto(), pd.getDescrProducto(), pd.getCategoriaProducto(), pd.getCantProducto(), pd.getPrecioProducto());
                limpiar();
                cargarTablaProd();
                updateCodigoProd();
    
            }
            
        }else if(e.getSource()==fRProdu.BTactualizar){
            
            pd.setCodProducto(fRProdu.TXTcod_prod.getText());
            pd.setDescrProducto(fRProdu.TXTdescripcionProd.getText());
            pd.setCategoriaProducto(fRProdu.CBcategoriaProd.getSelectedItem().toString());
            pd.setCantProducto(Integer.parseInt(fRProdu.TXTcantidadProd.getText()));
            pd.setPrecioProducto(Float.parseFloat(fRProdu.TXTprecioProd.getText()));
            
            crudProd.actualizarRegistro(pd.getCodProducto(), pd.getDescrProducto(), pd.getCategoriaProducto(), pd.getCantProducto(), pd.getPrecioProducto());
            
            limpiar();
            cargarTablaProd();
            updateCodigoProd();
            
        }else if(e.getSource()==fRProdu.BTlimpiar){
            limpiar();
        }
        
    }
    
    public void TBLproductosMouseClicked(MouseEvent evt){
      
        fRProdu.BTguardar.setEnabled(false);   //DESHABILITAR BOTON GUARDAR
        fRProdu.BTactualizar.setEnabled(true);  //HABILITAR BOTON ACTUALIZAR
        //EDITANDO CAMPOS
        lockTXT(true);
        int fila=fRProdu.TBLproductos.getSelectedRow();
        String selectCodProd=fRProdu.TBLproductos.getValueAt(fila, 0).toString();
        
        String[] valor=crudProd.selecItemTable(selectCodProd);
        
        fRProdu.TXTcod_prod.setText(valor[0]);
        fRProdu.TXTdescripcionProd.setText(valor[1]);
        fRProdu.CBcategoriaProd.setSelectedItem(valor[2]); 
        fRProdu.TXTprecioProd.setText(valor[3]);
        fRProdu.TXTcantidadProd.setText(valor[4]);
//        fRProdu.CBcategoriaProd.setSelectedItem(valor[5]);
        
    }
    
    
}
