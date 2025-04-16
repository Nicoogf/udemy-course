import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
    public static void main(String[] args) {
        var nombre ="mi_archivo.txt" ;
        var archivo = new File(nombre) ;

        try {
            System.out.println("Contenido del archivo : ");
            var entrada = new BufferedReader(new FileReader(archivo)) ;

            var linea = entrada.readLine() ;

        }
        catch( Exception e){
            System.out.println("Ocurrio un error : " + e.getMessage());
        }
    }
}
