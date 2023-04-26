import java.util.Scanner;

public class acmp_0757 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long c2 = scanner.nextLong();
        long h6 = scanner.nextLong();
        long o1 = scanner.nextLong();
        long a = c2/2;
        long b = h6/6;
        long c = o1;
        if (c2 < 2 || h6 < 6 || o1 < 1){
            System.out.println(0);
        }
        else  if (a <= b && a <= c){
            System.out.println(a);
        }
        else if (b <= a && b < c){
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }
    }
}
