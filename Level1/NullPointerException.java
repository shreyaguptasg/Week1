/*Write a Method to generate the Exception. Here define the variable text and initialize it to null. Then call one of the String Method to generate the exception
Write the Method to demonstrate NullPointerException. Here define the variable text and initialize it to null. Then write try catch block for handling the Exception while accessing one of the String method
From the main Firstly call the method to generate the Exception then refactor the code to call the method to handle the RuntimeException
*/
import java.util.*;
public class NullPointerException{
	public static void exception(String text){
		try{
		int length = text.length();
		}
		catch(Exception e){
			System.out.println("NullPointer Exception");
		}
	}
	public static void main(String [] args){
		String text =null;
	
		exception(text);
		
	}
}		