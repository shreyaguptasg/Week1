/*Write a program to convert the complete text to uppercase and compare the results
Hint => 
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is lowercase to the Upper Case. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toLowerCase() to get the Uppercase Text and compare the two strings using the user-defined method. And finally display the result
*/
import java.util.Scanner;

public class UpperCaseLowerCase {
    // Method to convert lowercase into uppercase 
    public static String  upperCase(String string) {
			String upper_case ="";
			for(int i=0; i<string.length(); i++){
				char ch = string.charAt(i);
				if(ch>= 'a' && ch<='z'){
					ch =(char)(ch - ('a' - 'A'));
				}
				upper_case +=ch;
			}
			return upper_case;
        
    }
	// Method to compare two strings  
	 public static boolean compare(String string1, String string2) {
			
			for(int i=0; i<string1.length(); i++){
				if(string1.charAt(i)!=string2.charAt(i)){
					return false;
				}
			}
			return true;
        
    }
	

 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = sc.nextLine();
		String upper_case = upperCase(string);
		System.out.println(upper_case);
		String lower_case = upper_case.toLowerCase();
		System.out.println(lower_case);
		boolean ans = compare(string, upper_case);
		boolean result = compare(upper_case, lower_case);
		if(ans){
			System.out.println("Strings are equal");
		}
		else{
			System.out.println("Strings are  not equal");
		}
		
		if(result){
			System.out.println("Strings are equal");
		}
		else{
			System.out.println("Strings are  not equal");
		}
		
		
		
		sc.close();
      } 
}