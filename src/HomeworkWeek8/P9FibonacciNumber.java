package HomeworkWeek8;
/*9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class P9FibonacciNumber {
    public static void main(String[] args)
    {
        int a=0,b=1,c=0;
        System.out.println(a+"");
        System.out.println(b+"");

        for (int i=2;i<10;i++)
        {
            c=a+b;
            System.out.println(c+"");
            a=b;
            b=c;

        }

    }
}


