package proyecto;

import java.util.List;

public class Snacks {
    private static List<Snack> snacksList ;

    public void AgregarSnack( Snack snackAgregado ){
        snacksList.add(snackAgregado) ;
        System.out.println("Snack agregado exitosamente");
    }

    public void MostrarSnack() {
        snacksList.forEach(System.out::println);
    }

    public void GetSnacks(){

    }

}
