import java.util.ArrayList;
import java.util.Scanner;

public class acmp_0324_2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if ((a / 1000) == (a % 10) && (a / 100 % 10) == (a / 10 % 10)) {
            System.out.println("YES");

        } else {
            System.out.println("NO");

        }
    }
}





