import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in) ;
        System.out.println("Ingresar valor");
        int valorIngresado =  consola.nextInt() ;
        var resultado = valorIngresado >= 0 && valorIngresado <= 5 ;
        System.out.println("Se encuentra en el rango? " + resultado);

    }
}
