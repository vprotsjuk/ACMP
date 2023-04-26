import java.util.Scanner;

public class amcp_0942 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int e = scanner.nextInt();

        int f = scanner.nextInt();
        int g = scanner.nextInt();
        int h = scanner.nextInt();

        int sum_1 = (b+c+d);
        int sum_2 = (f+g+h);
        if (sum_1 > sum_2) {
            System.out.println(a);
        }
        else {
            System.out.println(e);
        }
        if (sum_1 == sum_2){
            if (a < e){
                System.out.println(a);
            }
            else {
                System.out.println(e);
            }
        }

    }
}
