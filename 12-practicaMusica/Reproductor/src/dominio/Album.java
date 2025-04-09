/* package dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Album {
    private List<Cancion> listadoDeCanciones ;
    private String nombre ;
    private String artista ;
    private final String uuidAlbum = UUID.randomUUID().toString() ;
    private int idAlbum ;
    private static int contadorAlbumes = 0 ;

    public Album (String nombre , String artista ){
        this.listadoDeCanciones = new ArrayList<>() ;
        this.nombre = nombre ;
        this.artista = artista ;
        this.idAlbum = ++contadorAlbumes ;
    }

    public void addSong( Cancion cancionCreada ) {
        if (cancionCreada == null) {
            throw new IllegalArgumentException("No se puede agregar una canción nula.");
        }
        this.listadoDeCanciones.add(cancionCreada) ;
        System.out.println("Se agrego " + cancionCreada.getNombre() + " con exito");
    }

    public void mostrarListadoDeCanciones(){
      StringBuilder resultado = new StringBuilder() ;
      for ( Cancion c : listadoDeCanciones) {
          resultado.append(c.getIdCancion())
                    .append(") ")
                    .append(c.getArtista())
                    .append(" - ")
                    .append(c.getNombre())
                    .append("\n");

      }
        System.out.println(resultado);
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdAlbum() {
        return idAlbum;
    }

    public static int getContadorAlbumes() {
        return contadorAlbumes;
    }

    public String getUuidAlbum() {
        return uuidAlbum;
    }

    public String getArtista() {
        return artista;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Album{" +
                "nombre='" + nombre + '\'' +
                ", artista='" + artista + '\'' +
                ", uuidAlbum='" + uuidAlbum + '\'' +
                ", idAlbum=" + idAlbum +
                '}';
    }

    public List<Cancion> getListadoDeCanciones() {
        return Collections.unmodifiableList(this.listadoDeCanciones);
    }
} */

package dominio ;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
        return listaDeCanciones;
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
}
