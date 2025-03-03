import java.util.Scanner;

public class AppHotel {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in) ;

        System.out.println("*** Sistema de reserva de hotel ***");

        System.out.print("Nombre del cliente : ");
        String userName = consola.nextLine() ;

        System.out.print("Dias de estadia : ");
        int daysAmount = Integer.parseInt(consola.nextLine()) ;



        System.out.print("Con vista al mar ( true/false) ? : ");
        boolean isViewSea = Boolean.parseBoolean(consola.nextLine()) ;


        var totalPrice = isViewSea
                    ? daysAmount * 190.50
                    : daysAmount * 150.50 ;

        System.out.println("------ Detalles de la Reservacion ------");
        System.out.println("Cliente : " + userName);
        System.out.println("Dias de estadia : " + daysAmount);
        System.out.println("Costo total : $" + totalPrice);
        System.out.println("Habitacion con vista al mar ? " + (isViewSea ? "Si :)" : "No :("));




    }
}
