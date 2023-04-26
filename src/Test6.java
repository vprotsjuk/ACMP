import java.util.*;

public class Test6 {
    public static void main(String[] args) {
        int [] arr = new int[]{2,4,3,5,2,1,2};
//        Set<Integer> set = new HashSet<>();
//        for (int i : arr){
//            set.add(i);
//        }
//        int [] ans = new int[set.size()];
//        int i = 0;
//        for (int x : set){
//            ans[i++] = x;
//        }
//        System.out.println(Arrays.toString(ans));
        List <Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            if (!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        int [] res  = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        System.out.println(Arrays.toString(res));

        String x = "Hello";
        x = x + "o";
        System.out.println(x);
        String b = x;
        String x1 = new String("Hello");
        System.out.println(x == x1);
        System.out.println(x == b);
        System.out.println(x.equals(x1));
    }
}
