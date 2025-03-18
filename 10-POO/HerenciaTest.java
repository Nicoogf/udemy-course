import Animal.Animal;
import Animal.Gato;
import Animal.Perro;


public class HerenciaTest {

    static void ImprimeSonido( Animal animal ) {
        animal.HacerSonido();
    }


    public static void main(String[] args) {

        var nuevoAninal = new Animal() ;

        var nuevoPerro =  new Perro() ;

        nuevoPerro.HacerRuido();

        nuevoPerro.Dormir();

        var nuevoGato =  new Gato() ;


        nuevoGato.HacerSonido();

        System.out.println("GATO : " + nuevoGato );

        System.out.println("El resultado de la funcion heredada : ");
        ImprimeSonido(nuevoAninal) ;
    }
}
