package controlador;
//LIBRERIAS
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
//MODULOS
import vista.*;
public class controladorMain implements ActionListener{
    
    form_main vistaMain;
    
    public controladorMain(form_main fRCliente) {
        this.vistaMain=fRCliente;
        this.vistaMain.BTregistroClientes.addActionListener(this);
        this.vistaMain.BTregistroProductos.addActionListener(this);
        this.vistaMain.BTregistroClientesEmpresa.addActionListener(this);
        this.vistaMain.BTemitirFactura.addActionListener(this);
        this.vistaMain.BTemitirBoleta.addActionListener(this);
        this.vistaMain.BTconsultaBoletas.addActionListener(this);
        this.vistaMain.BTconsultaFacturas.addActionListener(this);
        this.vistaMain.BTconsultaProductos.addActionListener(this);
        this.vistaMain.BTregistroUsuario.addActionListener(this);
        this.vistaMain.BTsalir.addActionListener(this);
    }
    
    public void showPanel(JPanel pagina){
        
        pagina.setSize(990, 620);
        pagina.setLocation(0, 0);
        this.vistaMain.JPcontenido.removeAll();
        this.vistaMain.JPcontenido.add(pagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        this.vistaMain.JPcontenido.revalidate();
        this.vistaMain.JPcontenido.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==this.vistaMain.BTregistroClientes){
           
           form_registroClientes frCl=new form_registroClientes();
           ControladorCliente controlCL=new ControladorCliente(frCl); 
           showPanel(frCl.getFondo());
           
       }else if(e.getSource()==this.vistaMain.BTregistroProductos){
           
           form_registroProductos frProd=new form_registroProductos();
           ControladorRProd controlProd=new ControladorRProd(frProd);           
           showPanel(frProd.getFondo());
           
       }else if(e.getSource()==this.vistaMain.BTemitirFactura){
           
           form_factura frFac=new form_factura(); 
           ControladorFactura controlFac= new ControladorFactura(frFac, this);
           showPanel(frFac.getFondo());
           
       }else if(e.getSource()==this.vistaMain.BTemitirBoleta){
           
           form_boletas frBol=new form_boletas();
           ControladorBoleta controlBol= new ControladorBoleta(frBol, this);
           showPanel(frBol.getFondo());
     
       }else if(e.getSource()==this.vistaMain.BTregistroUsuario){
           
           form_registroUsuario frUser=new form_registroUsuario();
           ControladorRUsuario controlUser= new ControladorRUsuario(frUser);
           showPanel(frUser.getFondo());
           
       }else if(e.getSource()==this.vistaMain.BTregistroClientesEmpresa){
           
           form_registroClientesEmpresa frRClienteE=new form_registroClientesEmpresa();  
           ControladorClienteEmp controlCLEmp=new ControladorClienteEmp(frRClienteE); 
           showPanel(frRClienteE.getFondo());
       
       }else if(e.getSource()==this.vistaMain.BTconsultaFacturas){
           
           form_ConsultasFacturas frCFact=new form_ConsultasFacturas();
           ControladorConFactura controlConFact=new ControladorConFactura(frCFact);
           showPanel(frCFact.getFondo());
           
       }else if(e.getSource()==this.vistaMain.BTconsultaBoletas){
           
           form_ConsultasBoletas frCBol=new form_ConsultasBoletas();
           ControladorConBoleta controlConBol=new ControladorConBoleta(frCBol);
           showPanel(frCBol.getFondo());
       
       }else if(e.getSource()==this.vistaMain.BTconsultaProductos){
           
           form_ConsultasProductos frCProd=new form_ConsultasProductos();
           ControladorConProd consultaProd = new ControladorConProd(frCProd);
           frCProd.enviarProd.setVisible(false);
           frCProd.jPopupMenu1.setVisible(false);
           showPanel(frCProd.getFondo());
       
       }else if(e.getSource()==this.vistaMain.BTsalir){
           System.exit(0);
       }
    }
}
