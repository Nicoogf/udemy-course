package servicio;

import dominio.AlbumClass;
import dominio.SongClass;

import java.util.ArrayList;
import java.util.Iterator;

public class AlbumSongService {

    public void agregarCancionSiNoExiste (AlbumClass album , SongClass song) {
        boolean yaExiste = false ;

        for( SongClass c : album.getListSongs() ) {
            if(c.getUuidSong().equalsIgnoreCase(song.getUuidSong()) || c.getNameSong().equalsIgnoreCase(song.getNameSong()) ){

                yaExiste = true ;
                break;
            }
        }

        if( yaExiste ){
            System.out.println("No se puede agregar, esta cancion ya se encuentra en el album");
        }else{
            album.agregarCancion(song);
        }
    }

    public void eliminarCancionSiExiste( AlbumClass album , String uuidSong) {
        boolean existeTema = false ;
        Iterator<SongClass> listadoDeCanciones = album.getListSongs().iterator() ;

        while ( listadoDeCanciones.hasNext() ) {
            SongClass c = listadoDeCanciones.next() ;
            if( c.getUuidSong().equalsIgnoreCase(uuidSong)) {
                listadoDeCanciones.remove();
                existeTema = true ;
            }
        }

        if(existeTema){
            System.out.println("Se elimino la cancion id " + uuidSong);
        }else{
            System.out.println("No se encontro la cancion");
        }
    }

    public void listarAlbum( AlbumClass albumRecibido ) {
        int countSong = 1 ;
        System.out.println("--- Detalles de " + albumRecibido.getNameAlbum() +" ---");
        for( SongClass c : albumRecibido.getListSongs() ){
            System.out.println( countSong + ") " + c.getArtistSong() + " - " + c.getNameSong() );
            countSong++;
        }
    }

    public void buscarNombreParcial(AlbumClass album , String palabraRecibida ){
        ArrayList<SongClass> cancionesEncontradas = new ArrayList<SongClass>() ;
        int cantidadDeCanciones = 0 ;
        for( SongClass c : album.getListSongs()) {
            if(c.getNameSong().toLowerCase().contains(palabraRecibida.toLowerCase())){
                cancionesEncontradas.add(c) ;
                cantidadDeCanciones++ ;
            }
        }

        if(cantidadDeCanciones == 0){
            System.out.println("No se encontraron coincidencias");
        }else{
            System.out.println("Se encontraron los siguientes temas");
            for( SongClass c : cancionesEncontradas ){
                System.out.println(cantidadDeCanciones + ") " +c.getArtistSong() + "-" + c.getNameSong());
            }
        }
    }
}
