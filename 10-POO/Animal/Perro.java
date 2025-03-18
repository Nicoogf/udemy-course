package Animal;

public class Perro extends Animal {

    public void HacerRuido() {
        System.out.println("GUAU");
    }


    @Override
    public void Dormir(){
        System.out.println("El perro duerme zzzz");
    }

}
