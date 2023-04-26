import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Stack;

public class asteroid {
    public static void main(String[] args) {


        int[] asteroids = new int[]{8, -8};
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0) {
                stack.push(asteroids[i]);
                continue;
            } else if (asteroids[i] < 0 & stack.isEmpty()) {
                stack.push(asteroids[i]);
                continue;
            } else if (asteroids[i] < 0 & (stack.peek() < 0)) {
                stack.push(asteroids[i]);
                continue;
            } else if (asteroids[i] < 0 & (stack.peek() > 0 & (stack.peek() * -1 > asteroids[i]))) {
                stack.pop();
                i -=1;
                continue;
            } else if (asteroids[i] < 0 & (stack.peek() > 0 & (stack.peek() * -1 == asteroids[i]))) {
                stack.pop();
                continue;
            }
        }
        System.out.println(stack);

        int[] result = new int[stack.size()];
            for (int j = stack.size()-1; j >=0; j--) {
                result[j] = stack.pop();
            }
                System.out.println(stack);
                System.out.println(Arrays.toString(result));

    }
}







