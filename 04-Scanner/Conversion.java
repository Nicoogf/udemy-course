import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in) ;
        var enteroString = consola.nextLine();
        int entero = Integer.parseInt(enteroString);
        System.out.println("El valor entero es : " + entero);

        float pruebaFlotante = Float.parseFloat(consola.nextLine()) ;
        System.out.println("Prueba flotante : "  + pruebaFlotante);
    }
}
