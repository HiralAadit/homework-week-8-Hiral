package HomeworkWeek8;
/*8. Display right angle triangle of @ using nested for loops
 @
 @@
 @@@
 @@@@
 @@@@@

 */

public class P8RightAngle {


        public static void main(String[] args)
        {
            for (int i=1;i<=5;i++)
            {
                for (int j=1;j<=i;j++)
                {
                    System.out.print("@");
                }
                System.out.println("       ");
            }
        }
    }


