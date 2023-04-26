import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class acmp_0021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }
        numbers.sort(Integer::compareTo);
        System.out.println((numbers.get(numbers.size() -1) ) -  numbers.get(0));
    }
}
