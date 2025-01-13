import java.util.Scanner;
public class UnitConvertor {
	// Method To convert kilometers to miles and return the value. 
	//Use the following code  double km2miles = 0.621371;

	public static double convertKmToMiles(double km){
		double result = km*0.621371;
		return result;
			
	}
	
	// Method To convert miles to kilometere and return the value. 
	//double miles2km = 1.60934;
	
	public static double convertMilesToKm( double miles){
		double result = miles*1.60934;
		return result;
			
	}
	//Method To convert meter to feet and return the value.
	//double meters2feet = 3.28084;
	public static double convertMeterToFeet( double feet){
		double result = feet*3.28084;
		return result;
			
	}
	//Method To convert feet to meter and return the value.
	//double feet2meters = 0.3048;
	
	public static double convertFeetToMeter( double meter){
		double result = meter*0.3048;
		return result;
			
	}
	
	
	
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Taking input from the user.
    System.out.print("Enter a distance in km: ");
    double km = sc.nextDouble();
	System.out.print("Enter a distance in miles: ");
    double miles = sc.nextDouble();
	System.out.print("Enter a distance in meter: ");
    double meter = sc.nextDouble();
	System.out.print("Enter a distance in feet: ");
    double feet = sc.nextDouble();
	 
    double km2miles = convertKmToMiles(km);
	double miles2km = convertMilesToKm(miles);
	double meters2feet = convertMeterToFeet(meter);
	double  feet2meters = convertFeetToMeter(feet);
	
	System.out.println("km2miles " + km2miles);
	System.out.println("miles2km " + miles2km);
	System.out.println("meters2feet " + meters2feet);
	System.out.println("feet2meters " + feet2meters);
	
	
		sc.close();
    
  }
}

