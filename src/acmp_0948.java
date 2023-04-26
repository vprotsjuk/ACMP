import java.util.Scanner;

public class acmp_0948 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  K - Количество строк на странице
        //  N - Номер строки
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        if (n <= k){
            System.out.print(1 + " " + n);
        }
        else  if (n % k == 0){
            System.out.println(n / k + " "+ k);
        }
        else {
            System.out.print( (n / k +1 ) + " " + n % k);
        }
    }
}
