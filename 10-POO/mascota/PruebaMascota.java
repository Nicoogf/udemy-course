package mascota;

public class PruebaMascota {
    public static void main(String[] args) {
        var mascotaUno = new Mascota("Lila" , "Golden" , 4 ) ;

        System.out.println(  mascotaUno.getNombre() );

        mascotaUno.setNombre( "Rosa" );

        System.out.println(  mascotaUno.getNombre() );

        System.out.println("Edad de la mascota : " + mascotaUno.getEdad() );
        System.out.println("Edad si fuera humano : " + mascotaUno.getEdadHumana() );

    }
}
