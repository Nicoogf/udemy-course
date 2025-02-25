public class Cadenas {
    public static void main(String[] args) {
        String nombre = "Gabriel" ;
        var cadenaUno = new String(nombre + " " + "Gonzales") ;
        System.out.println(cadenaUno);

        String nombreComplejo = """
                
                Buenass
                
                """;
        System.out.println(nombreComplejo);
    }
}
