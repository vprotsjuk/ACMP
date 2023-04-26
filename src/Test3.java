import java.util.HashMap;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int search = 20;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++){
                int res = search - arr[i] - arr[j];
                if(map.containsKey(res)){
                    System.out.println(res + ", " + arr[i] + ", " +  arr[j]);
                    break;
                }
                else {
                    map.put(arr[j], j);
                }
            }
            map.clear();
        }
    }
}
