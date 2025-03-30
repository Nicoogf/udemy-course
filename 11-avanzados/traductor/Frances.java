package traductor;

public class Frances implements Traductor {

    @Override
    public void iniciarTraductor() {
        System.out.println("Ahora inicio el traductor frances");
    }
    @Override
    public void traducir() {
        System.out.println("Ahora traduce frances");
    }
}
