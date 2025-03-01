import java.util.Scanner;

public class Auth {
    public static void main(String[] args) {
        var user = "gpalacios";
        var pass = "123456" ;

        Scanner consola = new Scanner(System.in) ;
        System.out.println("Ingresar usuario");
        var usuarioIngresado = consola.nextLine() ;

        System.out.println("Ingresar contraseña");
        var passIngresada = consola.nextLine() ;

        var firstValidation = usuarioIngresado.equals(user) ;
        var secondValidation = passIngresada.equals(pass) ;

        var puedeLoguear = firstValidation && secondValidation ;

        System.out.println(
                puedeLoguear ? "Inicio de session exitoso" :
                        "Credenciales incorrectas"
        );


    }
}
