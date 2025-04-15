package dominio;

import java.util.UUID;

public class SongClass {
    private String nameSong ;
    private String artistSong ;
    private final String uuidSong = UUID.randomUUID().toString() ;

    private static int countSong  ;

    public SongClass( String nameSong , String artistSong )  {

        if( nameSong.isBlank() || nameSong == null ||
           artistSong == null  || artistSong.isBlank() ) {
            throw new IllegalArgumentException("No pueden ser nulos") ;
        }
        this.nameSong = nameSong ;
        this.artistSong = artistSong ;
        countSong++ ;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getArtistSong() {
        return artistSong;
    }

    public void setArtistSong(String artistSong) {
        this.artistSong = artistSong;
    }

    public String getUuidSong() {
        return uuidSong;
    }

    public static int getCountSong() {
        return countSong;
    }

    @Override
    public String toString() {
        return "SongClass{" +
                "nameSong='" + nameSong + '\'' +
                ", artistSong='" + artistSong + '\'' +
                ", uuidSong='" + uuidSong + '\'' +
                '}';
    }


}
