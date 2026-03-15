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


    }
}