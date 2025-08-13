import java.util.Scanner;

/**
 * Main class that provides a menu to run all the individual programs
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n===== BridgeLabz Assignment =====\n");
            System.out.println("Assisted Problems:");
            System.out.println("1. Welcome to Bridgelabz");
            System.out.println("2. Add Two Numbers");
            System.out.println("3. Celsius to Fahrenheit Conversion");
            System.out.println("4. Area of a Circle");
            System.out.println("5. Volume of a Cylinder");
            System.out.println("\nSelf Problems:");
            System.out.println("6. Calculate Simple Interest");
            System.out.println("7. Perimeter of a Rectangle");
            System.out.println("8. Power Calculation");
            System.out.println("9. Calculate Average of Three Numbers");
            System.out.println("10. Convert Kilometers to Miles");
            System.out.println("0. Exit");
            
            System.out.print("\nEnter your choice (0-10): ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("\nRunning WelcomeToBridgelabz.java...");
                    WelcomeToBridgelabz.main(null);
                    break;
                case 2:
                    System.out.println("\nRunning AddTwoNumbers.java...");
                    // We don't pass the scanner to avoid closing it in the called program
                    AddTwoNumbers.main(null);
                    break;
                case 3:
                    System.out.println("\nRunning CelsiusToFahrenheit.java...");
                    CelsiusToFahrenheit.main(null);
                    break;
                case 4:
                    System.out.println("\nRunning AreaOfCircle.java...");
                    AreaOfCircle.main(null);
                    break;
                case 5:
                    System.out.println("\nRunning VolumeOfCylinder.java...");
                    VolumeOfCylinder.main(null);
                    break;
                case 6:
                    System.out.println("\nRunning SimpleInterest.java...");
                    SimpleInterest.main(null);
                    break;
                case 7:
                    System.out.println("\nRunning PerimeterOfRectangle.java...");
                    PerimeterOfRectangle.main(null);
                    break;
                case 8:
                    System.out.println("\nRunning PowerCalculation.java...");
                    PowerCalculation.main(null);
                    break;
                case 9:
                    System.out.println("\nRunning AverageOfThreeNumbers.java...");
                    AverageOfThreeNumbers.main(null);
                    break;
                case 10:
                    System.out.println("\nRunning KilometersToMiles.java...");
                    KilometersToMiles.main(null);
                    break;
                case 0:
                    System.out.println("Thank you for using the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            
            if (choice != 0) {
                System.out.println("\nPress Enter to continue...");
                scanner.nextLine(); // Consume the newline
                scanner.nextLine(); // Wait for user to press Enter
            }
            
        } while (choice != 0);
        
        scanner.close();
    }
}