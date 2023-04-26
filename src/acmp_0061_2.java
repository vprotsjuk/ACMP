import java.util.Scanner;

public class acmp_0061_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        while (scanner.hasNextInt()) {
            a += scanner.nextInt();
            b += scanner.nextInt();
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

    }
}
