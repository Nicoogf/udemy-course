import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in) ;
        System.out.print("Cuantos articulos compro ? : ");
        int cantidadDeLibros = consola.nextInt();

        System.out.println("Tiene membresia ? : ");
        boolean tieneMembresia = consola.nextBoolean() ;

        boolean resultado =
                cantidadDeLibros >= 10 && tieneMembresia ;

        System.out.println( resultado ?  "Tiene acceso vip" : "No tiene acceso vip");
    }
}
