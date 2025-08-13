import java.util.Scanner;

/**
 * Self Problem 2: Perimeter of a Rectangle
 * A program to calculate the perimeter of a rectangle using the formula: Perimeter = 2 * (length + width).
 */
public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Perimeter of a Rectangle ---");
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle with length " + length + " and width " + width + " is: " + perimeter);
        
        scanner.close();
    }
}