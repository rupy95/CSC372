/**
 * TestBankAccount.java
 * Version 1.0
 * 
 * This class tests the functionalities of BankAccount and CheckingAccount classes.
 * 
 * Author: <Your Name>
 * Date: <Date>
 */

public class TestBankAccount {
    public static void main(String[] args) {

        System.out.println("\n<----------------- Welcome to the program for Bank Account ----------------->\n");

                // Create a BankAccount object
        System.out.println("<----------------- First Test Case ----------------->");
        BankAccount bankAccount = new BankAccount();
        bankAccount.setFirstName("John");
        bankAccount.setLastName("Marcus");
        bankAccount.setAccountID(123456);
        bankAccount.deposit(1000);
        bankAccount.withdrawal(200);
        bankAccount.accountSummary();

        // Create a CheckingAccount object
        System.out.println("\n<----------------- Second Test Case ----------------->");
        CheckingAccount checkingAccount = new CheckingAccount(1.5);
        checkingAccount.setFirstName("Helen");
        checkingAccount.setLastName("Peter");
        checkingAccount.setAccountID(654321);
        checkingAccount.deposit(500);
        checkingAccount.processWithdrawal(600);
        checkingAccount.displayAccount();

        System.out.println("\n<----------------- Thanks for using this program ----------------->\n");
    }
}
