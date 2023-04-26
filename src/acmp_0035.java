import java.util.Scanner;

public class acmp_0035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        while (k > 0){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            k--;
            System.out.println(19*m + (n + 239)*(n + 366) / 2);
        }
    }
}
