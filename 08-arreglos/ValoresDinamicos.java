import java.util.Scanner;

public class ValoresDinamicos {
    public static void main(String[] args) {
        var consola = new Scanner(System.in) ;
        System.out.println("Ingresar cantidad de elementos : " );
        int cantidadDeElementos = consola.nextInt() ;
        var arreglo = new int[cantidadDeElementos] ;

        for ( int i = 0 ;  i < cantidadDeElementos  ; i++) {
            System.out.println("Ingresa valor para indice : [ " + i + " ]");
            int elementoAgregado = consola.nextInt() ;
            arreglo[i] = elementoAgregado ;
        }

        System.out.println("El arreglo tiene : " + arreglo.length + " elementos y son :");
        for (int i = 0 ; i < arreglo.length ; i++) {
            System.out.println("Indice [ " + i + " ] : " + arreglo[i]);
        }


    }
}
