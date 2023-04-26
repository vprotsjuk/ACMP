import java.util.Scanner;

public class acmp_0106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int avers = 0; // avers = 1
        int reverse = 0; // reverse = 0
        if (total == 1){
            int side = scanner.nextInt();
            System.out.println(0);
        }
        else{
            while (scanner.hasNextInt()){
                int side = scanner.nextInt();
                if (side ==1){
                    avers += 1;
                }
                else {
                    reverse += 1;
                }
            }
            if (avers > reverse){
                System.out.println(reverse);
            }
            else {
                System.out.println(avers);
            }
        }


    }
}


