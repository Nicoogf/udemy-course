package spotify;

public class Prueba {
    public static void main(String[] args) {

        Song cancion_uno = new Song("Jijiji" , "Patricio Rey" , 342) ;

        String info_cancion_uno = cancion_uno.toString() ;
        System.out.println(info_cancion_uno);

        System.out.println("Actualmente se crearon :  " + Song.getCantidadDeCanciones() + " Canciones ");

    }
}
