import java.util.Random;

public class Test {
    public static void main(String[] args) {
//        1.1868143902809818
//        1.1868143902809816
//        1.1868149999925495


//        double x = 0.0;
//        while (Math.pow(4.0, x) + Math.pow(6.0, x) - Math.pow(9.0, x) >0.000001 ){
//            x +=0.000001;
//            if (Math.pow(4.0, x) + Math.pow(6.0, x) - Math.pow(9.0, x) <= 0.000001){
//                System.out.println(x);
//            }
//        }
        Random ran = new Random();

        double l = ran.nextDouble(-100.0, 100.0);
        double r = ran.nextDouble(-100.0, 100.0);
        while (Math.pow(4.0, l) + Math.pow(6.0, l) < Math.pow(9.0, l)){
            l = ran.nextDouble(-100.0, 100.0);
        }
        while (Math.pow(4.0, r) + Math.pow(6.0, r) > Math.pow(9.0, r)){
            r = ran.nextDouble(-100.0, 100.0);
        }
        double m = 0;
        while (Math.pow(4.0, m) + Math.pow(6.0, m) != Math.pow(9.0, m)) {
            m = (l + r) / 2;
            if ((Math.pow(4.0, m) + Math.pow(6.0, m)) > Math.pow(9.0, m)) {
                l = m;
            } else
                r = m;

        }
        System.out.println(m);
        System.out.println(Math.pow(4.0, m) + Math.pow(6.0, m) == Math.pow(9.0, m));

//        double x = 1;
//        double y = 3;
//        int count = 100;
//        double one = 0;
//        double two = 0;
//        while (count > 0) {
//            one = Math.pow(4, x) + Math.pow(6, x) - Math.pow(9, x);
//            two = Math.pow(4, y) + Math.pow(6, y) - Math.pow(9, y);
//            double z = one + two;
//            if (z < 0) {
//                y = (y - x) / 2 + x;
//            } else x = (y - x) / 2 + x;
//            count--;
//        }
//        System.out.println(x);
//        System.out.println(Math.pow(4, y) + Math.pow(6, y) == Math.pow(9, y));
    }
}
