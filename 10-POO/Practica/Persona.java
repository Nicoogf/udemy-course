package Practica;

public class Persona {
    private static int contadorPersona = 0 ;
    private int idUnico ;
    private String nombre ;
    private String apellido ;
    private int edad ;

    public Persona ( String nombre ,String apellido , int edad){
        this.nombre = nombre ;
        this.apellido = apellido ;
        this.edad = edad ;
        this.idUnico = ++Persona.contadorPersona ;
    }

    public String getNombre() {
        return this.nombre  ;
    }

    public String getApellido() {
        return this.apellido ;
    }

    public int getEdad(){
        return this.edad ;
    }

    public void setNombre( String nombre ) {
        this.nombre = nombre ;
    }

    public void setApellido( String apellido ){
        this.apellido = apellido ;
    }

    public void setEdad ( int edad ) {
        this.edad = edad ;
    }

    public int getIdUnico(){
        return this.idUnico ;
    }
    public static int getContadorPersona() {
        return Persona.contadorPersona ;
    }

   @Override
    public String toString(){
        return "Nombre : " + this.nombre + " " +  this.apellido + " " + " ID : " + this.idUnico + " " + super.toString() ;
    }

}
