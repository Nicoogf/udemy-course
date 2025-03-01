import java.util.Scanner;

public class EjercicioCuatro {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in) ;
        System.out.println("Ingresar primer compra");
        int valor_uno = consola.nextInt();

        System.out.println("Ingresar segunda compra");
        int valor_dos = consola.nextInt();

        System.out.println("Ingresar tercer compra");
        int valor_tres = consola.nextInt();

        int subtotal = valor_uno+valor_dos+valor_tres;

        var impuesto = subtotal * .16 ;

        subtotal += impuesto ;

        System.out.println("En total gastaste : " + subtotal);

    }
}
