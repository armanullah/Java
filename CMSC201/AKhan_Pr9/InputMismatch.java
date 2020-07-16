import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {

     public static void main(String[] args) {
         boolean valid = true;
         Scanner stdin = new Scanner(System.in);

          while(valid) {
             try {
                 System.out.println("Enter an integer: ");
                 int int1 = stdin.nextInt();
                 System.out.println("Enter another integer: ");
                 int int2 = stdin.nextInt();
                 valid = false;
             } catch (InputMismatchException e) {
                 System.out.println("Please enter an integer.");
                 stdin.next();
             }
         }
     }
}
