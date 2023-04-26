import java.util.Scanner;

public class acmp_0756 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        ;
        int b = scanner.nextInt();
        ;
        if (a > 1 && b > 1) {
            System.out.println((a  - 1) * (b - 1));
        } else {
            System.out.println(0);
        }
    }
}
