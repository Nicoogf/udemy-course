package spotify;

public class Song {
    private String idSong;
    private int numeroDeCancion ;
    private String title ;
    private String artist ;
    private int duration  ; //En segundos

    public Song(String title , String artist , int duration){
        this.title = title ;
        this.artist = artist ;
        this.duration = duration ;
        this.idSong= "" ;
        this.numeroDeCancion = 0 ;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getNumeroDeCancion() {
        return numeroDeCancion;
    }

    public void setNumeroDeCancion(int numeroDeCancion) {
        this.numeroDeCancion = numeroDeCancion;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIdSong(String idSong) {
        this.idSong = "ubi-" + idSong;
    }

    public String getIdSong() {
        return this.idSong;
    }

    @Override
    public String toString() {
        return "Song{" +
                "idSong=" + idSong +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                '}';
    }
}
