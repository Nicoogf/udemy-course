import java.util.Scanner;

public class SistemaLogueo {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in) ;
        boolean salirSistema ;

        System.out.println("Quiere salir de la aplicacion ? (true/false)");
        salirSistema =  Boolean.parseBoolean(consola.nextLine());

        if(!salirSistema){
            System.out.println("Continua en la aplicacion");
        }else{
            System.out.println("Cerrando interfaz");
        }
    }
}
