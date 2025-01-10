import java.util.Scanner;

public class TriangularParkRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the sides of the triangular park
        System.out.print("Enter the first side of the triangular park (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the second side of the triangular park (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the third side of the triangular park (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculate the perimeter of the triangular park
        double perimeter = side1 + side2 + side3;

        // Convert the required distance (5 km) to meters
        double totalDistance = 5000; // 5 km in meters

        // Calculate the number of rounds required
        double rounds = totalDistance / perimeter;

        // Print the total number of rounds (rounded up to the nearest whole number)
        System.out.println("The total number of rounds the athlete will run is " + Math.ceil(rounds) + " to complete 5 km.");

        scanner.close();
    }
}

