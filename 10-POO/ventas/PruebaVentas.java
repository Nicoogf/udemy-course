package ventas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("*** Sistemas de ventas ***");
        var producto1 = new Producto("Blusa" , 300) ;
        var producto2 = new Producto("Remera" , 400) ;

        var orden1 = new Orden() ;
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);

        orden1.MostrarOrden();

        var orden2 = new Orden() ;

        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto1);
        orden2.agregarProducto( new Producto("PANTALON AGREGADO" , 800));

        orden2.toString() ;
    }
}
