import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Method to calculate the length of a line
    public double calculateLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }


    public static void main(String[] args) {

        System.out.println("Start with Displaying Welcome to Line Comparison Computation Program");

        Scanner scanner = new Scanner(System.in);

        // Input coordinates for the line
        System.out.println("Enter coordinates for the line:");
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Create an object of the class and calculate the length of the line
        Main calculator = new Main();
        double length = calculator.calculateLength(x1, y1, x2, y2);

        // Display the length of the line
        System.out.printf("The length of the line is: %.2f%n", length);

        scanner.close();
    }
}

