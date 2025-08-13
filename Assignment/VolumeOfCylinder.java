import java.util.Scanner;

/**
 * Assisted Problem 5: Volume of a Cylinder
 * A program to calculate the volume of a cylinder using the formula: Volume = π * radius^2 * height.
 */
public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Volume of a Cylinder ---");
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();
        
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Volume of the cylinder with radius " + radius + " and height " + height + " is: " + volume);
        
        scanner.close();
    }
}