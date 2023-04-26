import java.util.ArrayList;
import java.util.Scanner;

public class acmp_0324 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> palindrom = new ArrayList<>();
        int b = scanner.nextInt(); // value to defined count
        int a = b; // value for work
        int count = 1; // number right for /
        int left = 10; // number left for %
        while (b / 10 > 0){
            b = b / 10;
            count *= 10; // number null after coma
            }
        if (a < 10){
            System.out.println("YES");

        }
        else {
            while (count >= left) {
                if ((a - (a % count)) / count == a % left) {
                    count = count / 10;
                    left = left * 10;
                } else {
                    System.out.println("NO");
                    break;
                }
                System.out.println("YES");
                break;
            }
        }




        }
}

