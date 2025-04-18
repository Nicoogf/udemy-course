package servicio;

import dominio.Movie;
import dominio.MoviesColection;

import java.util.Iterator;

public class MoviesColectionService {

    public void addMovieIfNotExist(MoviesColection colection , Movie movieAdd) {
        boolean alreadyExists = false ;
        for( Movie m : colection.getListMovies() ){
            if(movieAdd.getName().equalsIgnoreCase(m.getName()) ||
               movieAdd.getUuid().equals(m.getUuid()) ){
                System.out.println("The movie already exist");
                alreadyExists = true ;
                break;
            }
        }

        if(alreadyExists) {
            System.out.println("No add movie because already exist");
        }else{
            colection.addMovieToList(movieAdd);
        }

    }

    public void  deleteMovieIfExist( MoviesColection colection , String uuidMovie ) {
        boolean alreadyExist = false ;
        Iterator<Movie> listMovies = colection.getListMovies().iterator() ;

        while (listMovies.hasNext() ){
            Movie m = listMovies.next() ;
            if( m.getUuid().equals(uuidMovie) ){
                listMovies.remove();
                alreadyExist = true ;
            }

        }

        if( !alreadyExist ) {
            System.out.println("Dont delete movies");
        }

        if( alreadyExist ){
          colection.deleteMovieToList(uuidMovie);
        }



    }
}
