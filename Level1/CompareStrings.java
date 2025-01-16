/* Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method
Hint => 
Take user input using the  Scanner next() method for 2 String variables
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String Built-In method to check if the results are the same and display the result 
*/
import java.util.*;
public class CompareStrings{

	public static boolean compareString(String string1, String string2){
		for(int i=0; i<string1.length(); i++){
			if(string1.charAt(i)!= string2.charAt(i)){
				return false;
			}
			
		}
		return true;
	}
	
	public static void main(String [] args){
	//used the scanner class to take input from the user 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string1");
		String  string1 = sc.next();
		System.out.println("Enter a string2");
		String  string2 = sc.next();
		
		boolean  result = compareString(string1,string2);
		
		if(result){
			System.out.print("Two strings are equal");
		}
		else{
			System.out.print("Two strings are not equal");
		}
		
		
		
		
		
	}
}		