import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in) ;
        System.out.print("Nombre de la receta : ");
        String nameReceta = consola.nextLine();

        System.out.print("Ingrediente de la receta : ");
        String ingredientsReceta = consola.nextLine();

        System.out.print("Minutos de la receta : ");
        int minutos = Integer.parseInt(consola.nextLine());

        System.out.print("Dificultad de la receta ( baja /media /alta) ");
        String dificulty = consola.nextLine();

        System.out.println(nameReceta);
        System.out.println(ingredientsReceta);
        System.out.println(minutos);
        System.out.println(dificulty);

    }
}
