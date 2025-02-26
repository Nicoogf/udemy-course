public class RemplazoSubCadena {
    public static void main(String[] args) {
        var cadena = "Hola mundo" ;
        System.out.println("Cadena original : " + cadena);

        //Remplazo

        var newCadena = cadena.replace("mundo" , "a todos");
        System.out.println(newCadena);

        newCadena = cadena.replace("Hola" , "saludos");
        System.out.println(newCadena);
    }
}
