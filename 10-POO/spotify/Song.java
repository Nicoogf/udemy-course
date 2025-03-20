package spotify;

public class Song {
    private int idSong;
    private String title ;
    private String artist ;
    private int duration  ; //En segundos

    public Song(String title , String artist , int duration){
        this.idSong = ++idSong ;
        this.title = title ;
        this.artist = artist ;
        this.duration = duration ;
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

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIdSong() {
        return this.idSong;
    }

}
