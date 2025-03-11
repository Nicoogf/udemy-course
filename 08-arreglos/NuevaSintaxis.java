public class NuevaSintaxis {
    public static void main(String[] args) {
        var nuevaMatriz = new int[][]{
                {10,11,12},
                {14,15,16}
        } ;

        for( int i = 0 ; i < nuevaMatriz.length ; i++) {
            for( int j = 0 ; j < nuevaMatriz[i].length ;j++ ){
                System.out.println("Nueva matriz" + "[ " + i + " ]" + "[ " + j + " ] " + " = " + nuevaMatriz[i][j]);
            }
        }
    }
}
