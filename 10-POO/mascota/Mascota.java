package mascota;

public class Mascota {
    private String nombre ;
    private String raza ;
    private int edad ;
    private int edadHumana ;

    public Mascota ( String nombre , String raza , int edad ) {
        this.nombre = nombre ;
        this.raza = raza ;
        this.edad = edad ;
        this.edadHumana = edad * 7 ;
    }

    public Mascota(){};

    public String getNombre() {
        return this.nombre ;
    }

    public void setNombre( String nombre ){
        this.nombre = nombre ;
    }

    public String getRaza() {
        return this.raza ;
    }

    public void setRaza( String raza) {
        this.raza = raza ;
    }

    public int getEdad ( ) {
        return this.edad ;
    }

    public void setEdad ( int edad ) {
        this.edad = edad ;
    }

    public int getEdadHumana() {
        return this.edadHumana ;
    }

    public void setEdadHumana(int edad ){
        this.edadHumana = edad * 7 ;
    }


}
