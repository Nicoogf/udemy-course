package dominio;

import java.util.*;

public class MoviesColection {
    private String nameColection ;
    private List<Movie> listMovies ;
    private final String uuidColection = UUID.randomUUID().toString() ;

    private static int countColection ;

    public MoviesColection( String name ) {
        if( name.isBlank() || name == null) {
            throw new IllegalArgumentException("Null / / empty fields are not allowed") ;
        }
        this.nameColection = name ;
        this.listMovies = new ArrayList<Movie>() ;
        countColection++ ;
    }

    public String getNameColection() {
        return nameColection;
    }

    public void setNameColection(String nameColection) {
        this.nameColection = nameColection;
    }

    public List<Movie> getListMovies() {
        return Collections.unmodifiableList(this.listMovies) ;
    }

    public String getUuidColection() {
        return uuidColection;
    }

    public static int getCountColection() {
        return countColection;
    }

    public void addMovieToList(Movie movieAdd) {
        this.listMovies.add(movieAdd) ;
    }

    public void deleteMovieToList(String uuidMovie) {
        Iterator<Movie> listMovieIterator = this.listMovies.iterator() ;
        while( listMovieIterator.hasNext() ) {
            Movie m = listMovieIterator.next() ;
            if( m.getUuid().equals(uuidMovie)){
                listMovieIterator.remove();
            }
        }
    }
}
