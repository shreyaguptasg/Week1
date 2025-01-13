import java.util.Scanner;

public class EuclideanDistanceAndLineEquation {

    // Method to calculate the Euclidean distance between two points
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // Euclidean distance formula
    }

    // Method to calculate the equation of the line given two points
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] equation = new double[2]; // To store slope (m) and y-intercept (b)
        
        // Calculate the slope (m)
        double m = (y2 - y1) / (x2 - x1);
        
        // Calculate the y-intercept (b)
        double b = y1 - m * x1;
        
        // Store m (slope) and b (y-intercept) in the array
        equation[0] = m;
        equation[1] = b;
        
        return equation;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input points (x1, y1) and (x2, y2)
        System.out.print("Enter the coordinates of the first point (x1 y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        
        System.out.print("Enter the coordinates of the second point (x2 y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        // Calculate the Euclidean distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.printf("The Euclidean distance between the two points is: %.2f\n", distance);
        
        // Find the equation of the line
        double[] equation = findLineEquation(x1, y1, x2, y2);
        
        // Display the equation of the line
        System.out.printf("The equation of the line is: y = %.2fx + %.2f\n", equation[0], equation[1]);
        
        scanner.close();
    }
}
