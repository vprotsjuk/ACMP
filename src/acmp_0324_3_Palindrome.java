import java.util.Scanner;

public class acmp_0324_3_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int isPalindrom = a;;
        int reversedPalindrom = 0;
        while (isPalindrom > 0){
            reversedPalindrom  *= 10 ;
            reversedPalindrom += isPalindrom % 10;
            isPalindrom = isPalindrom / 10;

        }
        if (a == reversedPalindrom){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
