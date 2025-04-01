import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> conjuntoDeDatos = new TreeSet<>() ;
        conjuntoDeDatos.add("Carlos") ;
        conjuntoDeDatos.add("Carlos") ;
        conjuntoDeDatos.add("Pedro") ;


        conjuntoDeDatos.forEach(System.out::println);
    }
}
