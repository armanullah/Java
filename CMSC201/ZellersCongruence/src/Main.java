import java.util.Scanner;

/*
 * Class: CMSC201
 * Instructor:
 * Description: (Give a brief description for each Program)
 * Due: (<02/09/2020>)
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Arman Khan
*/


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int h; //day of the week
        int q; // day of the month
        int y; //year
        int m; // is month in number Jan is 13 and Feb is 14
        int j; // year/100
        int k; //year of century year % 100


        System.out.println("*********Zellers Congruence*********\n");

        //user enters year
        System.out.println("Enter year eg (2019): ");
        y = scanner.nextInt();

        while(y < 0) {
            System.out.println("Year cannot be negative. Please try again.");
            y = scanner.nextInt();
        }

        //user enters month
        System.out.println("Enter month: 1-12:");
        m = scanner.nextInt();

        while(m > 12 || m < 1) {
            System.out.println("Please enter a valid number corresponding to month: ");
            m = scanner.nextInt();
        }

        //user enters day of the month
        System.out.println("Enter the day of the month: (1-31): ");
        q = scanner.nextInt();

        while(q > 31 || q < 1) {
            System.out.println("Please enter a valid day (1-31)");
            q = scanner.nextInt();
        }

        j = y/100;
        k = y%100;

        if(m == 1) {
            m = 13;
        } else if (m == 2) {
            m = 14;
        }

        //Zellers congruence formula
        h  = (q + (13*(m+1)/5) + k + (k/4) + (j/4) + 5*j)%7;

        switch(h) {
            case 0:
                System.out.println("Day of the week is: Saturday");
                break;
            case 1:
                System.out.println("Day of the week is: Sunday");
                break;
            case 2:
                System.out.println("Day of the week is: Monday");
                break;
            case 3:
                System.out.println("Day of the week is: Tuesday");
                break;
            case 4:
                System.out.println("Day of the week is: Wednesday");
                break;
            case 5:
                System.out.println("Day of the week is: Thursday");
                break;
            case 6:
                System.out.println("Day of the week is: Friday");
                break;
            default:
                System.out.println("Something went wrong");
                break;
        }
        System.out.println("\n*********By Arman Khan*********");
    }
}
