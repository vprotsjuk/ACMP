import java.util.Scanner;

public class acmp_0754_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (((a < 94) || (a > 727)) || ((b < 94) || (b > 727) )|| ((c < 94) || (c > 727))) {
            System.out.println("Error");
        } else {
            if ((a > b) && (a > c)) {
                System.out.println(a);
            }
            else if ((b > a) && (b > c)) {
                System.out.println(b);
            }
            else if ((c > a) && (c > b)) {
                System.out.println(c);
            }
        }
    }
}
