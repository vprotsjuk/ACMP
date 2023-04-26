import java.util.ArrayList;
import java.util.Scanner;

public class acmp_0755 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int a = (scanner.nextInt());
        int b = (scanner.nextInt());
        int c = (scanner.nextInt());

        if ((a + b) < c) {
            System.out.println("Impossible");
        }
        else  {
            System.out.println(a + b - c);

        }
    }

}


