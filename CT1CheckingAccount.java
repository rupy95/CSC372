/**
 * CheckingAccount.java
 * Version 1.0
 * 
 * This class represents a checking account that inherits from BankAccount.
 * It includes functionality for overdraft fees and displaying account details
 * along with an interest rate.
 * 
 * Author: <Your Name>
 * Date: <Date>
 */

public class CheckingAccount extends BankAccount {
    private double interestRate;
    private static final double overdraftFee = 30.0;

    // Constructor
    public CheckingAccount(double interestRate) {
        super();
        this.interestRate = interestRate;
    }

    // Getter and Setter for interestRate
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Process withdrawal with overdraft fee
    public void processWithdrawal(double amount) {
        double balance = getBalance();
        if (amount > 0) {
            if (balance < amount) {
                super.withdrawal(amount);
                super.withdrawal(overdraftFee);
                System.out.println("Overdraft fee of $" + overdraftFee + " has been accessed from your account");
            } else {
                super.withdrawal(amount);
            }
        } else {
            System.out.println("You can't withdrawal a negative value. Please withdrawal a amount that is positive.");
        }
    }

    // Display account information
    public void displayAccount() {
        accountSummary();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
