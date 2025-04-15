package dominio;

import java.util.*;

public class AlbumClass {

    private String nameAlbum ;
    private String artistAlbum ;
    private List<SongClass> listSongs ;
    private final String uuidAlbum = UUID.randomUUID().toString() ;

    private static int countAlbum ;

    public AlbumClass( String nameAlbum , String artistAlbum ) {
        if( nameAlbum.isBlank() ||nameAlbum == null || artistAlbum.isBlank() || artistAlbum == null) {
            throw new IllegalArgumentException("No puede recivir campos nulos ") ;
        }
        this.nameAlbum = nameAlbum ;
        this.artistAlbum =artistAlbum ;
        this.listSongs = new ArrayList<SongClass>() ;
        countAlbum ++ ;
    }

    public String getNameAlbum() {
        return nameAlbum;
    }

    public void setNameAlbum(String nameAlbum) {
        this.nameAlbum = nameAlbum;
    }

    public String getArtistAlbum() {
        return artistAlbum;
    }

    public List<SongClass> getListSongs() {
        return Collections.unmodifiableList(this.listSongs);
    }

    public void setListSongs(List<SongClass> listSongs) {
        this.listSongs = listSongs;
    }

    public String getUuidAlbum() {
        return uuidAlbum;
    }

    public static int getCountAlbum() {
        return countAlbum;
    }

    @Override
    public String toString() {
        return "AlbumClass{" +
                "nameAlbum='" + nameAlbum + '\'' +
                ", artistAlbum='" + artistAlbum + '\'' +
                ", listSongs=" + listSongs +
                ", uuidAlbum='" + uuidAlbum + '\'' +
                '}';
    }

    public void agregarCancion( SongClass songAdd ) {
        this.listSongs.add(songAdd) ;
    }

    public void eliminarCancion( String uuidSong) {
        Iterator<SongClass> listCanciones = this.listSongs.iterator() ;
        while ( listCanciones.hasNext() ) {
            SongClass c = listCanciones.next() ;
            if( c.getUuidSong().equalsIgnoreCase(uuidSong) ){
                listCanciones.remove(); ;
            }
        }
    }
}
