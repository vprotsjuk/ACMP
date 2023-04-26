import java.util.ArrayList;
import java.util.Scanner;

public class acmp_0008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }
        if (numbers.get(0) * numbers.get(1) == numbers.get(2)) {
            System.out.println("YES");
        }
        else  {
            System.out.println("NO");

        }
    }

}

