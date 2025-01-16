import java.lang.*;
import java.util.*;

class FormatException{
	
	// Method to demonstrate NumberFormatException
	public static void demonstrateException(String str){
		try{
			int number = Integer.parseInt(str);
			System.out.println("Number from string format to number format" + number);
		}
		catch(NumberFormatException e){
			System.out.println("Number Format exception handled, Invalid number");
		}
		catch(Exception e){
			System.out.println("Exception handled");
		}
	}
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String string = input.next();
		
		demonstrateException(string);
        		
        // Close the Scanner Object
		input.close();
	}
}