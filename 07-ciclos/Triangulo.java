import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in) ;
        System.out.println("Ingresar cantidad de filas del triangulo");

        int numeroDeFilas = consola.nextInt() ;
        for ( var fila = 1 ;  fila <= fila ; fila++){
            var espaciosBlancos = " ".repeat(numeroDeFilas - fila) ;
            var asterico = "*".repeat(2 * fila - 1);
            System.out.println(espaciosBlancos + asterico);
        }
    }
}
