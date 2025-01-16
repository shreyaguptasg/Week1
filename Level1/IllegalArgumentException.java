/*Write a program to demonstrate IllegalArgumentException
Hint => 
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate IllegalArgumentException. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception. Use the try-catch block to handle the IllegalArgumentException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/
import java.util.*;

class ArgumentException{
	public static void demonstrateException(String text, int index){
			try{
			if(index>text.length()){
			throw new IllegalArgumentException("Invalid index entered");
			}
			else{
				System.out.println(text.substring(index));
			}
		}
		catch(IllegalArgumentException e){
			System.out.println("Illegal Argument Exception handled");
		}
	}
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String text = input.next();
		System.out.println("Enter end index for creating substring");
		int endIndex = input.nextInt();	
	
		demonstrateException(text, endIndex );
		input.close();
		
	}
}