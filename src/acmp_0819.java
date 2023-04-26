import java.util.Scanner;

public class acmp_0819 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long c = scanner.nextInt();
        System.out.println(a*b*2 + a*c*2 + c*b*2);
        System.out.println(a*b*c);
    }
}
