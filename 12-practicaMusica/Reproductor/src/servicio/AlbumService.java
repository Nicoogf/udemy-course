package servicio;


import dominio.Album;
import dominio.Cancion;

import java.util.Iterator;

public class AlbumService {


public void AgregarSiNoExiste( Album album , Cancion cancionAgregada ){
       boolean yaExiste = false ;

     for( Cancion c : album.getListaDeCanciones()){
         if(c.getNombre().equalsIgnoreCase(cancionAgregada.getNombre()) ){
             yaExiste = true ;
             break;
         }
       }

        if(yaExiste){
            System.out.println("La cancion ya se encuentra en la playlist");
        }else{
            album.agregarCancion(cancionAgregada);
            System.out.println("Canción agregada con éxito.");
        }

    }

public void EliminarCancionSiExiste( Album album , int idSong ){
      boolean fueEncontrado = false ;
      Iterator<Cancion> listadoDeCanciones = album.getListaDeCanciones().iterator() ;

      while ( listadoDeCanciones.hasNext() ){
          Cancion c = listadoDeCanciones.next() ;

          if( c.getIdCancion() == idSong){
              fueEncontrado= true;
              System.out.println("Se elimino cancion con id : " + idSong );
              album.EliminarCancion(idSong);
              break;
          }
      }
    if(!fueEncontrado){
        System.out.println("No se encontro cancion con ese id");
    }
}

}