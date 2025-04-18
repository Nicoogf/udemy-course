package dominio;

import java.util.UUID;

public class Movie {
    private String name ;
    private String platform ;
    private final String uuid = UUID.randomUUID().toString();

    private static int countMovies ;

    public Movie (String name , String platform ) {
        if( name == null || name.isBlank() || platform.isBlank() || platform == null ){
            throw new IllegalArgumentException("Null or empty fields are not allowed") ;
        }
        this.name = name ;
        this.platform = platform ;
        countMovies ++ ;
    }

    public String getName() {
        return name;
    }


    public static int getCountMovies() {
        return countMovies;
    }


    public String getUuid() {
        return uuid;
    }

    public String getPlatform() {
        return platform;
    }



    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", platform='" + platform + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
