import java.util.ArrayList;
import java.util.List;

public class temp_2 {
    public static void main(String[] args) {
        //{9,1,2,3,9,4,5}
        int[] arr = {1,2,9,10,3,4,5};
//        int l = 0;
//        int r = arr.length-1;
        int res = 1;
        int max = 1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(999);
            list.add(arr[i]);
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    list.add(arr[j]);
                }
            }
        }

        System.out.println(max);
        System.out.println(list);
    }
}
