import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test4 {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        int count = 0;
        for (int i = 0; i < l.size(); i++) {
            count += l.get(i);
        }
        System.out.println(count);


        int k = 2;
        List<String> list = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("bb");
        list.add("bb");
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
                ans.add("ACCEPT");
            } else if (map.get(s) < k) {
                map.put(s, map.get(s) + 1);
                ans.add("ACCEPT");
            } else {
                ans.add("REJECT");
            }
        }
        System.out.println(ans);

        int n = 6;
        int d = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= i; z++) {
                System.out.print("#");
            }
            System.out.println();
        }
        List<Integer> candles = new ArrayList<>();

        candles.add(4);
        candles.add(7);
        candles.add(11);
        candles.add(5);
        candles.add(7);
        candles.add(1);
        candles.add(3);
        int hi = 0;
        int c = 1;
        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) > hi) {
                hi = candles.get(i);
                c = 1;
            }
            else if (candles.get(i) == hi) {
                c += 1;
            }
        }
        System.out.println(candles);
        System.out.println(c);

    }
}

//        String[] passwords = {"aa", "bb", "bb", "bb"};
//        int k = 2;
//        List<String> answerList = new ArrayList<>();
//
//        Map<String, Integer> map = new HashMap<>();
//        for (int i = 0; i < passwords.length; i++) {
//            if (!map.containsKey(passwords[i])) {
//                map.put(passwords[i], 1);
//                answerList.add("ACCEPT");
//            } else if (map.get(passwords[i]) < k) {
//                map.put(passwords[i], map.get(passwords[i]) + 1);
//                answerList.add("ACCEPT");
//            } else {
//                answerList.add("REJECT");
//            }
//        }
//
//        System.out.println(answerList);
//    }
//}
