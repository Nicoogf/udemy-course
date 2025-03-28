package traductor;

class Ingles implements Traductor {
    @Override
    public void traducir(){
        System.out.println("Traduzco ingles desde interfaz");
    }
}