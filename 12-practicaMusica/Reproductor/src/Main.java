import dominio.Album;
import dominio.Cancion;

public class Main {
    public static void main(String[] args) {


        Cancion verteDeCerca = new Cancion("Verte de Cerca" , "Airbag") ;
        Cancion kamikaze =  new Cancion("Kamikaze" , "Airbag") ;

        Album clubDeLaPelea = new Album("El club de la pelea" , "Airbag") ;

        clubDeLaPelea.agregarCancion(verteDeCerca);
        clubDeLaPelea.agregarCancion(kamikaze);

       for (Cancion c : clubDeLaPelea.getListaDeCanciones() ) {
           System.out.println( c.getIdCancion() + "-" + c.getNombre());
       }

       clubDeLaPelea.EliminarCancion(kamikaze.getIdCancion());


        System.out.println("El album actualmente ");

        for (Cancion c : clubDeLaPelea.getListaDeCanciones() ) {
            System.out.println( c.getIdCancion() + "-" + c.getNombre());
        }

    }
}