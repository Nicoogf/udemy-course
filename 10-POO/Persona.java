public class Persona {
    String nombre ;
    String apellido ;

    public Persona (String nombre , String apellido) {
        this.nombre = nombre ;
        this.apellido = apellido ;
        System.out.println("Operador this : " + this );
    }

    void Saludar() {
        System.out.println("Hola " + nombre);
    }

    public static void main(String[] args) {
        var Gabriel =  new Persona("Gabriel" , "Gonzales") ;
        var Carlos = new Persona("Carlos" , "Rodriguez") ;

        Gabriel.Saludar();

        System.out.println("Direccion de memoria : " +  Gabriel);
        System.out.println("Direccion de memoria : " +  Carlos);
    }
}
