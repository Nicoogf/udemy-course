package dominio ;

import java.util.UUID;

public class Cancion{
    private String nombre ;
    private String artista ;

    private int idCancion = 0;
    private final String uuidCancion = UUID.randomUUID().toString() ;

    private static int contadorCanciones ;

    public Cancion ( String nombre , String artista ){
        if( nombre == null || nombre.isBlank() || artista == null || artista.isBlank() ){
            throw new IllegalArgumentException("Los datos no pueden ser nulos o estar vacios") ;
        }
        this.nombre = nombre ;
        this.artista = artista ;
        this.idCancion = ++contadorCanciones ;
    }

    public String getNombre() { return nombre ; }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getIdCancion() {
        return idCancion;
    }

    public String getUuidCancion() {
        return uuidCancion;
    }

    public static int getContadorCanciones() {
        return contadorCanciones;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "nombre='" + nombre + '\'' +
                ", artista='" + artista + '\'' +
                ", idCancion=" + idCancion +
                ", uuidCancion='" + uuidCancion + '\'' +
                '}';
    }
}