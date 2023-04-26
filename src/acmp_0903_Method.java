import java.util.Random;
import java.util.HashSet;
import java.util.Set;

public class acmp_0903_Method {
    public static void main(String[] args) {
        twoSameBalls(100000, 100); // huw many times
        // will you took the balls until get the same color
        fullLine(10000, 10); // how many attempts do you need
        // to collect FullHouse from specified by you row
        guessNumber(100000, 10, 5);
    }
    public static void twoSameBalls (int iteration, int balls){
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        double temp = 0; // cumulative number of balls taken in all iterations
        double count = 0; // number of balls taken until the same appears in one iteration
        while (count < iteration) {
            int x = random.nextInt(balls) + 1;
            if (set.contains(x)) {
                temp += set.size() +1;
                set.clear();
                count += 1;
            } else {
                set.add(x);
            }
        }
        double avg = temp / iteration;
        System.out.println("You took the balls  " + temp + " times in " + iteration + " iterations." );
        System.out.println("The second same ball will have the nuber "
                + avg + " in a row of " + balls + " iterations");
    }


    public static void fullLine(int iteration, int fullLineRow){
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        double temp = 0; // how many attempts do you need to collect FullHouse in each iteration
        double count = 0; // number of iteration
        while (count < iteration) {
            count += 1;
            while (set.size() < fullLineRow) {
                int x = random.nextInt(fullLineRow) + 1;
                set.add(x);
                temp += 1;
            }
            set.clear();
        }
        System.out.println();
        System.out.println("You tried to collect Full Line. You checked it " + iteration + " times");
        System.out.println("To collect Full Line from row of " + fullLineRow + " you will need "
                + temp / iteration + " steps");

    }

    public static void guessNumber (int iterations, int numbers, int guess){
        Random random = new Random();
        double count = 0;
        double count2 = 0;
        double count3 = iterations;
        double tempResult = 0;
        double randomValue = 0;
        while (count2 <= count3 ){
            while (randomValue != guess) {
                randomValue = random.nextInt(numbers) + 1;
                count++;
                if (randomValue == guess) {
                    count2++;
                    tempResult += count ;
                    count = 0;
                    randomValue = 0;
                    break;
                }
            }
            count3 --;
        }
        double result = tempResult / count2;
        System.out.println("The average numbers of guesses to find your guess in  "
        + iterations+ " iterations is " + result);
    }
}







//        set.contains()
//        set.size()
//        set.add()







//                // добавим в список ряд элементов
//                states.add("Germany");
//                states.add("France");
//                states.add("Italy");
//                // пытаемся добавить элемент, который уже есть в коллекции
//                boolean isAdded = states.add("Germany");
//                System.out.println(isAdded);    // false
//
//                System.out.printf("Set contains %d elements \n", states.size());    // 3
//
//                for(String state : states){
//
//                    System.out.println(state);
//                }
//                // удаление элемента
//                states.remove("Germany");
//
//                // хеш-таблица объектов Person
//                HashSet<Person> people = new HashSet<Person>();
//                people.add(new Person("Mike"));
//                people.add(new Person("Tom"));
//                people.add(new Person("Nick"));
//                for(Person p : people){
//
//                    System.out.println(p.getName());
//                }
//            }
//        }
//        class Person{
//
//            private String name;
//            public Person(String value){
//
//                name=value;
//            }
//            String getName(){return name;}
//        }
//
//
//    }
//}

//        Random random = new Random();
//
//        int a = 0;
//        int b = 0;
//        int c = 0;
//        int d = 0;
//        int e = 0;
//        int f = 0;
//        int g = 0;
//        int h = 0;
//        int i = 0;
//        int j = 0;
//        int count = 0;
//        int count2 = 0;
//        int temp = 0;
//        int iteration = 100000000;
//
//
//        while (count2 < iteration) {
//            count2 += 1;
//
//            while (a <= 1 || b <= 1 || c <= 1 || d <= 1 || e <= 1 ||
//                    f <= 1 || g <= 1 || h <= 1 || i <= 1 || j <= 1) {
//                int x = random.nextInt(10) + 1;
//                count++;
//                if (x == 1) {
//                    a += 1;
//                }
//                if (a > 1) {
//                    temp += count;
//                    break;
//                }
//                if (x == 2) {
//                    b += 1;
//                }
//                if (b > 1) {
//                    temp += count;
//                    break;
//                }if (x == 3) {
//                    c += 1;
//                }
//                if (c > 1) {
//                    temp += count;
//                    break;
//                }if (x == 4) {
//                    d += 1;
//                }
//                if (d > 1) {
//                    temp += count;
//                    break;
//                }if (x == 5) {
//                    e += 1;
//                }
//                if (e > 1) {
//                    temp += count;
//                    break;
//                }if (x == 6) {
//                    f += 1;
//                }
//                if (f > 1) {
//                    temp += count;
//                    break;
//                }if (x == 7) {
//                    g += 1;
//                }
//                if (g > 1) {
//                    temp += count;
//                    break;
//                }if (x == 8) {
//                    h += 1;
//                }
//                if (h > 1) {
//                    temp += count;
//                    break;
//                }if (x == 9) {
//                    i += 1;
//                }
//                if (i > 1) {
//                    temp += count;
//                    break;
//                }if (x == 10) {
//                    j += 1;
//                }
//                if (j > 1) {
//                    temp += count;
//                    break;
//                }
//            }
//            count = 0;
//            a = 0;
//            b = 0;
//            c = 0;
//            d = 0;
//            e = 0;
//            f = 0;
//            g = 0;
//            h = 0;
//            i = 0;
//            j = 0;
//        }
//        double avg = temp / iteration;
//        System.out.println("Temp = " + temp);
//        System.out.println("Iteration = " + iteration);
//        System.out.println("AVG = " + avg);
//    }
//}
