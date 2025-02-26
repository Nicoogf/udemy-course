public class ConcatenarCadenas {
    public static void main(String[] args) {
        var cadena = "Hola" ;
        var cadena1 = "mundo" ;

        System.out.println(cadena.concat(" " + cadena1));


        //Stringbuilder
        var constructorCadenas = new StringBuilder() ;
        constructorCadenas.append(cadena);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena1);

        var resultado =  constructorCadenas.toString() ;
        System.out.println(resultado);

        //Stringbuffer
        var stringBuffer = new StringBuffer() ;
        stringBuffer.append(cadena).append(" ").append(cadena1) ;
        resultado = stringBuffer.toString() ;
        System.out.println("El stringbuffer : "  + resultado);

        resultado = String.join("-" , cadena , cadena1 , "Adios") ;
        System.out.println(resultado);
    }
}
