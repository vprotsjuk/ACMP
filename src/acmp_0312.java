import java.util.Scanner;

public class acmp_0312 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(   second  +  (second - first)  * (d - 2  )        );
    }
}
