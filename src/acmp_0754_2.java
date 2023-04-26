import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class acmp_0754_2 {
    public static void main(String[] args) {
        List<Integer> list = readFile("Fatman.txt");
    }

    public static List<Integer> readFile(String path) {
        int a = 0;
        int maxWeight = 0;
        int flag = -1;
        try (InputStream reader = new FileInputStream(path)) {
            Scanner scanner = new Scanner(reader);
            List<Integer> list = new ArrayList<>();
            while (scanner.hasNextInt()) {
                a = scanner.nextInt();
                if ((a < 94) || (a > 727)) {
                    flag = -1;
                }
                if (a >= maxWeight) {
                    maxWeight = a;
                }
            }
            if (flag > -1) {
                System.out.println("Error");
            } else {
                System.out.println(maxWeight);
            }

            return list;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}




