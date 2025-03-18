package Animal;

public class Perro extends Animal {

    public void HacerRuido() {
        System.out.println("GUAU");
    }


    @Override
    public void Dormir(){
        System.out.println("El perro duerme zzzz");
        System.out.println("Metodo padre : ");
        super.Dormir();
    }

    @Override
    public void HacerSonido(){
        System.out.println("El perro hace guau");
    }

}
