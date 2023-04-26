public class Temp1 {
    public static void main(String[] args) {
        double a = 20.0;
        double b = 0.0;
        double res = 0;
        double temp = 0.0;
        while (b < 20){
            double c = a - b;
            temp = Math.pow(c, 2) * b;
            if (temp < res) {
                b -= 0.000001;
                c = a - b;
                temp = Math.pow(c, 2) * b;
                System.out.println(a-b);
                System.out.println(b);
                break;
            }
            res = temp;

            b += 0.000001;
        }
        System.out.println(temp);
        System.out.println("a " + Math.pow(20.0/3.0*2.0, 2) * 20.0/3.0);
    }
}
