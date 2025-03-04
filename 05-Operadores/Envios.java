import java.util.Scanner;

public class Envios {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in) ;
        System.out.println("Ingresar peso del producto");

        double peso = Double.parseDouble(consola.nextLine()) ;

        System.out.println("Es envio interanacional ?");
        boolean isInternacional = Boolean.parseBoolean(consola.nextLine());

        double sendCost ;

        if(isInternacional ) {
            sendCost = 20 ;
        }else{
            sendCost = 10 ;
        }

        System.out.println("El costo del envio es : " + peso*sendCost);

    }
}
