public class EsPar {

    static boolean elNumeroEsPar(int valorIngresado) {
        if(valorIngresado % 2 == 0 ){
            return true ;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        boolean resultado = elNumeroEsPar(4) ;

        System.out.println(resultado ? "Es par" : "Es impar");
    }
}
