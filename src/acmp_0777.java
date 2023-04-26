import java.util.Scanner;

public class acmp_0777 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        if (s < t){
            System.out.println(t - s);
        }else {
            System.out.println((t+12)-s);
        }
    }
}
