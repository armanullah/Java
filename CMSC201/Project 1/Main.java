import java.util.Scanner;

/*
 * Class: CMSC201
 * Instructor:
 * Description: (Give a brief description for each Program)
 * Due:(<02/02/2020>)
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Armanullah Khan
*/


public class Main {

    public static void main (String[] args) {

            Scanner scanner = new Scanner(System.in);
            WindChillTemp windchill = new WindChillTemp();
            CostOfDriving costOfDriving = new CostOfDriving();

            windchill.WindChill();
            System.out.println("\n---- Driving cost program ----\n");
            costOfDriving.DrivingCost();

    }
}
