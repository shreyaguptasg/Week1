import java.util.Scanner;


public class WindChill{
	public double calculateWindChill(double temperature, double windspeed){
		double result = 35.74 + (0.6215 *temperature) + (0.4275*temperature - 35.75) *(windspeed*0.16); 
		return result;
    
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Taking input from the user.
    System.out.print("Enter temperature: ");
    double temperature= sc.nextDouble();
	 System.out.print("Enter windspeed: ");
    double windspeed= sc.nextDouble();
   
    
    // calling the method and storing it in the variable.
	WindChill windchill = new WindChill();
    double ans = windchill.calculateWindChill(temperature, windspeed);
    System.out.println("The  windchill is " + ans);
	sc.close();
    
  }
}