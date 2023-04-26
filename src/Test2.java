public class Test2 {
    public static void main(String[] args) {
        double x = 1;
        while (Math.pow(x, x) != Math.pow(4, (x + 16))){
            double a = Math.pow(x, x);
            double b = Math.pow(4, (x + 16));
            x +=1;
        }
        System.out.println(x);
        System.out.println(Math.pow(x, x));
        System.out.println(Math.pow(4, (x + 16)));
    }
}
