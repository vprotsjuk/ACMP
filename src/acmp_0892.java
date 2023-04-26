import java.util.Scanner;

public class acmp_0892 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        if (month <= 2 || month == 12) {
            System.out.println("Winter");
        }
        if (month >= 3 && month < 6) {
            System.out.println("Spring");
        }
        if (month >= 6 && month < 9) {
            System.out.println("Summer");
        }
        if (month >= 9 && month < 12) {
            System.out.println("Autumn");
        }
        if  (month > 12){
            System.out.println("Error");
        }
    }
}
