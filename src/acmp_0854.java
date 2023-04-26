import java.util.Scanner;

public class acmp_0854 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tRoom = scanner.nextInt();
        int tCond = scanner.nextInt();
        String mode = scanner.next();
        if (mode.equals("heat")){
            System.out.println(Math.max(tCond, tRoom));
        }
        else  if (mode.equals("freeze")){
            System.out.println(Math.min(tCond, tRoom));
        }
        else  if (mode.equals("auto")){
            System.out.println(tCond);
        }
        else  if (mode.equals("fan")){
            System.out.println(tRoom);
        }
    }
}
