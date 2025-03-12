import java.util.Scanner;

public class EsParDinamico {


    static boolean esPar ( int numero ) {
        return numero % 2 == 0 ? true : false ;
    }

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in) ;
        System.out.print("Ingresar valor : ");
        var numero = Integer.parseInt(consola.nextLine()) ;
        System.out.println(esPar(numero) ? "Es par" : "Es impar");
    }
}
