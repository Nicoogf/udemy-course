import java.util.Scanner;

public class ElMayor {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingresar Primer valor");
        int valor_uno = consola.nextInt();

        System.out.println("Ingresar Segundo valor");
        int valor_dos = consola.nextInt();

        if(valor_uno < valor_dos){
            System.out.println("El segundo valor fue mayor (" + valor_dos + ")" );
        } else if ( valor_uno > valor_dos) {
            System.out.println("El primer valor fue mayor (" + valor_uno + ")" );
        }else{
            System.out.println("Los numeros ingresados son iguales");
        }

    }
}
