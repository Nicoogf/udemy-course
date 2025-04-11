package servicio;

import dominio.Album;
import dominio.Cancion;

import java.util.ArrayList;
import java.util.List;

public class AlbumService {

    public void AgregarCancionSiNoExiste(Album album, Cancion cancionAgregada) {
        for (Cancion c : album.getListaDeCanciones()) {
            if (c.getNombre().equalsIgnoreCase(cancionAgregada.getNombre())) {
                System.out.println("Ya existe una cancion con ese nombre");
                return;
            }
        }
        album.agregarCancionDirectamente(cancionAgregada);
    }

    public void EliminarCancion(Album album, int cancionID) {
        for (Cancion c : album.getListaDeCanciones()) {
            if (c.getIdCancion() == cancionID) {
                album.EliminarCancion(c.getIdCancion());
                System.out.println("Se elimino cancion con el id : " + cancionID);
            }
        }
    }


}