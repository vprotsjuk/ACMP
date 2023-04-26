import java.util.Arrays;
import java.util.Scanner;

public class acmp_0149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        int left = 0;
        int right = length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;


        }
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
//        System.out.println(Arrays.toString(array));
    }
}
