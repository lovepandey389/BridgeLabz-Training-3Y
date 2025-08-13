    public class Main {
    public static void main(String[] args) {

        // Assignment Operators
        int c = 15;
        System.out.println("\nAssignment Operators:");
        System.out.println("Simple Assignment: c = " + c);
        c += 5; // Add AND assignment
        System.out.println("Add AND: " + c);
        c -= 5; // Subtract AND assignment
        System.out.println("Subtract AND: " + c);

        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Comparison Operators
        System.out.println("\nComparison Operators:");
        System.out.println("Equal to: " + (a == b));
        System.out.println("Not Equal to: " + (a != b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than: " + (a < b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT: " + (!x));

        // Increment/Decrement Operators
        int d = 5;
        System.out.println("\nIncrement/Decrement Operators:");
        System.out.println("Pre-increment: " + (++d));
        System.out.println("Post-increment: " + (d++));
        System.out.println("Pre-decrement: " + (--d));
        System.out.println("Post-decrement: " + (d--));

        // Bitwise Operators
        System.out.println("\nBitwise Operators:");
        System.out.println("Bitwise AND: " + (a & b));
        System.out.println("Bitwise OR: " + (a | b));
        System.out.println("Bitwise XOR: " + (a ^ b));
        System.out.println("Bitwise NOT: " + (~a));
        System.out.println("Left shift: " + (a << 1));
        System.out.println("Right shift: " + (a >> 1));
    }
}
