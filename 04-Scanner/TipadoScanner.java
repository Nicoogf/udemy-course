import java.util.Scanner;

public class TipadoScanner {
    public static void main(String[] args) {

        var consola = new Scanner(System.in) ;
        System.out.println("Ingresar edad");
        var edad = consola.nextInt();
        System.out.println("edad : " + edad);

        consola.nextLine() ;

        //leer double
        System.out.print("Ingesar altura : ");
        var altura = consola.nextDouble();

        System.out.println("altura : " + altura);
    }
}
