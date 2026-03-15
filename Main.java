import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println( " Hello and welcome!" ) ;
        Scanner scanner = new Scanner(System.in);
        int a , b ;
        int som = 0 ;
        Character confirmation = 'o' ;
        int valueDeTest ;

        System.out.println ( " donne une  valeur positiv de value pour commencer ." ) ;
        valueDeTest = scanner.nextInt () ;


        if ( valueDeTest > 0 ) {
            do {
                System.out.println( "la somme de a et b" ) ;
                System.out.println( "donne la valeur de a" ) ;
                a = scanner.nextInt();
                System.out.println( "donne la valeur de b" ) ;
                b = scanner.nextInt() ;
                som = a + b ;
                System.out.println( " la somme est " + som ) ;

                System.out.println( " vous voulez reprendre O/N " ) ;
                confirmation = scanner.next().charAt(0);

            } while ( confirmation == 'o' ) ;
        }


        System.out.println( " Fin du programme !! " );




    }
}