 HEAD
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

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int  FIBONACCI(int n){
        if(n<=1) {
            return n;
        }
        int a=0,b=1,res=0;
        for(int i=2;i<=n;i++){
            res=a+b;
            a=b;
            b=res;
        }
        return res;

    }


    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        int n=3;
        int verifi =FIBONACCI(n);
        System.out.println("F("+n+")="+verifi);
        c0b85d6 (ajouter des fichiers mes fichiers java)


    }
}
