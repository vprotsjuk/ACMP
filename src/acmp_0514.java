import java.util.Scanner;

public class acmp_0514 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        int a = 0;
        int b = 0;
        int c = -1;
        int count = 0;
            while (c < k) {
                a = c;
                b++;
                c = a + b;
                count++;

            }
            System.out.println((count -1));
        }
    }

