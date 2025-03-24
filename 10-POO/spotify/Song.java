package spotify ;

public class Song {
    private int idSong ;
    private String name ;
    private String artist ;
    private int duration ; // En segundos

    private static int cantidadDeCanciones = 0;
    private static int nextID = 1;

    public Song( String name , String artist , int duration ) {
        this.idSong = nextID++ ;
        this.name =  name ;
        this.artist = artist ;
        this.duration = duration ;
        cantidadDeCanciones ++ ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdSong() {
        return idSong;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public static int getCantidadDeCanciones() {
        return cantidadDeCanciones;
    }

    public static int getNextID() {
        return nextID;
    }

    public static void setNextID(int nextID) {
        Song.nextID = nextID;
    }

    @Override
    public String toString() {
        String resultado =  "Cancion : " + this.idSong + "\n";
        resultado += "Nombre : " + this.name + "\n" ;
        resultado += "Artista : " + this.artist + "\n" ;
        resultado += "Duracion : " + this.duration + " segundos " + "\n";
        resultado += "Cantidad de canciones creadas : " + Song.cantidadDeCanciones ;

        return resultado ;
    }

}