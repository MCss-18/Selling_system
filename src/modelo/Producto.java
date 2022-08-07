package modelo;
public class Producto {
    private String codProducto;
    private String descrProducto;
    private String categoriaProducto;
    private int cantProducto;
    private float precioProducto;                                                                  
    private String estadoProducto;
    
    public Producto() {
        
    }
    public String getCodProducto() {
        return codProducto;
    }
    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }
    public String getDescrProducto() {
        return descrProducto;
    }
    public void setDescrProducto(String descrProducto) {
        this.descrProducto = descrProducto;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }
 
    public int getCantProducto() {
        return cantProducto;
    }
    public void setCantProducto(int cantProducto) {
        this.cantProducto = cantProducto;
    }
    public float getPrecioProducto() {
        return precioProducto;
    }
    public void setPrecioProducto(float precioProducto) {
        this.precioProducto = precioProducto;
    }
    public String getEstadoProducto() {
        return estadoProducto;
    }
    public void setEstadoProducto(String estadoProducto) {
        this.estadoProducto = estadoProducto;
    }   
}

