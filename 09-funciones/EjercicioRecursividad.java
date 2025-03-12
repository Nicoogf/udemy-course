public class EjercicioRecursividad {

    static void recursividad(int n ) {
        if( n == 5 ){
            System.out.print(n);
        }else{
            System.out.println(n);
            recursividad(n+1);
        }
    }

    public static void main(String[] args) {
        recursividad(0);
    }
}
