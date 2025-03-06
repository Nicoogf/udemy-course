public class Suma {
    public static void main(String[] args) {
        int cantidadDeRepeticiones = 0;
        int acumulador = 0;
        int valorAsumar = 1;

        while (cantidadDeRepeticiones < 5) {
            acumulador += valorAsumar;
            System.out.print(acumulador + " ");
            valorAsumar++;
            cantidadDeRepeticiones++;
        }
    }
}
