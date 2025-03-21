package spotify;

import java.util.Arrays;

public class Playlist {

    private String nombre ;
    private static int idPlaylist ;
    private static int cantidadDeplaylist ;
    private Song[] listadoDeCanciones ;
    private int cantidadDeCanciones = 0 ;
    private final int CANTIDAD_MAXIMA = 5 ;


    public Playlist( String nombre , Song[] listadoDeCanciones){
        this.nombre = nombre ;
        this.listadoDeCanciones = listadoDeCanciones ;
        this.idPlaylist = idPlaylist++ ;
        ++cantidadDeplaylist ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getIdPlaylist() {
        return idPlaylist;
    }

    public static int getCantidadDeplaylist() {
        return cantidadDeplaylist;
    }

    @Override
    public String toString() {
       String resultado = "Playlist \n" ;
       for( int i = 0 ; i < listadoDeCanciones.length ; i++) {
           resultado += "\t" + listadoDeCanciones[i].getArtist() + " " + listadoDeCanciones[i].getTitle() + "\n";
       }
       return resultado ;
    }

   public void AddSong( Song songAdd ){
       if( cantidadDeCanciones >= listadoDeCanciones.length) {
           System.out.println("Ya alcanzo el maximo");
       }else{
           listadoDeCanciones[cantidadDeCanciones++]= songAdd ;
           System.out.println("Cancion agregada");
       }
   }

   public void MostrarDetalles(){
       System.out.println("Playlist :\n");
       for( int i = 0 ;  i < listadoDeCanciones.length ; i++) {
           System.out.println( listadoDeCanciones[i].getArtist() + " - " + listadoDeCanciones[i].getTitle());
       }
   }
}