package figura;

public class testFigura {
    public static void main(String[] args) {
        FiguraGeometrica rectangulo_uno = new Rectangulo() ;

        rectangulo_uno.Dibujar();

        FiguraGeometrica circulo_uno = new Circulo() ;

        circulo_uno.Dibujar();
        rectangulo_uno.Dibujar();
        circulo_uno.Dibujar();
    }
}
