import java.lang.foreign.ValueLayout;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in) ;
        int SALDO_INICIAL = 1000 ;
        boolean salir = false ;

        while( !salir ){
            System.out.println("Ingresar una opcion");
            System.out.println("1)  Depositar");
            System.out.println("1)  Retirar");
            System.out.println("1)  Consultar");
            System.out.println();
            System.out.println("4)  Salir");
            System.out.println();
            System.out.print("Ingresar opcion : ");
            int opcionIngresada = consola.nextInt() ;

            switch (opcionIngresada) {
                case 1 -> {
                    System.out.print("Monto a Depositar : ");
                    int depositoIngresado =  consola.nextInt() ;
                    SALDO_INICIAL += depositoIngresado ;
                    System.out.print("Tu saldo actual es de : " + SALDO_INICIAL);
                }
                case 2 -> {
                    System.out.print("Monto a Retirar : ");
                    int valorARetirar = consola.nextInt() ;
                    if( valorARetirar > SALDO_INICIAL) {
                        System.out.println("No tienes esa cantidad");
                    }else{
                        SALDO_INICIAL -= valorARetirar ;
                        System.out.println("Con el retiro de direro te quedan : " + SALDO_INICIAL);
                    }

                }
                case 3 -> {
                    System.out.println("Tu saldo es de : " + SALDO_INICIAL);
                }
                case 4 -> {
                    System.out.println("Saliendo del programa");
                    salir = true ;
                }
                default -> {
                    System.out.println("Elegiste una opcion invalida");
                }
            }

        }
    }
}
