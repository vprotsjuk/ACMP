import java.util.Scanner;

public class acmp_0550_Replace_Int_04d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        if ( ((k % 4 == 0)  &&  (k % 100 != 0))  || (k % 400 == 0) ){
            System.out.printf("12/09/%04d", k);
        }else {
            System.out.printf("13/09/%04d", k);
//            System.out.println(low + k);
        }

    }
}
