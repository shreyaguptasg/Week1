import java.util.Scanner;
public class UnitConvertorModified {
	 public static double convertYardsToFeet(double yards) {
        double yards2feet = 3; // Conversion factor
        return yards * yards2feet;
    }

    // Convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333; // Conversion factor
        return feet * feet2yards;
    }

    // Convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701; // Conversion factor
        return meters * meters2inches;
    }

    // Convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254; // Conversion factor
        return inches * inches2meters;
    }

    // Convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54; // Conversion factor
        return inches * inches2cm;
    }
	
	
	
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Taking input from the user.
    System.out.print("Enter a distance in yards: ");
    double yards = sc.nextDouble();
	System.out.print("Enter a distance in feet: ");
    double feet = sc.nextDouble();
	System.out.print("Enter a distance in meter: ");
    double meters = sc.nextDouble();
	System.out.print("Enter a distance in inches: ");
    double inches = sc.nextDouble();
	
	 
    System.out.println(yards + " yards is " + convertYardsToFeet(yards) + " feet.");
    System.out.println(feet + " feet is " + convertFeetToYards(feet) + " yards.");
    System.out.println(meters + " meters is " + convertMetersToInches(meters) + " inches.");
    System.out.println(inches + " inches is " + convertInchesToMeters(inches) + " meters.");
    System.out.println(inches + " inches is " + convertInchesToCentimeters(inches) + " centimeters.");
	
		sc.close();
    
  }
}

