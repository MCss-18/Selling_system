package modelo;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
public abstract class ComprobantePago {
    Usuario nombreUsuario=new Usuario();
    Moneda valorMoneda=new Moneda();
    protected String codigoComprobante;
    private String Fecha;
    private String tipoPago;
    private String moneda;
    private String EstadoComprobante;
    public ComprobantePago() {
        SimpleDateFormat fechaS=new SimpleDateFormat("YYYY-MM-dd");
        Date fechaActual=new Date();
        this.Fecha=fechaS.format(fechaActual);
    }    
//      METODO ABSTRACTO
    public abstract double calcularTotal();
//      METODOS PROPIOS
    public String getFecha() {
        return Fecha;
    }
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    public String getEstadoComprobante() {
        return EstadoComprobante;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
    
    public void setEstadoComprobante(String EstadoComprobante) {
        this.EstadoComprobante = EstadoComprobante;
    }
    
    public void definirValorDolar(){
        if(moneda.equals("DOLARES")){
            valorMoneda.setValor(Double.parseDouble(JOptionPane.showInputDialog("Valor del Dolar")));
        }
       
    }
    public String toString(){
        return  "\nTipo de Pago:     " + tipoPago + 
                "\nMONEDA:           " + moneda +
                "\nESTADO:           " + EstadoComprobante +
                "\nEMPLEADO:         " + nombreUsuario.getNombres();
    } 
}
