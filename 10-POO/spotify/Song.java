package spotify ;

public class Song {

    private String name ;
    private String artist ;
    private int duration ;
    private static int songCounter = 0;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public static int getSongCounter() {
        return songCounter;
    }

    public static void setSongCounter(int songCounter) {
        Song.songCounter = songCounter;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Song(String name , String artist , int duration ) {
        this.name = name ;
        this.artist = artist ;
        this.duration = duration ;
        songCounter ++ ;
    }

}