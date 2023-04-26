import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedClass {

    private int a;
    private int b;
    private int c;

    private class Div
    {
        void calc()
        {
            c = a / b;
        }
    }

    public NestedClass(int a, int b) {
        String error="";
        if(a<0)
        {
            error+="a must be more then zero";
        }
        if(b<0)
        {
            error+=" b must be more then zero";
        }
        if(error.length()>0)
        {
            throw  new IllegalArgumentException(error);
        }
        this.a=a;
        this.b=b;
    }
    public void calc()
    {
        new Div().calc();
    }

    public void setA(int a) {
        if(a<0)
        {
            throw  new IllegalArgumentException("a must be more then zero");
        }
        this.a = a;
    }

    public void setB(int b) {
        if(b<0)
        {
            throw  new IllegalArgumentException("b must be more then zero");
        }
        this.b = b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            try {
                NestedClass n = new NestedClass(sc.nextInt(),sc.nextInt());
                n.calc();
                System.out.println(n.c);
                break;
            }
            catch (ArithmeticException e)
            {
                System.out.println(e.getMessage());
            }
            catch (IllegalArgumentException e)
            {
                System.out.println(e.getMessage());
            }
            catch (InputMismatchException e)
            {
                System.out.println("You must input integer");
                sc = new Scanner(System.in);
            }
        }



    }


}
