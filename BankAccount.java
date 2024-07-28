/**
 * BankAccount.java
 * Version 1.0
 * 
 * This BankAccount class represents a basic bank account with functionality for deposits,
 * withdrawals and display information.
 * 
 * 
 * Author: <Name>
 * Date: <Date>
 */

public class BankAccount {
    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    // Constructor
    public BankAccount() {
        this.balance = 0.0;
    }

    // Getter and Setter for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and Setter for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and Setter for accountID
    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("You can't deposit a negative value. Please deposit a amount that is positive.");
        }
    }

    // Withdrawal method
    public void withdrawal(double amount) {
        if (amount > 0) {
            balance -= amount;
        } else {
            System.out.println("You can't withdrawal a negative value. Please withdrawal a amount that is positive.");
        }
    }

    // Account summary
    public void accountSummary() {
        System.out.println("Account Summary:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Account ID: " + accountID);
        System.out.println("Balance: $" + balance);
    }
}
