import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class acmp_0685 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sand =  new ArrayList<>();
        ArrayList<Integer> jars =  new ArrayList<>();
        sand.add(scanner.nextInt());
        sand.add(scanner.nextInt());
        sand.add(scanner.nextInt());
        jars.add( scanner.nextInt());
        jars.add( scanner.nextInt());
        jars.add( scanner.nextInt());
        sand.sort(Integer::compareTo);
        jars.sort(Integer::compareTo);

        System.out.println(sand.get(0) * jars.get(0)  + sand.get(1) * jars.get(1)  +sand.get(2) * jars.get(2));
    }
}
