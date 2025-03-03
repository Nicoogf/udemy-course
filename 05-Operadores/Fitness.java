import java.util.Scanner;

public class Fitness {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in) ;

        final int META_PASOS_DIARIOS = 1000 ;
        final double CALORIAS_POR_PASO = 0.04 ;
        double calorias_quemadas ;


        System.out.println("Ingresa la cantidad de pasos");
        int pasosDiarios =  consola.nextInt() ;

        calorias_quemadas = pasosDiarios * CALORIAS_POR_PASO ;

        System.out.println("Quemaste : " + calorias_quemadas);

        System.out.println(pasosDiarios >= META_PASOS_DIARIOS ?
                "Se cumplio el objetivo"
                : "No se cumplio el objetivo");




    }
}
