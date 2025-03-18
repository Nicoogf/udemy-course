package ventas;

public class Producto extends Object{

    private final int idProducto ;
    private String nombre ;
    private int precio ;
    private static int contadorProducto ;

    public Producto (String nombre , int precio ){
        this.nombre = nombre ;
        this.precio = precio ;
        this.idProducto = 0 ;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
