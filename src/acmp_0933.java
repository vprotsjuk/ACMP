import java.util.Scanner;

public class acmp_0933 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int t = scanner.nextInt();
        if (t == 0){
            System.out.println(0);
        }
        else if (a >= t){
            System.out.println(t * b);
        }else {
            System.out.println(a*b + (t-a)*c);
        }
    }
}
