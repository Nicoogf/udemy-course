import java.util.Random;

public class ModoDebbug {
    public static void main(String[] args) {

        Random alAzar =  new Random() ;
        int valor_uno = alAzar.nextInt(10) ;
        int valor_dos = alAzar.nextInt(10) ;

        System.out.println("valor_uno : " + valor_uno );
        System.out.println("valor_uno : " + valor_dos );

        if( valor_uno > valor_dos){
            System.out.println("El valor_uno es mayor");
        } else if (valor_dos > valor_uno) {
            System.out.println("El valor_dos es mayor");
        }else{
            System.out.println("Son valores iguales");
        }
    }
}
