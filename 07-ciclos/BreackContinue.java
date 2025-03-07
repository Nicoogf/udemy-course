public class BreackContinue {
    public static void main(String[] args) {
/*
        for  ( int i = 0 ; i < 10 ; i++){
            System.out.println(i);
            if( i == 5 ){
                break;
            }
        }
*/
        for  ( int i = 0 ; i < 10 ; i++){
            if( i == 5 ){
                System.out.println("No salio");
                continue;
            }
            System.out.println(i);
        }

    }
}
