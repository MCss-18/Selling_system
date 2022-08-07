package controlador;
//LIBRERIA
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
//MODULOS
import vista.form_ConsultasProductos;
import modelo.Producto;
import DAO.CRUDconsultaProd;

public class ControladorConProd implements ActionListener{
    //    atributos
    Producto cpd = new Producto();
    form_ConsultasProductos fConProd;
    CRUDconsultaProd crudConProd=new CRUDconsultaProd();
    ControladorBoleta conBole;
    ControladorFactura conFact;
//    CONSTRUCTOR
    public ControladorConProd(form_ConsultasProductos fconProducto) {
        fConProd=fconProducto;
        fConProd.BTbuscar.addActionListener(this);
        fConProd.BTmostrarTodo.addActionListener(this);
        cargarTablaProd();
        
    }
//      CONSTRUCTOR SOBRECARGADO  Control Boleta
    public ControladorConProd(form_ConsultasProductos fconProducto, ControladorBoleta ctrlBoleta) {
        fConProd=fconProducto;
        fConProd.BTbuscar.addActionListener(this);
        fConProd.BTmostrarTodo.addActionListener(this);
        fConProd.enviarProd.addActionListener(this);
        conBole=ctrlBoleta;
        cargarTablaProd();
        
    }    
//      CONSTRUCTOR SOBRECARGADO     Control Factura
    public ControladorConProd(form_ConsultasProductos fconProducto, ControladorFactura ctrlFactura) {
        fConProd=fconProducto;
        fConProd.BTbuscar.addActionListener(this);
        fConProd.BTmostrarTodo.addActionListener(this);
        fConProd.enviarProd.addActionListener(this);
        conFact=ctrlFactura;
        cargarTablaProd();
        
    }     
//Cargar los datos del DB a al Jtabla 
    private void cargarTablaProd(){
        DefaultTableModel modeloTabla=(DefaultTableModel) fConProd.TBLproductos.getModel();
        modeloTabla.setRowCount(0);
        
        crudConProd.seleccionarRegistro(modeloTabla);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==fConProd.BTbuscar){
                
            DefaultTableModel modeloTabla=(DefaultTableModel) fConProd.TBLproductos.getModel();
            modeloTabla.setRowCount(0);
                
            if(fConProd.CBtipoBusqueda.getSelectedItem().equals("CODIGO PRODUCTO")){
                
                crudConProd.busqCodProd(modeloTabla, fConProd.TXTbuscador.getText());
                
            }else if(fConProd.CBtipoBusqueda.getSelectedItem().equals("NOMBRE PRODUCTO")){
                
                crudConProd.busqNomProd(modeloTabla, fConProd.TXTbuscador.getText());
                
            }else if(fConProd.CBtipoBusqueda.getSelectedItem().equals("CATEGORIA")){
                
                crudConProd.busqCatProd(modeloTabla, fConProd.TXTbuscador.getText());
                
            }
            
        }else if(e.getSource()==fConProd.BTmostrarTodo){
            cargarTablaProd();
        }else if(e.getSource()==fConProd.enviarProd){
        
            Object [] datos=new Object[5];
            
            int fila=fConProd.TBLproductos.getSelectedRow();
            String selectCodCliente=fConProd.TBLproductos.getValueAt(fila, 0).toString();
            String[] valor=crudConProd.selecItemTable(selectCodCliente);
            float precio=Float.parseFloat(valor[4]);
            int cantProd=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto " + selectCodCliente));          
            float importe=cantProd*precio;

            datos[0]=valor[0];
            datos[1]=valor[1];
            datos[2]=precio;
            datos[3]=cantProd;
            datos[4]=importe; 
            
            if(conBole instanceof ControladorBoleta){
                conBole.modeloTblPrd.addRow(datos);
                System.out.println("EStas enviado a la tblprod de boleta");
            }else if(conFact instanceof ControladorFactura){
                conFact.modeloTblPrd.addRow(datos);
                System.out.println("EStas enviado a la tblprod de FACURA");
            }
                    
            
            
            JOptionPane.showMessageDialog(null, "DATOS ENVIADOS: " + datos[0]);
        }
    }
    
}
