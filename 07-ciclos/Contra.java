import java.util.Scanner;

public class Contra {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in) ;
        final int MAXIMO_LARGO = 6 ;
        boolean salir = false ;
        System.out.println("Ingresar contraseña");
        String passwordIn  = consola.nextLine();


       while ( passwordIn.length() < MAXIMO_LARGO){
           System.out.println("Contraseña corta, ingresa una nueva");
           passwordIn  = consola.nextLine();
       }

    }
}
