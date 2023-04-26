import java.util.Scanner;

public class acmp_0754 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int maxWeight = 0;
        boolean notCorrectMan = false;
        while (scanner.hasNextInt()) {
            a = scanner.nextInt();
            if ((a < 94) || (a > 727)) {
                notCorrectMan = true;
            }
            if (a >= maxWeight) {
                maxWeight = a;
            }
        }
        if (notCorrectMan) {
            System.out.println("Error");
        } else {
            System.out.println(maxWeight);
        }
    }
}

