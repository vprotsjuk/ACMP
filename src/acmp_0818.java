import java.util.*;

public class acmp_0818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> troyniky = new ArrayList<>();

        while (scanner.hasNextInt()){
            troyniky.add(scanner.nextInt());
        }
//        Collections.sort(troyniky);
        int result = 0;
        for (int i = 0; i < troyniky.size(); i ++) {
            result += troyniky.get(i)-1;
            }
        System.out.println(result+1);
        }
}
