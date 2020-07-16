/*
 * Class: CMSC201
 * Instructor:
 * Description: (Give a brief description for each Program)
 * Due: 2/16/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Armanullah Khan
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i;
        double temp; //variable to hold values
        double sum2 = 0.0; // sum of the squares
        double total = 0;

        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter 10 numbers.");

        for(i = 0; i < 10; i++) {
            System.out.println("Enter a number: ");
            temp = stdin.nextDouble();
            sum2 += temp*temp; //all the squares are added together
            total += temp;

        }

        System.out.println("The mean is " + mean(total, 10));

        //use a simplified variance formula:
        // (Sigma(Xi^2)/N) - mean^2

        double variance = (sum2/10) - Math.pow(mean(total, 10),2);
        double StdDeviation = Math.sqrt(variance);

        System.out.println("The Standard deviation is " + StdDeviation);
        double sum = 0;

        for (double d = 0; d < 10;) {
            d += 0.1;
            sum += sum + d;
        }

    }

    public static double mean(double sum, int n) { //method to calculate mean
        return sum/n;
    }

}
