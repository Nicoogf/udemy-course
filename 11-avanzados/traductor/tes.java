package traductor;

public class tes {
    public static void main(String[] args) {
        Traductor ingles = new Ingles() ;
        ingles.iniciarTraductor();
        ingles.traducir();

        Traductor frances = new Frances() ;

        frances.traducir();
    }
}
