import java.util.Scanner;

/**
 * Self Problem 3: Power Calculation
 * A program that takes two numbers as input: a base and an exponent,
 * and prints the result of base raised to the exponent.
 */
public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Power Calculation ---");
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();
        
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power " + exponent + " is: " + result);
        
        scanner.close();
    }
}