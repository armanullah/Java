import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Account {
    DecimalFormat df = new DecimalFormat("0.00");
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private String date;


    public static void Account(){

    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void getMonthlyInterestRate(double interestRate) {
        double monthlyInterestRate;
        monthlyInterestRate = interestRate/12;
    }

    public String dateCreated() {
        String date;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        date = dtf.format(now);
        return date;
    }

    public void withdraw(double money) {
        balance -= money;
        System.out.println("You have withdrawn: $" + df.format(money) + " your balance is now $" + df.format(balance));
    }

    public void deposit(double money) {
        balance += money;
        System.out.println("You have deposited: $" + df.format(money) + " your balance is now $" + df.format(balance));
    }
}
