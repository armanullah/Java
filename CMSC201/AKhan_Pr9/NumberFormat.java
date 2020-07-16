import java.util.Scanner;

public class NumberFormat {


    public static int bin2Dec(String binaryString) throws NumberFormatException {
        double j = 0;

        for (int i = 0; i < binaryString.length(); i++) {

            //throw exception if not 0 or 1
            if (binaryString.charAt(i) != '1' && binaryString.charAt(i) != '0') {
                throw new NumberFormatException();
            }

            //convert to decimal format
            if (binaryString.charAt(i) == '1') {
                j = j + Math.pow(2, binaryString.length() - 1 - i);
            }
        }
        return (int) j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        System.out.print("Enter a binary string: ");
        String binaryString = sc.next();

        try {

            System.out.println("Decimal: " + bin2Dec(binaryString));

        } catch (NumberFormatException e) {
            //print when exception occursbin
            System.out.println("Not a binary string.");

        }
    }
}
