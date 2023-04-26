import java.util.Scanner;

public class acmp_0233 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bridges = scanner.nextInt();
        int bridgeNumber = 0;
        while (bridgeNumber < bridges) {
            int bridgeHigh = scanner.nextInt();
            if (bridgeHigh <= 437) {
                System.out.println("Crash " +( bridgeNumber +1));
                break;
            } else {
                bridgeNumber++;
                if (bridgeHigh > 437 && bridges == bridgeNumber) {
                    System.out.println("No crash");
                }
            }
        }
    }
}











