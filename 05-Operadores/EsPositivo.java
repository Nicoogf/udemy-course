import java.util.Scanner;

public class EsPositivo {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in) ;

        int valorPorConsola =  consola.nextInt() ;

        if(valorPorConsola > 0 ) {
            System.out.println("El valor fue positivo");
        } else if (valorPorConsola < 0) {
            System.out.println("El valor fue negativo");
        }else{
            System.out.println("Ingresaste 0");
        }
    }
}
