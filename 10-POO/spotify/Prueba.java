package spotify;

public class Prueba {
    public static void main(String[] args) {

        var fistSong = new Song("Intoxicarme" , "Airbag" , 210) ;
        var secondSong = new Song("Pensamientos" , "Airbag" , 249) ;
        var thirdSong = new Song("Cuchillos" , "Airbag" , 187) ;
        var fourthSOng = new Song("Campos Eliseos" , "Airbag" , 205) ;
        var fiveSong =  new Song("Volver a casa" , "Airbag" , 211) ;
        var primerPlaylist = new Playlist("APTHSUT") ;

        primerPlaylist.MostrarDatos();

        primerPlaylist.AgregarCancion(new Song("Club de la pelea" , "Airbag" , 411));

        primerPlaylist.MostrarDatos();
    }
}
