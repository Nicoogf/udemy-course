package proyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks() ;
    }

    public static void maquinaSnacks(){
        var salir = false ;
        var consola = new Scanner(System.in) ;
        List<Snack> productos = new ArrayList<>() ;

        System.out.println("*** Maquina Snacks ***");
        Snacks.MostrarSnack();

        while( !salir ) {
            try {
                var opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(opcion,consola,productos) ;
            }catch (Exception e){
                System.out.println("Ocurrio un error : " + e.getMessage() );
            }finally {
                System.out.println();
            }
        }
    }


    private static int mostrarMenu(Scanner consola) {
        System.out.print("""
                1. Comprar snack
                2. Mostrar ticket
                3. Agregar nuevo snack
                4. salir
                Elige una opcion : \s """);
        return Integer.parseInt(consola.nextLine()) ;

    }

    private static boolean ejecutarOpciones( int opcion , Scanner consola , List<Snack> productos) {
        var salir  = false ;
        switch ( opcion ) {
            case 1 -> comprarSnack(consola, productos) ;
            case 2 -> mostrarTicket(productos) ;
        }
        return salir ;

    }

    private static void comprarSnack( Scanner consola, List<Snack> productos) {
        System.out.print("Que snack queres comprar (id) ?  : ") ;
        var idSnack  = Integer.parseInt(consola.nextLine()) ;

        var snackEncontrado = false ;
        for ( var snack : Snacks.getSnacks() ) {
            if( idSnack == snack.getIdSnack()) {
                productos.add(snack) ;
                System.out.println("Snack agregado " + snack );
                snackEncontrado = true ;
                break;
            }
        }

        if( !snackEncontrado ) {
            System.out.println("ID de snack no encontrado : " + idSnack );
        }

    }

    private static void mostrarTicket(List<Snack> productos ) {
        var ticket = "*** Ticket de venta ***" ;
        var total = 0.0 ;
        for( var producto : productos) {
            ticket += "\n\t" + producto.getNombre() + producto.getNombre() + " - $" + producto.getPrecio() ;
            total += producto.getPrecio() ;
        }
        ticket += "\n total -> $" + total ;
        System.out.println(ticket);
    }
}


