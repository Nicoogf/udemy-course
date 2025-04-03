package proyecto;

import java.util.ArrayList;
import java.util.List;

public class Snacks {
    private static final List<Snack> snacks ;


    static {
        snacks = new ArrayList<>() ;
        snacks.add(new Snack("Papas" , 70 )) ;
        snacks.add(new Snack("Refresco" , 50 )) ;
        snacks.add(new Snack("Sandwich" , 120 )) ;
    }

    public static void agregarSnack( Snack snack) {
        snacks.add( snack) ;
    }

    public static void MostrarSnack() {
        var inventarioSnack = "" ;
        for( var snack :  snacks){
            inventarioSnack += snack.toString() + " \n ";
        }
        System.out.println("--- Snacks en el inventario ---");
        System.out.println(inventarioSnack);
    }

    public static List<Snack> getSnacks(){
        return snacks ;
    }

    public void getName() {
        System.out.println(snacks);
    }


}
