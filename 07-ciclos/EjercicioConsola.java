import java.util.Scanner;

public class EjercicioConsola {
    public static void main(String[] args) {
        Scanner consola =  new Scanner(System.in);
         var salir = false ;

         while (!salir){
             System.out.println("Ingresar opcion");
             System.out.println("1 Crear");
             System.out.println("2 Eliminar ");
             System.out.println("3 Salir");
             System.out.println("");

             System.out.print("Elegir una opcion : ");

             int opcion = Integer.parseInt(consola.nextLine());

             switch (opcion) {
                 case 1 -> System.out.println("Creando cuenta...");
                 case 2 -> System.out.println("Eliminando cuenta...");
                 case 3 -> {
                     System.out.println("Saliendo del programa");
                     salir = true ;
                 }
                 default -> System.out.println("Opcion invalida, ingresa otra opcion");
             }
        }

    }
}
