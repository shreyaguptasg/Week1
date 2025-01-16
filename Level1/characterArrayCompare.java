/*Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method, and display the result
Hint => 
Take user input using the  Scanner next() method to take the text into a String variable
Write a method to return the characters in a string without using the toCharArray() 
Write a method to compare two string arrays and return a boolean result
In the main() call the user-defined method and the String built-in ​​toCharArray() method, compare the 2 arrays, and finally display the result
*/
import java.util.*;
public class characterArrayCompare{

	public static boolean compareString(String string1, String string2){
		for(int i=0; i<string1.length(); i++){
			if(string1.charAt(i)!= string2.charAt(i)){
				return false;
			}
			
		}
		return true;
	}
	
	public static String [] characterArray(String string){
		String [] ans = new String[string.length()];
		for(int i=0; i<string.length(); i++){
			ans[i] = string.charAt(i);
		}
		return ans;
	}
	public static void main(String [] args){
	//used the scanner class to take input from the user 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string1");
		String  string = sc.next();
		
		char [] charString = characterArray(string);
		for(int i=0; i<charString.length; i++){
			System.out.print(charString[i]);
		}
		char [] builtInArray = string.toCharArray();
		boolean ans = compareString(charString, builtInArray);
		
		
		
		if(ans){
			System.out.println("Two strings are equal");
		}
		else{
			System.out.println("Two strings are not equal");
		}
		
		
		
		
		
		
		
	}
}		