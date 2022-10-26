package HomeworkWeek8;

import java.util.Scanner;

public class P2MinAndMaxInputChallenge {
   /* public static void main(String[] args) {

    }

    public static void minMax(){
       /* Scanner sc = new Scanner(System.in);
        System.out.println("How many number you want to enter?" );
        int number = sc.nextInt();
        System.out.println("Number 1:  ");
        int firstNum = sc.nextInt();
        int min = firstNum;

        /*for (int i = 2; i <= number; i++) {
        System.out.print("Number " + i + ": ");
        int num = console.nextInt();
        if (num < min) {
            min = num;
        } else if (num > max) {
            max = num;
        }
    }

    System.out.printf("Smallest = %d\n", min);
    System.out.printf("Largest = %d\n", max);
}




    }
        */
   public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int num1, num2, max, min;
       System.out.println("Enter First Number:  ");
       num1= scan.nextInt();
       System.out.print("Enter another number: ");
       num2=scan.nextInt();
       max=Math.max(num1,num2);
       min=Math.min(num1,num2);
       while (num2!=-99){
           System.out.print("Enter a number or -99 to stop: ");
           num2=scan.nextInt();
           if(num2!=-99){
               max=Math.max(max,num2);
               min=Math.min(min,num2);
           }

       }
       System.out.println("largest is: "+max);
       System.out.println("Smallest is: "+min);
       scan.close();

   }

}


































