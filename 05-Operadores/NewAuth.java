import java.util.Scanner;

public class NewAuth {
    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in) ;
        final String username = "cuenta-test" ;
        final String password = "123456" ;

        System.out.println("Ingresar usuario : "); 
        String usernameIngresado = consola.nextLine() ;

        System.out.println("Ingresar Contraseña : ");
        String passwordIngresado = consola.nextLine() ;
        
        if ( usernameIngresado.equalsIgnoreCase(username) && passwordIngresado.equalsIgnoreCase(password)){
            System.out.println("Bienvenido al sistema");
        } else if (!usernameIngresado.equalsIgnoreCase(username) &&  passwordIngresado.equalsIgnoreCase(password)) {
            System.out.println("Fallo el usuario");
        }else if (!passwordIngresado.equalsIgnoreCase(password) && usernameIngresado.equalsIgnoreCase(username)) {
            System.out.println("Fallo el la contraseña");
        }else {
            System.out.println("Credenciales incorrectas");
        }


    }
}
