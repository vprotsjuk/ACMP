import java.util.Scanner;

public class acmp_0597 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r1  = scanner.nextInt();
        int r2  = scanner.nextInt();
        int r3  = scanner.nextInt();
        if ((r2 + r3) > r1){
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }

    }
}
