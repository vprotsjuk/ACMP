import java.util.*;

public class acmp_0940_String_Builder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        String word = scanner.next();
        for (int i = 0; i < word.length(); i++){
            if (i == k-1){
                continue;
            }
            System.out.print(word.charAt(i));
        }


    }
}



//        ArrayList<Character> list = new ArrayList<Character>();
//        for(char c : word.toCharArray()) {
//            list.add(c);
//        }
//        list.remove(k-1);
//
//
//        StringBuilder result = new StringBuilder();
//        for (Character ch : list) {
//            result.append(ch);
//        }
//        System.out.println(result);
//
//        // convert in string
//        String string = list.toString();
//
//        // print string
//        System.out.println(string);
//    }
//}
