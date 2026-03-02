//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static Boolean Palindrome(String tab) {
        int i=0;
        int j = tab.length()-1;
        while (i<j){
            if(tab.charAt(i) == tab.charAt(j)){
                i++;
                j--;
            }else {
                return false;
            }
        }
        return true;

    }


        public static void main (String[]args){
            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
            // to see how IntelliJ IDEA suggests fixing it.
            System.out.println("Hello and welcome!");
            System.out.println("EXO P-9 ");
            String test = "ana";
            boolean c = Palindrome(test);
            System.out.println(c);

        }
    }
