import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in) ;
        int numero_uno = consola.nextInt();
        var resultado = (numero_uno % 2 == 0 ) ? "Es par" : "Es impar" ;

        System.out.println(resultado);
     }
}
