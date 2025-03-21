package spotify;

import java.util.Arrays;

public class Playlist {

    private int idPlaylist ;
    private String name ;
    private static int cantidadDeCanciones = 0 ;
    private Song[] playlistCreada ;
    private final int CANTIDAD_MAXIMA_CANCIONES = 5 ;

    public Playlist( String name) {
        this.idPlaylist = idPlaylist++ ;
        this.name = name ;
        this.playlistCreada = playlistCreada ;
        this.playlistCreada = new Song[CANTIDAD_MAXIMA_CANCIONES] ;
    }

    public void MostrarDatos() {
        System.out.println("Length : " + playlistCreada.length);
        System.out.println("Playlist : ");
        for ( int i = 0 ; i < playlistCreada.length ; i++){
            if( playlistCreada[i] != null) {
                System.out.println("\t" + i + "-" + playlistCreada[i].getArtist() + " - " + playlistCreada[i].getTitle());
            } }
    }

    public void AgregarCancion(Song cancionAgregada) {
        System.out.println("\t Tiene " + cantidadDeCanciones + " canciones");
        if( cantidadDeCanciones < CANTIDAD_MAXIMA_CANCIONES) {
            playlistCreada[cantidadDeCanciones++] = cancionAgregada ;
            System.out.println(cancionAgregada.getTitle() + " Agregada con exito ") ;
        }else{
            System.out.println("Superaste el maximo de canciones");
        }
    }



}