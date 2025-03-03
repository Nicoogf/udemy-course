import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Condicional {
    public static void main(String[] args) {
        Random random = new Random() ;
        var primerValor =  random.nextInt(10) ;
        var segundoValor = random.nextInt(10) ;

        System.out.println(primerValor);
        System.out.println(segundoValor);

        if ( primerValor < segundoValor ){
            System.out.println("El segundo valor fue mas grande");
        } else if (primerValor > segundoValor) {
            System.out.println("El primer valor fue mas grande");
        }else {
            System.out.println("Son iguales");
        }
    }
}
