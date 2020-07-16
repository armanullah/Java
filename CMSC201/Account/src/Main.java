
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //define variables for scanner to store account information in
        int accountID;
        double accountBalance;
        double withdrawAmount;
        double depositAmount;

        double monthlyInterestRate;
        DecimalFormat df = new DecimalFormat("0.00"); //display decimal to two places
        Account account = new Account();
        Scanner stdin = new Scanner(System.in);

        System.out.println("Please enter account ID: ");
        accountID = stdin.nextInt();

        System.out.println("Please enter account balance: ");
        accountBalance = stdin.nextDouble();
        while(accountBalance < 0) {
            System.out.println("Balance can not be negative. Please Re-enter: ");
            accountBalance = stdin.nextDouble();
        }

        System.out.println("How much would you like to withdraw? (Enter 0 if you do not wish to) ");
        withdrawAmount = stdin.nextDouble();

        while(withdrawAmount > accountBalance) {
            System.out.println("Can not withdraw. Insufficient funds. Please Re-enter: ");
            withdrawAmount = stdin.nextDouble();
        }

        System.out.println("How much would you like to deposit? (Enter 0 if not depositing)");
        depositAmount = stdin.nextDouble();


        //account methods
        account.setId(accountID);
        account.setBalance(accountBalance);
        account.setAnnualInterestRate(4.5); //hard coded since interest rate is always the same
        account.withdraw(withdrawAmount);
        account.deposit(depositAmount);

        monthlyInterestRate = (account.getAnnualInterestRate()/12); //calculate monthly interest rate
        System.out.println("Your current balance: $" + df.format(account.getBalance()));
        System.out.println("Your monthly interest rate: " + df.format(monthlyInterestRate) + "%");

        System.out.println("Account creation: " + account.dateCreated()); //prints out

    }
}
