package modelo;
public class Factura extends ComprobantePago{
    ClienteEmpresa clEmpresa=new ClienteEmpresa();
    DetallesComprobante detalles=new DetallesComprobante();
    private static final double IGV=0.18;
    private float total;
    private float subtotal;
    public Factura() {
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    } 
    
    public double calSubtotal() {
//        total+= detalles.importeTotal();
        return this.total/1.18;
    }
    
    public double calcularIgv() {
        return calSubtotal()*IGV;
    }
    @Override
    public double calcularTotal() {
        return calSubtotal() + calcularIgv();
    }
    @Override
    public String toString(){
        return "\nCOD. BOLETA:       " + super.codigoComprobante +
               "\nCOD. CLIENTE:      " + clEmpresa.getCodClEmpresa()+
               "\nNOMBRE CLIENTE:    " + clEmpresa.getNomClEmpresa() +
               "\nRUC:               " + clEmpresa.getRucEmpresa()+
               "\nDIRECCION:         " + clEmpresa.getDirecClEmpresa()+
               "\nDETALLES:          " + 
                detalles.detComprobante() +
               "\nSUBTOTAL:          " + calSubtotal() +
               "\nIGV (18%):         " + calcularIgv() +
               "\nTOTAL:             " + calcularTotal() +
               super.toString();
    }
}
