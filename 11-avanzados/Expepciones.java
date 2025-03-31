public class Expepciones {
    public static void main(String[] args) {
        int valor1 = 10 ;
        int valor2 = 0 ;

    try {
        var resultado = valor1 / valor2 ;
        System.out.println("Resultado : " + resultado);
    }catch (Exception e){
        System.out.println("No se puede dividir por cero "+ e);
    }

    }
}
