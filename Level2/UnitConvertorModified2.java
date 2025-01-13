import java.util.Scanner;
public class UnitConvertorModified2 {
	// Convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592; // Conversion factor
        return pounds * pounds2kilograms;
    }

    // Convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462; // Conversion factor
        return kilograms * kilograms2pounds;
    }

	
	
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Taking input from the user.
    System.out.print("Enter temperature in fahreneit: ");
    double fahrenheit = sc.nextDouble();
	System.out.print("Enter temperature in celsius: ");
    double celsius = sc.nextDouble();
	System.out.print("Enter temperature in pounds: ");
    double pounds = sc.nextDouble();
	System.out.print("Enter temperature in kilograms: ");
    double kilograms = sc.nextDouble();
	System.out.print("Enter temperature in gallons: ");
    double gallons = sc.nextDouble();
	System.out.print("Enter temperature in litres: ");
    double litres = sc.nextDouble();
	
	 
     System.out.println(fahrenheit + " Fahrenheit is " + convertFahrenheitToCelsius(fahrenheit) + " Celsius.");
     System.out.println(celsius + " Celsius is " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit.");
     System.out.println(pounds + " pounds is " + convertPoundsToKilograms(pounds) + " kilograms.");
     System.out.println(kilograms + " kilograms is " + convertKilogramsToPounds(kilograms) + " pounds.");
		sc.close();
    
  }
}

