package HomeworkWeek8;

import java.util.Scanner;

public class P1ReadingUserInputChallenge {

    public static void main(String[] args) {
        int sum = 0;
        int total = 1;
        Scanner sc = new Scanner(System.in);

        //int number = sc.nextInt();
        while (total <= 10) {
            System.out.println("Enter the number" + total);
            boolean checkNumber = sc.hasNextInt();

            if (checkNumber) {
                int number = sc.nextInt();
                sum += number;
                total++;

            } else {
                System.out.println("invalid number");
            }
            sc.nextLine();
        }
        System.out.println("sum of all numbers: " + sum);
        sc.close();

    }
}