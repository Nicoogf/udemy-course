public class Persona {
    String nombre ;
    String apellido ;
    int edad ;

    void MostrarDetalles() {
        System.out.println("Nombre : " + nombre);
        System.out.println("Apellido : " + apellido);
        System.out.println("Edad : " + edad );
    }

    public static void main(String[] args) {
        System.out.println("*** Creacion de Clases y Objetos ***");
        var objeto1 =  new Persona();
        objeto1.nombre = "Gabriel" ;
        objeto1.apellido = "Gonzales" ;
        objeto1.edad = 45 ;

        objeto1.MostrarDetalles();


        var objeto2 = new Persona() ;
        objeto2.MostrarDetalles();
    }
}


