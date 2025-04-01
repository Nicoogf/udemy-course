import java.util.HashMap;
import java.util.Map;


public class MapsExample {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put("nombre" , "diego") ;
        persona.put("apellido" , "flores" ) ;
        persona.put("edad" , "55") ;
        persona.put("edad" , "31") ;


        persona.remove("edad") ;

        System.out.println("Valores de mapa/diccionario : ");
        persona.entrySet().forEach(System.out::println);


        //iterar elementos por separado
        System.out.println("Iterando elementos por separado");
        persona.forEach((llave,valor) -> {
            System.out.println("{");
            System.out.println("\t" + llave + " : " +  valor);
            System.out.println("},");
        });
    }
}
