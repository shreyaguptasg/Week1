import java.util.Scanner;

public class CollinearPoints {

    // Method to check if the points are collinear using the slope formula
    public static boolean arePointsCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);  // Slope between point A and point B
        double slopeBC = (y3 - y2) / (x3 - x2);  // Slope between point B and point C
        double slopeAC = (y3 - y1) / (x3 - x1);  // Slope between point A and point C

        // Check if slopes are equal
        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    // Method to check if the points are collinear using the area of triangle formula
    public static boolean arePointsCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the area of the triangle formed by the points
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        
        // If the area is zero, the points are collinear
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the three points
        System.out.print("Enter the coordinates of point A (x1, y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        
        System.out.print("Enter the coordinates of point B (x2, y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        System.out.print("Enter the coordinates of point C (x3, y3): ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        // Check if the points are collinear using the slope method
        if (arePointsCollinearUsingSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear (using slope formula).");
        } else {
            System.out.println("The points are NOT collinear (using slope formula).");
        }

        // Check if the points are collinear using the area method
        if (arePointsCollinearUsingArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear (using area formula).");
        } else {
            System.out.println("The points are NOT collinear (using area formula).");
        }

        scanner.close();
    }
}
