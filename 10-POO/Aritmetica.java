public class Aritmetica {
    int operando1 ;
    int operando2 ;

    public Aritmetica ( int op1 , int op2 ){
        System.out.println("Ejecuta constructor");
        operando1 = op1 ;
        operando2 = op2 ;
    }

   void Sumar() {
       int resultado = operando1 + operando2 ;
       System.out.println( resultado );

    }

    void Restar() {
       int resultado = operando1 - operando2 ;
        System.out.println( resultado);
    }

    void Multiplicar() {
       int resultado = operando1 * operando2 ;
        System.out.println( resultado);
    }

    void Dividir() {
        float resultado =  operando1 / operando2 ;
        System.out.println( resultado);
    }

    public static void main(String[] args) {
        Aritmetica practica_uno = new Aritmetica(5,7) ;

       /*  practica_uno.operando1 = 15 ;
        practica_uno.operando2 = 10 ; */

        practica_uno.Sumar() ;
        practica_uno.Restar() ;
        practica_uno.Multiplicar() ;
        practica_uno.Dividir();
    }
}
