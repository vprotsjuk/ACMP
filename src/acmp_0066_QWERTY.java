import java.util.Scanner;

public class acmp_0066_QWERTY {
    public static void main(String[] args) {
        String [] qwerty = new String[]{"q", "w", "e", "r", "t", "y", "u", "i", "o", "p",
                                                "a", "s", "d", "f", "g", "h", "j", "k", "l",
                                                    "z", "x", "c", "v", "b", "n", "m"};
        int length = qwerty.length;;
       Scanner scanner = new Scanner(System.in);
       String a = scanner.next();
       for (int i = 0; i < length; i++){
           if ( a.equals(qwerty[length-1]) ){
               System.out.println(qwerty[0]);
               break;
           }
           if ( a.equals(qwerty[i]) ){
               System.out.println(qwerty[i+1]);
               break;
           }
       }

    }
}
