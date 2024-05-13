import java.util.Scanner;

public class DivisionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();

        try {
            // Attempt to perform division
            int result = divide(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero exception
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }

    // Method to perform division
    public static int divide(int numerator, int denominator) {
        // Check if denominator is zero
        if (denominator == 0) {
            // Throw an ArithmeticException if attempting to divide by zero
            throw new  ArithmeticException();
        }
        return numerator / denominator;
    }
}
