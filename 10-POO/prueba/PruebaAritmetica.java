package prueba;
import aritmetica.Aritmetica;

public class PruebaAritmetica {
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
