package modelo;
public class Cliente {
    private String codCliente;
    private String nomCliente;
    private String apeCliente;
    private String tipoDocCliente;
    private String docCliente;
    private String direcCliente;

    public Cliente() {
    }

    public String getCodCliente() {
        return codCliente;
    }
    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }
    public String getNomCliente() {
        return nomCliente;
    }
    public String getApeCliente() {
        return apeCliente;
    }
    public void setApeCliente(String apeCliente) {
        this.apeCliente = apeCliente;
    }
    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }
    public String getTipoDocCliente() {
        return tipoDocCliente;
    }
    public void setTipoDocCliente(String tipoDocCliente) {
        this.tipoDocCliente = tipoDocCliente;
    }
    public String getDocCliente() {
        return docCliente;
    }
    public void setDocCliente(String docCliente) {
        this.docCliente = docCliente;
    }

    public String getDirecCliente() {
        return direcCliente;
    }

    public void setDirecCliente(String direcCliente) {
        this.direcCliente = direcCliente;
    }
    
    public Object[] registroClientes(){
        Object[] filaUsuarios={codCliente, nomCliente, apeCliente, tipoDocCliente, docCliente, direcCliente};
        return filaUsuarios;
    }
}
