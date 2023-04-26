import java.util.Scanner;

public class acmp_0081 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waterMelons = scanner.nextInt();
        int wmMax = 0;
        int wmMin = 30000;
        int count = 0;
        while (count < waterMelons){
            int nextWM = scanner.nextInt();
            count++;
            if (nextWM >= wmMax){
                wmMax = nextWM;
            }
            if (nextWM <= wmMin){
                wmMin = nextWM;
            }
        }
        System.out.println(wmMin + " " + wmMax);

    }
}
