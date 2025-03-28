package traductor;

public interface Traductor {
    void traducir() ;

    //Metodos con implementacion por default
    default void iniciarTraductor(){
        System.out.println("Iniciando traductor");
    } ;

}


