import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in) ;

        System.out.println("Ingresar calificacion : ");
        double calificacion = consola.nextInt();
        char calificacionLetra ;

        if( calificacion >= 9 && calificacion <= 10 ){
            calificacionLetra = 'a' ;
        } else if ( calificacion >= 8 && calificacion <= 9) {
            calificacionLetra = 'b' ;
        }else if ( calificacion >= 7 && calificacion <= 8) {
            calificacionLetra = 'c' ;
        }else if ( calificacion >= 6 && calificacion <= 7) {
            calificacionLetra = 'd' ;
        }else if ( calificacion >= 0 && calificacion <= 6) {
            calificacionLetra = 'f' ;
        }else{
            calificacionLetra = 'x' ;
        }

        System.out.println("La nota " + calificacion + " equivale a : " + calificacionLetra);
    }
}
