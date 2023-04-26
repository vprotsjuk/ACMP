import java.util.Scanner;

public class acmp_0697 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int w= scanner.nextInt();
        int h = scanner.nextInt();
        if ( l == 0 || w == 0 || h == 0){
            System.out.println(0);
        }
        else {

            int wallSquare = (l + w) * 2 * h;
            int paintInJar = 16;
            int result = wallSquare / paintInJar;
            if (wallSquare % paintInJar == 0) {
                System.out.println(result);
            } else {
                System.out.println(result + 1);
            }
        }

    }
}
