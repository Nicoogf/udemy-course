import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in) ;
        int contador = 0 ;
        System.out.println("Ingresar la cantidad de calificaciones : ");
        int cantidadCalificaciones =  consola.nextInt() ;

        int[] listadoDeCalificaciones = new int[cantidadCalificaciones] ;

        for  ( int i = 0 ; i < cantidadCalificaciones ; i++) {
            System.out.println("Ingresar calificacion nº : " + ( i+1) );
            int calificacionIngresada =  consola.nextInt() ;
            listadoDeCalificaciones[i] = calificacionIngresada ;
        }

        System.out.println("El promedio de notas fue : ");
        for( int i = 0 ; i < cantidadCalificaciones ; i++) {
            contador +=  listadoDeCalificaciones[i] ;
        }
        System.out.println( contador / cantidadCalificaciones);
    }

}
