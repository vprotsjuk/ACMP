import java.util.Scanner;

public class acmp_0149_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = length-1; i >=0; i--) {
            System.out.print(array[i] + " ");
        }
//        System.out.println(Arrays.toString(array));
    }
}


