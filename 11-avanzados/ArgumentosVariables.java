public class ArgumentosVariables {
    public static void main(String[] args) {
        //imprimirNumeros(1,2,3,4,5) ;

        nuevaFuncion("Karla",10,20,30) ;
    }

    static void nuevaFuncion(String nombre, int ... numeros) {
        System.out.println("Mi nombre es " + nombre);
        for (int i = 0 ; i < numeros.length ; i++) {
            System.out.print(numeros[i] + " ");
        }
    }

    static void imprimirNumeros( int... numeros ) {
        for(int i = 0 ; i < numeros.length ; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
