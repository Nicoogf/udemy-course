
package dominio ;

import java.util.*;

public class Album {
    private String nombre ;
    private String artista ;
    private List<Cancion> listaDeCanciones ;

    private int idAlbum ;
    private final String uuidAlbum = UUID.randomUUID().toString() ;

    private static int contadorAlbumes = 0 ;


    public Album( String nombre , String artista ) {
        if( nombre == null || nombre.isBlank() || artista == null || artista.isBlank()) {
            throw new IllegalArgumentException("Los campos no pueden estar vacios ni ser nulos ") ;
        }
        this.nombre = nombre;
        this.artista = artista ;
        this.idAlbum = ++contadorAlbumes ;
        this.listaDeCanciones = new ArrayList<Cancion>() ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public List<Cancion> getListaDeCanciones() {
        return Collections.unmodifiableList(this.listaDeCanciones);
    }

    public void setListaDeCanciones(List<Cancion> listaDeCanciones) {
        this.listaDeCanciones = listaDeCanciones;
    }

    public int getIdAlbum() {
        return idAlbum;
    }

    public String getUuidAlbum() {
        return uuidAlbum;
    }

    public static int getContadorAlbumes() {
        return contadorAlbumes;
    }

    public void MostrarListado() {
        StringBuilder detallesAlbum = new StringBuilder() ;
        for( Cancion c : listaDeCanciones) {
            detallesAlbum.append(c.getIdCancion())
                    .append(")")
                    .append(c.getArtista())
                    .append(" - ")
                    .append(c.getNombre()) ;
        }
        System.out.println(detallesAlbum);
    }

    public void agregarCancion( Cancion cancionAgregada ) {
        this.listaDeCanciones.add(cancionAgregada) ;
    }

    public void eliminarCancion(int idSongInt) {
        int cantidadAntes = this.listaDeCanciones.size() ;

        Iterator<Cancion> iterator = this.listaDeCanciones.iterator();
        while (iterator.hasNext()) {
            Cancion c = iterator.next();
            if (c.getIdCancion() == idSongInt) {
                iterator.remove();
            }
        }

        int cantidadDespues = this.listaDeCanciones.size();

        System.out.println("El álbum tenía: " + cantidadAntes);
        System.out.println("Y ahora tiene: " + cantidadDespues);
    }

}
