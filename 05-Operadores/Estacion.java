import java.util.Scanner;

public class Estacion {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in) ;
        System.out.println("Ingresar numero del mes");

        int numberMounth = consola.nextInt();

        if( numberMounth <=0 || numberMounth > 12 ) {
            System.out.println("Mes invalido");
        }else{
            if(numberMounth == 1 || numberMounth == 2 ||numberMounth == 12){
                System.out.println("Verano");
            } else if (numberMounth == 3 || numberMounth == 4 ||numberMounth == 5) {
                System.out.println("Otoño");
            }else if (numberMounth == 6 || numberMounth == 7 ||numberMounth == 8) {
                System.out.println("Invierno");
            }else {
                System.out.println("Primavera");
            }
        }
     }
}
