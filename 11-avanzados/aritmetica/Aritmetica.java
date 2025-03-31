package aritmetica;

public class Aritmetica {
    public static int Division( int numerador, int denominador) {
        if( denominador == 0 )
            throw new RuntimeException("Division entre 0")  ;
        return numerador / denominador ;
    }
}
