public class DooWhile {
    public static void main(String[] args) {
        int inicioApp = 0 ;

        do{
            if(inicioApp % 2 != 0){
                System.out.print(inicioApp + " ");
            }
            inicioApp++;
        }while (inicioApp <= 20);
    }
}
