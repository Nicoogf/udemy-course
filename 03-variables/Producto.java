public class Producto {
    public static void main(String[] args) {

        String nombre = "Paco Rabanne One Millon Parfum" ;
        float precio = 150 ;

        double indice = Math.random() ;
        int stockActual = (int) (Math.random() * 100 ) ;
        boolean isAvailable = stockActual > 0 ;

        System.out.println(nombre);
        System.out.println(precio);
        System.out.println(stockActual);
        System.out.println(isAvailable);

        System.out.println("Actualizando Informacion del producto...");

        nombre = "Paco Rabanne One Millon Eau Toallet" ;
        precio = 125 ;
        stockActual = 0 ;
        isAvailable = false ;

        System.out.println(nombre);
        System.out.println(precio);
        System.out.println(stockActual);
        System.out.println(isAvailable);

        var segundoNombre = "Nicolas" ;



    }
}
