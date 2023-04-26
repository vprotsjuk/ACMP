import java.util.Scanner;

public class acmp_0692_Bit_Sdvig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();


        while ((a & 1) == 0) {    // пока в битовом  конце а находится "0"
            a = a >>1;                 // сдвиг вправо на один бит (равнозначно целочисленному делению на 2)
        }
        if (a == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }


    }
}

