package aritmetica;

public class Aritmetica {
   public int operando1 ;
   public int operando2 ;

   public Aritmetica() {

    }
   public Aritmetica ( int op1 , int op2 ){
        System.out.println("Ejecuta constructor");
        operando1 = op1 ;
        operando2 = op2 ;
    }

   public void Sumar() {
       int resultado = operando1 + operando2 ;
       System.out.println( resultado );

    }

   public void Restar() {
       int resultado = operando1 - operando2 ;
        System.out.println( resultado);
    }

   public void Multiplicar() {
       int resultado = operando1 * operando2 ;
        System.out.println( resultado);
    }

   public void Dividir() {
        float resultado =  operando1 / operando2 ;
        System.out.println( resultado);
    }


}
