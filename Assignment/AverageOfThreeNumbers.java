import java.util.Scanner;

/**
 * Self Problem 4: Calculate Average of Three Numbers
 * A program that takes three numbers as input from the user and prints their average.
 */
public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Calculate Average of Three Numbers ---");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();
        
        double average = (num1 + num2 + num3) / 3;
        System.out.println("Average of " + num1 + ", " + num2 + ", and " + num3 + " is: " + average);
        
        scanner.close();
    }
}