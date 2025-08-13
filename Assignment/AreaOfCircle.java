import java.util.Scanner;

/**
 * Assisted Problem 4: Area of a Circle
 * A program to calculate the area of a circle using the formula: Area = π * radius^2.
 */
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Area of a Circle ---");
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of the circle with radius " + radius + " is: " + area);
        
        scanner.close();
    }
}