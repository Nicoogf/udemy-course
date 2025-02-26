import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in) ;
        System.out.println( "Ingresar numero ");
        var linea = teclado.nextLine() ;
        System.out.println("Ingresaste el numero " + linea);
    }

}
