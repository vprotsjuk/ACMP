import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class acmp_0061 {
    public static void main(String[] args) {
        List<Integer> list = readFile("basket.txt");
        System.out.println(list);


    }

    public static List<Integer> readFile(String path) {
        int a = 0;
        int b = 0;
        try (InputStream reader = new FileInputStream(path)) {
            Scanner scanner = new Scanner(reader);
            List<Integer> list = new ArrayList<>();
            while (scanner.hasNextInt()) {
                a +=  scanner.nextInt();
                b +=  scanner.nextInt();
            }
            if (a > b){
                System.out.println(1);
            }
            if (a < b){
                System.out.println(2);
            }
            if (a == b) {
                System.out.println("DRAW");
            }
            return list;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}

