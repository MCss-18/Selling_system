package modelo;
public class DetallesComprobante {
    
    Producto producto=new Producto();
    
    public int cantElegidaProd; 
    
    public double importeTotal(){
        return producto.getPrecioProducto()*cantElegidaProd;
    }
 
    public Object[] detComprobante(){
        Object[] filaProductos={producto.getCodProducto(), producto.getDescrProducto(), producto.getCategoriaProducto(), cantElegidaProd, producto.getPrecioProducto(), importeTotal()};
        return filaProductos;
    }

}
