package HomeworkWeek8;
/*First And Last Digit Sum
Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needs to find the first and the last digit of the parameter number passed to the method,
using a loop and return the sum of the first and the last digit of that number.
 */

public class P7FirstAnsLastDigit {

    public static int sumFirstAndLastDigit(int number) {
        int lastDigit = 0;
        if (number >= 0) {
            lastDigit = number % 10;
            while (number > 9) {
                number = number / 10;
            }
            System.out.println("First number " + number + "Last number " + lastDigit + "Total= " + (number + lastDigit));
            return 0;
        } else {
            System.out.println(-1);
            return -1;
        }
    }

    public static void main(String[] args) {
        sumFirstAndLastDigit(252);
        sumFirstAndLastDigit(257);
        sumFirstAndLastDigit(0);
        sumFirstAndLastDigit(5);
        sumFirstAndLastDigit(-10);

    }

    }