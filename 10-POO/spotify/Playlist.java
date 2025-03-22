package spotify;
import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private static int cantidadDeCanciones = 0;
    private final int CANTIDAD_MAXIMA = 5 ;

    private String name ;
    private int idPlaylist ;
    private List<Song> listadoDeCanciones ;

    public Playlist( String name ) {
        this.name = name ;
        this.idPlaylist =  cantidadDeCanciones;
        this.listadoDeCanciones = new ArrayList<Song>() ;
    }


    public void AddSong( Song songAdd) {
        if( this.listadoDeCanciones.size() < CANTIDAD_MAXIMA ) {
            this.listadoDeCanciones.add(songAdd) ;
            int posicionEnArreglo = this.listadoDeCanciones.size() - 1 ;
            songAdd.setIdSong(Integer.toString(posicionEnArreglo));
            songAdd.setNumeroDeCancion(posicionEnArreglo+1);
            System.out.println("✅ La canción : " + songAdd.getTitle() + " fue agregada con exito");
        }else{
            System.out.println("❌ Superaste el máximo posible");
        }
    }

    @Override
    public String toString(){
        String resultado = "Playlist : " + this.name + "\n";
        resultado += "\t Contiene : " + cantidadDeCanciones  + " canciones \n" ;
        for( int i = 0 ; i < listadoDeCanciones.size() ; i++) {
            resultado += "\t\t" + "(" + listadoDeCanciones.get(i).getIdSong() +")" +" - " + listadoDeCanciones.get(i).getNumeroDeCancion()+" - " + listadoDeCanciones.get(i).getArtist() + " - " + listadoDeCanciones.get(i).getTitle() + "\n";
        }
        return resultado ;
    }
}