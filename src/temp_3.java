import java.util.*;

public class temp_3 {
    public static void main(String[] args) {
        temp_3 Oleg = new temp_3();
        System.out.println(Oleg.hashCode());
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(null, "d");
        map.put(null, "f");
        map.put(2, "b");
        map.put(3, "c");
        map.put(3, "e");
        System.out.println(map);
        Integer y = 121;
        String a = " 12  1";
        System.out.println(a.replace(" ", ""));
//        System.out.println(Arrays.toString(a.split(" +")));
//        System.out.println(a);
        System.out.println("y byte value " + y.byteValue());
        System.out.println("a " + a.trim());
        System.out.println("y hashcode " + y.hashCode());
        System.out.println("y byte value " + y.hashCode());
        Set<Object> set = new HashSet<>();
        set.add(1);
        set.add("ab");
        set.add('c');
        set.add(null);
        set.add(3);
        System.out.println(set);
        System.out.println(sum(1,2,3));

        System.out.println(isYes());
        System.out.println(sum(1,21));
        System.out.println(rec(10));
        System.out.println("MW " + matrixWays(3,4));
        System.out.println(allSum(14));
        System.out.println("lastValueReturn " + lastValueReturn(100));
        System.out.println(allSumBetween(5,10));

        Vasya vasya = new Vasya("Vasya", "Pupkin", 25);
        System.out.println(vasya.firstName + " " + vasya.lastName + " " + vasya.age);
        System.out.println(-1);
        vasya.setFirstName("Vasilii");
        vasya.setLastName("Pupkevich");
        vasya.setAge(256);
        System.out.println(vasya.firstName + " " + vasya.lastName + " " + vasya.age);
        vasya.rename();
        System.out.println(vasya.firstName + " " + vasya.lastName + " " + vasya.age);

        System.out.println(-1);
        Vasya vasya1 = new Vasya();
//        vasya1.setFirstName("Oleg" + vasya1.ing(vasya1.firstName));

        vasya1.setAge(40);
        System.out.println(vasya1.firstName + " " + vasya1.lastName + " " + vasya1.age);
        vasya1.firstName = "Ochen'Oleg";
        System.out.println(vasya1.firstName + " " + vasya1.lastName + " " + vasya1.age);
//        System.out.println(vasya1.ing(vasya1.firstName));
        System.out.println(vasya1.firstName + " " + vasya1.lastName + " " + vasya1.age);

        List<Integer> ls = new ArrayList<>();
        ls.add(5);
        ls.add(4);
        ls.add(3);
        ls.add(2);
        ls.add(1);
//        list.sort
        Collections.sort(ls);

        String h = "Hello ";
        String w = "World";
        String hw = h.concat(w);
        System.out.println(hw);

        Map<Integer, Integer> mapp = new HashMap<>();
        mapp.put(11,0);
        mapp.put(21,1);
        mapp.put(31,2);
        System.out.println(mapp);
        System.out.println(mapp.get(21));
        System.out.println(mapp.get(11));
        System.out.println((mapp.containsValue(3)) ? "Yes" : "No");



    }
    static class Vasya{
        String firstName;
        String lastName;
        int age;
        String ing;
        public Vasya(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public Vasya() {
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
        public void rename (){
            firstName += "ing";
            lastName += "ing";
        }
    }






    public static int sum(int... numbers) {
        int result = 0;
        for (int number : numbers) { // Этот код пройдется по всем числам и сложит их
            result = result + number;
        }
        return result;
    }

    static boolean isYes(){
        boolean real = true;
        return real;
    }
    static int sum(int a, int b){
        return a - b;
    }
    static int rec (int k){
        if (k > 0){
            return k + rec(k-1);
        }
        else {
            return 0;
        }
    }
    static int matrixWays(int m, int n){
        if (m == 1 || n == 1)
            return 1;
        return matrixWays(m-1, n) + matrixWays(m, n-1);

    }
    static int allSum(int k){
        if (k == 0)
            return 0;
        return k + allSum(k-1);

    }
    static int lastValueReturn(int k){
        int res = 0;
        int number = 1;
        while (res < k){
            res += number;
            number++;
        }
        return number-1;
//        System.out.println(res);
    }
    static int allSumBetween(int start, int end){
        if (end > start) {
            return end + allSumBetween(start, end-1);
        }
        return end;

    }
}
