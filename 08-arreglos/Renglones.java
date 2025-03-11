public class Renglones {
    public static void main(String[] args) {
        final int RENGLONES = 2 ;
        final int COLUMNAS = 3 ;

        var matrizNueva = new int [RENGLONES][COLUMNAS] ;
        matrizNueva[0][0] = 100 ;
        matrizNueva[0][1] = 200 ;
        matrizNueva[0][2] = 300 ;
        matrizNueva[1][0] = 400 ;
        matrizNueva[1][1] = 500 ;
        matrizNueva[1][2] = 600 ;

        System.out.println("El valor de [0][0] : " + matrizNueva[0][0] );

        for ( int renglones = 0 ; renglones < RENGLONES ; renglones ++) {
            for ( int columnas = 0 ; columnas < COLUMNAS ; columnas ++){
                System.out.println("[ " + renglones + " ] " +  "[ " + columnas + " ]" + " = " + matrizNueva[renglones][columnas]);
            }
        }

    }
}
