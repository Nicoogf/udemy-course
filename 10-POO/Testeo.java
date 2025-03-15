import Practica.Persona;

public class Testeo {
    public static void main(String[] args) {
        var gonzalo = new Persona("Gonzalo" , "Rodriguez" , 24) ;

        var nombre_gonzalo =  gonzalo.getNombre() ;

        System.out.println(nombre_gonzalo);
    }
}
