import java.util.Scanner;

public class Perimetro {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in) ;
        System.out.println("Ingresar base");
        int base =  consola.nextInt() ;


        System.out.println("Ingresar altura");
        int altura = consola.nextInt() ;

        int area = base * altura ;
        int perimetro = area * 2 ;
        System.out.printf("""
                area : %d
                perimetro : %d
                """ , area ,perimetro);
    }
}
