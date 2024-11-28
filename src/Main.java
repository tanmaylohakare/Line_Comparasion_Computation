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

        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        Point point3 = new Point(x3, y3);
        Point point4 = new Point(x4, y4);

        // Create Line objects using the points
        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point3, point4);

        // Calculate lengths of both lines
        double length1 = line1.calculateLength();
        double length2 = line2.calculateLength();


        // Display lengths of the lines
        System.out.printf("Length of Line 1: %.2f%n", length1);
        System.out.printf("Length of Line 2: %.2f%n", length2);

        // Use compareTo method to compare the lines
        if (line1.compareTo(line2) > 0) {
            System.out.println("Line 1 is longer than Line 2.");
        } else if (line1.compareTo(line2) < 0) {
            System.out.println("Line 1 is shorter than Line 2.");
        } else {
            System.out.println("Both lines are of equal length.");
        }

        // Use equals method to check if the lines are equal
        if (line1.equals(line2)) {
            System.out.println("The lines are equal.");
        } else {
            System.out.println("The lines are not equal.");
        }

        sc.close();
    }
}
class Point {
    double x, y;

    // Constructor to initialize the point
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

// Line class representing a line using two points
class Line implements Comparable<Line> {
    Point start, end;

    // Constructor to initialize the line with two points
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    // Method to calculate the length of the line
    public double calculateLength() {
        return Math.sqrt(Math.pow(end.x - start.x, 2) + Math.pow(end.y - start.y, 2));
    }

    // compareTo method to compare lengths of two lines
    @Override
    public int compareTo(Line other) {
        return Double.compare(this.calculateLength(), other.calculateLength());
    }

    // equals method to compare if two lines are equal based on their length
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Line line = (Line) obj;
        return Double.compare(this.calculateLength(), line.calculateLength()) == 0;
    }
}


