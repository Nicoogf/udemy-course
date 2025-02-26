public class Email {
    public static void main(String[] args) {

        String nombre = "Gabriel" ;
        String apellido = "Palacios" ;
        String empresa = "Mercado Libre" ;
        String dominio = "com.ar" ;

        StringBuilder constructorStringBuffer = new StringBuilder() ;
        constructorStringBuffer.append(nombre);
        constructorStringBuffer.append(".");
        constructorStringBuffer.append(apellido);
        constructorStringBuffer.append("@");
        empresa = empresa.replace(" " , "");
        constructorStringBuffer.append(empresa);
        constructorStringBuffer.append(".");
        constructorStringBuffer.append(dominio);

       String resultado = constructorStringBuffer.toString().toLowerCase();


        System.out.println("El email generado fue : ");
        System.out.println(resultado);



    }
}
