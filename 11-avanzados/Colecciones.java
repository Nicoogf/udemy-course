import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Colecciones {
    public static void main(String[] args) {

        List<String> miLista = new ArrayList<>() ;
        miLista.add("Lunes") ;
        miLista.add("Martes") ;
        miLista.add("Miercoles") ;
        miLista.add("Jueves") ;
        miLista.add("Viernes") ;
        miLista.add("Sabado")  ;
        miLista.add("Domingo") ;
        // miLista.add("Domingo") ;


        miLista.forEach( dia -> {
            System.out.println("Elemento : " + dia) ;
        });

        for ( Object elemento : miLista){
            System.out.println("Dia : " + elemento);
        }

        miLista.forEach( System.out::println);

        List<String> nombres = Arrays.asList("Carlos","Juan","Pedro") ;

        nombres.forEach(System.out::println);
    }
}
