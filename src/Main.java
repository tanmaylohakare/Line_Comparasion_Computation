import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Method to calculate the length of a line
    public static double calculateLength(double x1, double y1, double x2, double y2)
    {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }


    public static void main(String[] args) {

        System.out.println("Start with Displaying Welcome to Line Comparison Computation Program");

        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
        System.out.println("Enter Co-ordinated for this First Line");
        System.out.println("Enter x1 : ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();
        // Input coordinates for Line 2
        System.out.println("Enter coordinates for Line 2:");
        System.out.print("Enter x1: ");
        double x3 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y3 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x4 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y4 = sc.nextDouble();

        Main checker = new Main();

        // Calculate lengths of both lines
        double length1 = checker.calculateLength(x1, y1, x2, y2);
        double length2 = checker.calculateLength(x3, y3, x4, y4);

        // Display lengths of the lines
        System.out.printf("The length of the line between points (%.2f, %.2f) and (%.2f, %.2f) is: %.2f%n", x1, y1, x2, y2, length1);
        System.out.printf("The length of the line between points (%.2f, %.2f) and (%.2f, %.2f) is: %.2f%n", x3, y3, x4, y4, length2);

        // Simplified logic to check equality
        if (length1 == length2) {
            System.out.println("The two lines are equal.");
        } else {
            System.out.println("The two lines are not equal.");
        }

        sc.close();




    }
}

