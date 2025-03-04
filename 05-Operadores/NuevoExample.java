import java.util.Scanner;

public class NuevoExample {
    public static void main(String[] args) {
        Scanner consola =  new Scanner(System.in) ;

        System.out.println("Ingesar mes del año");
        int mouth = consola.nextInt() ;

        String estacion = switch (mouth) {
            case 1 ,2, 12 -> "Verano" ;
            case 3,4,5 -> "Otoño" ;
            case 6,7,8 -> "Invierno" ;
            case 9,10,11-> "Primavera" ;
            default -> "Invalid Mouth" ;
        } ;

        System.out.println("El mes " + mouth + " es " + estacion);


    }
}
