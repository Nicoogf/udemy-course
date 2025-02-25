import java.sql.SQLOutput;
import java.util.Random;

public class indices {
    public static void main(String[] args) {
       String cadena = "Gabriel" ;
       Random random = new Random() ;

       char letraAlAzar =  cadena.charAt(random.nextInt(cadena.length())) ;
        System.out.println(letraAlAzar);

    }
}
