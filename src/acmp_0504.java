import java.util.Scanner;

public class acmp_0504 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        if (k == 0 || k % 3 == 0){
            System.out.println("GCV");
        }
        else  if (k % 3 == 1){
            System.out.println("VGC");
        }
        else  if (k % 3  == 2){
            System.out.println("CVG");
        }
    }
}
