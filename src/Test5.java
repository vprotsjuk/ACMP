import java.util.*;

public class Test5 {
    public static void main(String[] args) {
        String origin = "I like java";
        String [] originArr = origin.split(" ");
        String ans = "";
        for (int i = originArr.length-1; i >=0; i-- ){
            ans += originArr[i] + " ";
        }
        System.out.println(ans.trim());


        String str = "I like Java";
        String[] words = str.split(" ");
        String reversedString = "";
        for (int i = words.length-1; i >= 0; i--) {
            String sb = new StringBuilder(words[i]).reverse().toString();
            reversedString += sb + " ";
        }
        System.out.println(reversedString.trim());

        String [] sss = new String[]{"aa", "bb", "cc", "aa"};
        Set<String> set = new HashSet<>();
        for (String s : sss){
            set.add(s);
        }
        String [] answer = new String[set.size()];
        int i = 0;
        for (String n : set){
            answer[i++] = n;
        }
        System.out.println(Arrays.toString(answer));


    }
}
