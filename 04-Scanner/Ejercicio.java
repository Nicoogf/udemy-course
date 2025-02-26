import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in) ;

        System.out.println("Ingresar nombre del empleado : ");
        String nombre = consola.nextLine();

        System.out.println("Ingresar edad del empleado : ");
        int edad = Integer.parseInt(consola.nextLine());

        System.out.println("Ingresar salario del empleado : ");
        double salario = Double.parseDouble(consola.nextLine());

        System.out.println("¿Es jefe de departamento? ");
        boolean esJefe = Boolean.parseBoolean(consola.nextLine());

        System.out.println(nombre);
        System.out.println(edad + " Años");
        System.out.println("$%.2f".formatted(salario));
        System.out.println(esJefe);
    }
}
