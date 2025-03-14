public class Aritmetica {
    int operando1 ;
    int operando2 ;

    public Aritmetica() {

    }
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

        System.out.println("Practica_Dos");
        var practica_dos = new Aritmetica() ;
        practica_dos.operando1 = 12 ;
        practica_dos.operando2 = 8 ;
        practica_dos.Sumar();
        practica_dos.Restar();


    }
}
