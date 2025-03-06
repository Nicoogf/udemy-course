import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in) ;


        boolean salir = false ;

        while ( !salir ) {

            System.out.println("*** CALCULADORA ***");

            System.out.println("1-  Suma");
            System.out.println("2-  Resta");
            System.out.println("3-  Multiplicacion");
            System.out.println("4-  Division");
            System.out.println("5-  Salir");

            System.out.print("Elige una opcion : ");
            int opcion = consola.nextInt() ;

            switch ( opcion ) {
                case 1 ->{
                    System.out.println("Elegiste Suma");
                    System.out.print("Ingresar primer numero : \n");
                    int valorUno = consola.nextInt() ;
                    System.out.print("Ingresar segundo numero : \n");
                    int valorDos = consola.nextInt() ;
                    System.out.println("La suma dio : " + (valorDos + valorUno) );
                }
                case 2 -> {
                    System.out.println("Elegiste Resta");
                    System.out.print("Ingresar primer numero : \n");
                    int valorUno = consola.nextInt() ;
                    System.out.print("Ingresar segundo numero : \n");
                    int valorDos = consola.nextInt() ;
                    System.out.println("La suma dio : " + (valorUno - valorDos));
                }
                case 3 -> {
                    System.out.println("Elegiste Multiplicacion");
                    System.out.print("Ingresar primer numero : \n");
                    int valorUno = consola.nextInt() ;
                    System.out.print("Ingresar segundo numero : \n");
                    int valorDos = consola.nextInt() ;
                    System.out.println("La suma dio : " + (valorDos * valorUno));
                }
                case 4 -> {
                    System.out.println("Elegiste Divicion");
                    System.out.print("Ingresar primer numero : \n");
                    int valorUno = consola.nextInt() ;
                    System.out.print("Ingresar segundo numero : \n");
                    int valorDos = consola.nextInt() ;
                    System.out.println("La suma dio : " + (valorUno / valorDos));
                }
                case 5 -> {
                    System.out.println("Elegiste salir de la aplicacion");
                    System.out.print("Saliendo... : \n");
                    salir = true ;
                }
                default -> {
                    System.out.println("Opcion invalida");
                }

            }

        }


    }
}
