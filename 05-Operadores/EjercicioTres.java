import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in) ;
        System.out.println("¿Es estudiante?");
        boolean isStudent = consola.nextBoolean();

        System.out.println("A cuantos kilometros vive?");
        int kilometres = consola.nextInt() ;

        var resultado = isStudent || kilometres <= 3 ;

        System.out.println(resultado ? "Puede alquilar libros" : "No se encuentra habilitado");

    }
}
