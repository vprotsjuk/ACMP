import java.util.Scanner;

public class acmp_0539 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a == 1){
            System.out.println(0);

        }
        else  if (a % 2 == 0){
            System.out.println(a/2);
        }
        else {
            System.out.println(a);
        }
    }
}
