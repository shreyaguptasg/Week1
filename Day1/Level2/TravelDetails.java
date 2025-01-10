import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user inputs for name, fromCity, viaCity, and toCity
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the starting city (fromCity): ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the city via which you are traveling (viaCity): ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter the destination city (toCity): ");
        String toCity = scanner.nextLine();

        // Take user inputs for distances in miles
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = scanner.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = scanner.nextDouble();

        // Take user input for the time taken
        System.out.print("Enter the total time taken for the journey (in hours): ");
        double timeTaken = scanner.nextDouble();

        // Calculate total distance
        double totalDistance = fromToVia + viaToFinalCity;

        // Calculate average speed
        double averageSpeed = totalDistance / timeTaken;

        // Take user input for fee and discount percentage
        System.out.print("Enter the total fee: ");
        int fee = scanner.nextInt();

        System.out.print("Enter the discount percentage: ");
        int discountPercent = scanner.nextInt();

        // Calculate discount and final amount
        int discountAmount = (fee * discountPercent) / 100;
        int finalFee = fee - discountAmount;

        // Print the results
        System.out.println("\nTravel Details Summary:");
        System.out.println("Name: " + name);
        System.out.println("Route: " + fromCity + " -> " + viaCity + " -> " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Average Speed: " + averageSpeed + " miles/hour");
        System.out.println("Fee after discount: $" + finalFee);

        System.out.println("\nThe results of Int Operations are: ");
        System.out.println("1. Total Fee: " + fee);
        System.out.println("2. Discount Amount: " + discountAmount);
        System.out.println("3. Final Fee: " + finalFee);

        scanner.close();
    }
}
