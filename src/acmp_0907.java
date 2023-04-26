import java.util.Scanner;

public class acmp_0907 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int r = scanner.nextInt();
        if (r * 2 <= w && r * 2 <= h) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
