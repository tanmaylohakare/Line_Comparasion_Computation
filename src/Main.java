import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Method to calculate the length of a line
    public static double calculateLength(double x1, double y1, double x2, double y2)
    {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static void compareLines(double length1, double length2) {
        int comparisonResult = Double.compare(length1, length2);
        if (comparisonResult > 0) {
            System.out.println("Line 1 is longer than Line 2.");
        } else if (comparisonResult < 0) {
            System.out.println("Line 1 is shorter than Line 2.");
        } else {
            System.out.println("Both lines are of equal length.");
        }
    }


    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
        Scanner sc = new Scanner(System.in);
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


        // Calculate lengths of both lines
        double length1 = calculateLength(x1, y1, x2, y2);
        double length2 = calculateLength(x3, y3, x4, y4);

        // Display lengths of the lines
        System.out.printf("Length of Line 1: %.2f%n", length1);
        System.out.printf("Length of Line 2: %.2f%n", length2);



        sc.close();
    }
}


