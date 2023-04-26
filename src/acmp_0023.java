import java.util.Scanner;

public class acmp_0023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result = 0;
        int divisor = 1;
        while (divisor <= input / 2) {
            if (input % divisor == 0) {
                result += divisor;
            }
            divisor++;

        }
        System.out.println(result + input);
    }

}
