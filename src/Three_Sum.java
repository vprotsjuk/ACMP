import java.util.*;

public class Three_Sum {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(-21,7,1,-155,1,22,33,2,44,55,3);
        int k = 6;
        int two = 0;
        List<Integer> list = new ArrayList<>();
        list.add(nums.get(0));
        list.add(nums.get(1));
        list.add(nums.get(2));

        for (int i = 2; i < nums.size(); i++){
            two = k - nums.get(i);
            int twoSumRes = twoSum(list, two).get(0) + twoSum(list, two).get(1);
            if (nums.get(i) + twoSumRes != k) {
                list.add(nums.get(i));
            }

            else {
                ArrayList<Integer> result = new ArrayList<>();
                result.addAll(twoSum(list, two));
                result.add(nums.get(i));
                System.out.println(result);
                break;
            }
        }
    }
    static List<Integer> twoSum(List<Integer> list, int two) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list1.contains(two - list.get(i))) {
                return Arrays.asList((two - list.get(i)), list.get(i));
            } else {
                list1.add(list.get(i));
            }
        }
        return Arrays.asList(-9000, -9000);
    }
}
