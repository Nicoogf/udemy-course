import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivo {

    public static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt" ;
        var archivo =  new File(nombreArchivo) ;

        try{
            if(archivo.exists()){
                System.out.println("El archivo ya existe");
            }else{
                var salida =  new PrintWriter( new FileWriter(archivo)) ;
                salida.close();
                System.out.println("El archivo fue creado con exito");
            }
        }catch (IOException e){
            System.out.println("Ocurrio un error : " + e);
            e.printStackTrace();
        }
    }
}


