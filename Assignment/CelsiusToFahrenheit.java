import java.util.Scanner;

/**
 * Assisted Problem 3: Celsius to Fahrenheit Conversion
 * A program that takes the temperature in Celsius as input and converts it to Fahrenheit
 * using the formula: Fahrenheit = (Celsius * 9/5) + 32.
 */
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Celsius to Fahrenheit Conversion ---");
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
        
        scanner.close();
    }
}