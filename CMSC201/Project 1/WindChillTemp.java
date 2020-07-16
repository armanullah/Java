import java.util.Scanner;

public class WindChillTemp {
    Scanner scanner = new Scanner(System.in);

    public void WindChill() {
        //Declare variables
        double ta; //outside temperature
        double v; //speed in mph
        final double FIRST_COEFFICIENT = 35.74;

        System.out.println("Enter a temperature in Fahrenheit between -58 F and 41 F: ");

        ta = scanner.nextDouble();

        while(ta <= -58 || ta >= 41) {
            System.out.println("Please enter an integer in the correct range");
            ta = scanner.nextDouble();
        }

        System.out.println("Enter a wind speed (>=2) in miles per hour: ");
        v = scanner.nextDouble();

        while(v < 2) {
            System.out.println("Please enter a number greater than 2: ");
            v = scanner.nextDouble();
        }

        // wind chill formula

        double wcTemp = FIRST_COEFFICIENT + 0.6215 * ta - FIRST_COEFFICIENT * Math.pow(v, 0.16) +
                0.4275 * ta * Math.pow(v, 0.16);

        System.out.println("The wind chill index is " + wcTemp);
    }
}
