import java.util.Scanner;

public class DiaDeLaSemana {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in) ;
        System.out.println("Ingesar dia de la semana");
        int diaDeLaSemana =  consola.nextInt() ;

        switch (diaDeLaSemana) {
            case 1 :
                System.out.println("Lunes");
                break;
            case 2 :
                System.out.println("Martes");
                break;
            case 3 :
                System.out.println("Miercoles");
                break;
            case 4 :
                System.out.println("Jueves");
                break;
            case 5 :
                System.out.println("Viernes");
                break;
            case 6 :
                System.out.println("Sabado");
                break;
            case 7 :
                System.out.println("Domingo");
                break;
            default :
                System.out.println("No es un dia de la semana");
        }
    }
}
