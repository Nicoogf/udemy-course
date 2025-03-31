package aritmetica;

public class PruebaExepcion {
    public static void main(String[] args) {


   try {
       var resultado = Aritmetica.Division(4,0) ;
       System.out.println(resultado);
   }catch( Exception e){
       System.out.println("Error : " + e );
    }

}
}
