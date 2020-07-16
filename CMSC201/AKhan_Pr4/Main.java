
import java.util.Scanner;

/*
 * Class: CMSC201
 * Instructor:
 * Description: (Give a brief description for each Program)
 * Due: 02/23/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Arman Khan
*/


public class Main {

    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);

        displayResult(inputData());

    }

    /** Return true if the card number is valid */
    public static boolean isValid(long number) {

        if((getSize(number) >= 13 && getSize(number) <= 16) &&
                (prefixMatched(number, 4) || prefixMatched(number, 5) ||
                        (prefixMatched(number, 37) || prefixMatched(number, 6)) &&
                                ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) %10 == 0))) {
            return true;
        } else {
            return false;
        }
    }

    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number) {
            int total = 0;
            String card = number + "";
            for(int i = getSize(number) - 2; i >= 0; i = i - 2) {
                total += getDigit(Integer.parseInt(card.charAt(i) + "") * 2);
            }
        return total;
    }

    /** Return this number if it is a single digit, otherwise,
     * return the sum of the two digits */
    public static int getDigit(int number) {
            if (number < 9)
        return number;
            else
                return number/10 + number % 10;
    }

    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number) {
            int total = 0;
            String card = number + "";
            for(int i = getSize(number) - 1; i >= 0; i = i - 2) {
                total +=Integer.parseInt(card.charAt(i) + "");
            }
        return total;
    }

    /** Return true if the digit d is a prefix for number */
    public static boolean prefixMatched(long number, int d) {

        return getPrefix(number, getSize(d)) == d;
    }


    /** Return the number of digits in d */
    public static int getSize(long d) {
            String card = d + "";
            return card.length();
    }

    /** Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number. */

    public static long getPrefix(long number, int k) {
            if(getSize(number) > k) {
                String card = number + "";
                return Long.parseLong(card.substring(0, k));
            }
            return number;
    }

    /** input credit card’s number from keyboard
     Return this credit Card’s number
     */
    public static long inputData() {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter a credit card number: ");
        long number = stdin.nextLong();
        return number;
    }

    /**
     Display result using a method println()
     */
    public static void displayResult(long number) {
        System.out.println(number + " is " + (isValid(number)? "valid" : "invalid"));
    }
}
