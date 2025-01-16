/*Take user input using the  Scanner next() method to take the String variable and also the start and the end index to get the substring from the given text
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String built-in method substring() to get the substring and compare the two strings. And finally display the result
*/
import java.util.*;
public class SubStringCompare{

	public static boolean compareString(String string1, String string2){
		for(int i=0; i<string1.length(); i++){
			if(string1.charAt(i)!= string2.charAt(i)){
				return false;
			}
			
		}
		return true;
	}
	
	public static String findSubString(String string, int start , int end){
		String ans ="";
		for(int i=start; i<end; i++){
			ans += string.charAt(i);
		}
		return ans;
	}
	public static void main(String [] args){
	//used the scanner class to take input from the user 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string1");
		String  string = sc.next();
		System.out.println("Enter start index");
		int startIndex = sc.nextInt();
		System.out.println("Enter end index");
		int endIndex = sc.nextInt();
		
		String result = findSubString(string, startIndex, endIndex);
		String builtInSubString = string.substring(startIndex, endIndex);
		boolean ans = compareString(result, builtInSubString);
		
		System.out.println("SubString is " + result);
		
		if(ans){
			System.out.println("Two strings are equal");
		}
		else{
			System.out.println("Two strings are not equal");
		}
		
		
		
		
		
		
		
	}
}		