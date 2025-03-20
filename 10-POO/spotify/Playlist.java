package spotify;

public class Playlist {
    private static int contadorListas = 0;
    private int idList;
    private String nameList;
    private Song[] playlist;
    private int contadorCanciones = 0; // Controla cuántas canciones se han agregado
    private final int CANCIONES_POR_ALBUM = 5;

    public Playlist(String nameList) {
        this.idList = ++contadorListas; // Generar ID único para cada playlist
        this.nameList = nameList;
        this.playlist = new Song[CANCIONES_POR_ALBUM];
    }

    public void AddSong(Song songAdd) {
        if (contadorCanciones < CANCIONES_POR_ALBUM) {
            this.playlist[contadorCanciones++] = songAdd; // Agregar canción y aumentar contador
            System.out.println("Canción agregada a la playlist: " + nameList);
            System.out.println("\t-" + songAdd.getTitle());
            System.out.println("\t-" + songAdd.getArtist());
            System.out.println("CON ÉXITO");
        } else {
            System.out.println("No se pueden agregar más canciones, la playlist está llena.");
        }
    }

    public void MostrarListado() {
        System.out.println("Playlist: " + nameList);
        if (contadorCanciones == 0) {
            System.out.println("\tLa playlist está vacía.");
        } else {
            for (int i = 0; i < contadorCanciones; i++) { // Solo recorrer canciones agregadas
                System.out.println("\t" + this.playlist[i].getArtist() + " - " + this.playlist[i].getTitle());
            }
        }
    }

}