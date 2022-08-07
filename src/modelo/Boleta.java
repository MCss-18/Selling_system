package modelo;
public class Boleta extends ComprobantePago{
    Cliente cliente=new Cliente();
    DetallesComprobante detalles=new DetallesComprobante();
    private static double total=0;
    public Boleta() {
    }
    @Override
    public double calcularTotal() {
        total+= detalles.importeTotal();
        return total;
    }
    @Override
    public String toString(){
        return "\nCOD. BOLETA:       " + super.codigoComprobante +
               "\nCOD. CLIENTE:      " + cliente.getCodCliente() +
               "\nNOMBRE CLIENTE:    " + cliente.getNomCliente() +
               "\nTIPO DOCUMENTO:    " + cliente.getTipoDocCliente() +
               "\nDOCUMENTO:         " + cliente.getDocCliente() +
               "\nDIRECCION:         " + cliente.getDirecCliente() +
               "\nDETALLES:          " + 
               detalles.detComprobante() +
               "\nTOTAL:             " + calcularTotal() +
               super.toString();
    }
}
