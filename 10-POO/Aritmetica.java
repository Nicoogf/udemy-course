public class Aritmetica {
    private int operador1 ;
    private int operador2 ;

    public void Sumar()  {
        int resultado = operador1 + operador2 ;
        System.out.println( resultado );
    }

    public int getOperador1 () {
        return this.operador1 ;
    }

    public void setOperador1( int newOperador1 ) {
        this.operador1 = newOperador1 ;
    }

    public int getOperador2() {
        return this.operador2 ;
    }

    public void setOperador2( int newOperador2 ){
        this.operador2 = newOperador2 ;
    }

}
