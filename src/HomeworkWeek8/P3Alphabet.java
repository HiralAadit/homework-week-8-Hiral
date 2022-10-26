package HomeworkWeek8;

import java.util.Scanner;

public class P3Alphabet {

        public static void main(String[] args) {

           /* char ch = 'a';

            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is vowel");
                    break;
                default:
                    System.out.println(ch + " is consonant");
            }

            */
            Scanner in = new Scanner(System.in);
            System.out.println("Input an alphabet: ");
            String input = in.next().toLowerCase();

            boolean uppercase = input.charAt(0) >= 65 && input.charAt(0)<= 90;
            boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <=122;
            boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u");
            if (input.length()>1){
                System.out.println("Error. Not a single character. ");
            }
            else if (!(uppercase || lowercase)){
                System.out.println("Error.Not a letter.Enter uppercase or lowercase. ");
            }
            else if (vowels){
                System.out.println(" Input letter is Vowel ");
            }
            else {
                System.out.println("Input letter is Consonant");
            }

        }


    }




