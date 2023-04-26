public class Recursion {
    public static void main(String[] args) {
//        System.out.println(rec(5,5));
    }
    public  int rec(int n, int m){
        if (n == 1 || m == 1){
            return 1;
        }else {
            return rec(n, m-1) + rec(n-1, m);
        }
    }
}
