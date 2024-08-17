import java.util.InputMismatchException;
import java.util.Scanner;

// Option: #2 Implementing Recursion to provide Sum
// This program is a console application where user will enter 5 numbers recursively and it will generate a sum of those 5 numbers recursively.
public class Main {
    static private int num = 5;
    static private int[] user_input_number;
    static Scanner s;
    
    public static void takeInput(int index) {
        if (index == num) {
            return;
        }
        System.out.printf("Enter Number %d: ", index + 1);
        
        try {
            user_input_number[index] = s.nextInt();
            takeInput(index + 1); // Recursive call for next input
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
            s.next(); // Clear the invalid input
            takeInput(index); // Retry the current index
        }
    }
    
    public static int calculateSum(int index) {
        if (index == num) {
            return 0;
        }
        int value = user_input_number[index];
        int ans = value + calculateSum(index + 1);
        return ans;
    }
    
    public static void main(String[] args) {
        System.out.println("< --------- Welcome to my Recursive Sum Program --------- >");
        System.out.println("< --------- Option: #2 Implementing Recursion to provide Sum --------- >\n");
        
        s = new Scanner(System.in);
        user_input_number = new int[num];
        
        try {
            takeInput(0);
            int recursiveSum = calculateSum(0);
            System.out.printf("\nSum of %d integers given by user is: %d\n", num, recursiveSum);
        } finally {
            s.close(); // Ensure the scanner is closed
        }
        
        System.out.println("< --------- Thanks for using my program --------- >");
    }
}
