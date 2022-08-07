package modelo;
public class ClienteEmpresa {
    private String codClEmpresa;
    private String nomClEmpresa;
    private String rucEmpresa;
    private String direcClEmpresa;
    public ClienteEmpresa() {
    }
    public String getCodClEmpresa() {
        return codClEmpresa;
    }
    public void setCodClEmpresa(String codClEmpresa) {
        this.codClEmpresa = codClEmpresa;
    }
    public String getNomClEmpresa() {
        return nomClEmpresa;
    }
    public void setNomClEmpresa(String nomClEmpresa) {
        this.nomClEmpresa = nomClEmpresa;
    }
    public String getRucEmpresa() {
        return rucEmpresa;
    }
    public void setRucEmpresa(String rucEmpresa) {
        this.rucEmpresa = rucEmpresa;
    }
    public String getDirecClEmpresa() {
        return direcClEmpresa;
    }
    public void setDirecClEmpresa(String direcClEmpresa) {
        this.direcClEmpresa = direcClEmpresa;
    }
    public Object[] registroClienteEmpresa(){
        Object[] filaUsuarios={codClEmpresa, nomClEmpresa, rucEmpresa, direcClEmpresa};
        return filaUsuarios;
    }
}
