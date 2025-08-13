import java.util.Scanner;

/**
 * Self Problem 5: Convert Kilometers to Miles
 * A program that takes the distance in kilometers as input from the user and converts it into miles
 * using the formula: Miles = Kilometers * 0.621371.
 */
public class KilometersToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Convert Kilometers to Miles ---");
        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();
        
        double miles = kilometers * 0.621371;
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles");
        
        scanner.close();
    }
}