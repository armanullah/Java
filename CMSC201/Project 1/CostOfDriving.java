import java.util.Scanner;

public class CostOfDriving {

    Scanner scanner = new Scanner(System.in);

    public void DrivingCost() {

        double distance;
        double mpg;
        double price;
        double cost;

        System.out.println("Enter the driving distance: ");
        distance = scanner.nextDouble();

        while(distance < 0) {
            System.out.println("Please enter a value greater than 0");
            distance = scanner.nextDouble();
        }

        System.out.println("Enter miles per gallon of vehicle: ");
        mpg = scanner.nextDouble();

        while(mpg < 0) {
            System.out.println("Please enter a positive value: ");
            mpg = scanner.nextDouble();
        }

        System.out.println("Enter price per gallon: ");
        price = scanner.nextDouble();

        while(price < 0) {
            System.out.println("Please enter a positive value: ");
            price = scanner.nextDouble();
        }

        cost = (distance/mpg) * price;

        System.out.println("The cost of driving is $: " + cost);
    }

}
