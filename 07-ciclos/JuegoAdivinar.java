import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinar {
    public static void main(String[] args) {
        Random random = new Random() ;
        Scanner consola = new Scanner(System.in) ;

        final int numeroElegido = random.nextInt(10) + 1 ;
        System.out.println(numeroElegido);
        int cantidadDeIntentos = 10 ;
        boolean adivino = false ;

        while ( (cantidadDeIntentos > 0) && (!adivino) ) {
            System.out.println("Adivina el numero");
            int intentoRealizado = consola.nextInt() ;
            if( intentoRealizado != numeroElegido){
                cantidadDeIntentos-- ;
                System.out.println("No adivinaste, te quedan : " + cantidadDeIntentos);

                if(intentoRealizado < numeroElegido){
                    System.out.println("El numero que tiene que adivinar es mayor");
                }else{
                    System.out.println("El numero que tiene que adivinar es menor");
                }

            }
            else {
                System.out.println("Adivinaste el numero!!");
                adivino = true ;
            }
        }
    }
}
