import java.util.Scanner;

public class acmp_0692 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int square = 1;
        while (square <= a/2) {
            square = square * 2;
        }
        if (square == a) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }

    }
}
