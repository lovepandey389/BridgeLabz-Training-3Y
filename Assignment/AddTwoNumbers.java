import java.util.Scanner;

/**
 * Assisted Problem 2: Add Two Numbers
 * A program that takes two numbers as input from the user and prints their sum.
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Add Two Numbers ---");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
        
        scanner.close();
    }
}