public class FuncionRecursiva {

   static void recursividad( int n ) {
       if( n == 1 ){
           System.out.println(1);
       }else{
           System.out.println(n);
           recursividad(n-1);
       }
   }
    public static void main(String[] args) {
        recursividad(10);
    }
}
