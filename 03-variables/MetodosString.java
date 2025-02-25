import java.util.Locale;

public class MetodosString {

    public static void main(String[] args) {

        //Obtener largo

        var cadena = "Hola mundo" ;
        var longitudDeCadena = cadena.length() ;

        System.out.println("El largo de cadena es : " + longitudDeCadena);

        var nuevaCadena = cadena.replace('o' , 'k') ;
        System.out.println(nuevaCadena);

        System.out.println(nuevaCadena.toUpperCase());
        System.out.println(cadena.toLowerCase());

        var cadenaConEspacios = "   HOLA HOLA HOLA   HOLA   " ;
        System.out.println(cadenaConEspacios.trim());
        System.out.println(cadenaConEspacios);
    }
}
