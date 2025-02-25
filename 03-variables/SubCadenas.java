import java.util.Random;

public class SubCadenas {
    public static void main(String[] args) {

        var cadena1 = "asd" ;
        var cadena = "bsd" ;

        Random random = new Random() ;
        int randomNumber = random.nextInt(cadena.length());

        var comparaUno = cadena.substring(randomNumber);
        var comparaDos = cadena1.substring(randomNumber) ;

        if (comparaUno.equals(comparaDos)){
            System.out.println("COINCIDIERON : " +comparaUno+ " " + comparaDos);
        }else {
            System.out.println("nop coindicidieron : " +comparaUno+ " " + comparaDos);
        }



    }
}
