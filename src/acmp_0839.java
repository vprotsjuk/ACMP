import java.util.ArrayList;
import java.util.Scanner;

public class acmp_0839 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbers = scanner.next();
        ArrayList<Character> listNumbers = new ArrayList<Character>();
        for (char c : numbers.toCharArray()) {
            listNumbers.add(c);
        }
//        System.out.println(listNumbers);
        while (listNumbers.size() > 0){
            if (listNumbers.get(0).equals('0')){
                System.out.println("NO");
                break;
            }else {
                listNumbers.remove(0);

            }
            if (listNumbers.size() == 0){
                System.out.println("YES");
            }

        }
    }
}




