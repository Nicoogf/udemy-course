import java.util.Scanner;

public class NuevoSwitch {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in) ;

        System.out.println("Ingresar dia");
        int dia = consola.nextInt() ;

        String nombreDelDia ;

        nombreDelDia = switch (dia){
            case 1 -> "Lunes" ;
            case 2 -> "Martes" ;
            case 3 -> "Miercoles" ;
            case 4 -> "Jueves" ;
            case 5 -> "Viernes" ;
            case 6 -> "Sabado" ;
            case 7 -> "Domingo" ;
            default ->  "Dia invalido" ;
        } ;

        System.out.println("El dia elegido fue : " + nombreDelDia);


    }
}
