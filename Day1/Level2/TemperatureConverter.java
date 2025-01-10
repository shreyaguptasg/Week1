import java.util.*;
class TemperatureConverter{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int celsius = input.nextInt();
		double farenheitResult = (celsius * 9/5) + 32;
		
		
		System.out.println("The " + celsius + " celsius is " + farenheitResult + "fahrenheit");

		input.close();
 
}
}