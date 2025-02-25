public class ComparacionCadenas {
    public static void main(String[] args) {
        var cadena1 = "Java" ;
        var cadena2 = "Java" ;
        var cadena3 = new String("Java") ;

        var uno = 1 ;
        var dos = 1 ;

        System.out.println(cadena1 == cadena2);
        System.out.println(cadena1 == cadena3);
        System.out.println(cadena1.equals(cadena3)) ;

        System.out.println( uno == dos );




    }
}
