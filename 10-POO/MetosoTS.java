import Practica.Persona;

public class MetosoTS {
    public static void main(String[] args) {
        System.out.println("Cantidad de personas creadas : " + Persona.contadorPersona);

        var persona_uno = new Persona("Juan" , "Gonzales" , 87 ) ;
        String nombreCompleto = persona_uno.toString();
        System.out.println(nombreCompleto);
        System.out.println(persona_uno);

        System.out.println("Cantidad de personas creadas : " + Persona.contadorPersona);

    }
}
