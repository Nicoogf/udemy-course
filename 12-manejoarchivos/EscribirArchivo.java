import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class EscribirArchivo {
    public static void main(String[] args) {
        boolean anexar = false ;
        var nombreDelArchivo = "mi_archivo.txt" ;
        var archivo =  new File(nombreDelArchivo) ;
        try{
            anexar = archivo.exists() ;
            var salida = new PrintWriter( new FileWriter(archivo, anexar)) ;
            var nuevoContenido = "Nuevo contenido \nEn el archivo" ;
            salida.println(nuevoContenido);
            salida.close();
            System.out.println("Texto agregado exitosamente");
        }
        catch (Exception e){
            System.out.println("Ocurrio un error : " + e.getMessage());
        }


    }
}
