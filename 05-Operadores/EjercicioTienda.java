import java.util.Scanner;

public class EjercicioTienda {
    public static void main(String[] args) {
        int valorCompra  ;
        String esMiembro ;

        Scanner consola = new Scanner(System.in) ;
        System.out.println("Ingresar valor de la compra");

        valorCompra = Integer.parseInt(consola.nextLine());

        System.out.println("Eres miembro ? (s/n)");
        esMiembro = consola.nextLine();

        if ( valorCompra > 1000 || esMiembro.equalsIgnoreCase("s")){
            System.out.println("Accedes al descuento del 10%");
            System.out.println("Tu compra fue de : " + valorCompra);
            System.out.println("Terminaste pagando : " + valorCompra * 0.90);
        }else{
            System.out.println("Tu compra fue de  : " + valorCompra);
        }

    }
}
