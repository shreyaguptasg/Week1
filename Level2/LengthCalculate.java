import java.util.*;
public class LengthCalculate{
	//Create a method to find and return a string's length without using the built-in length() method. 
	public static int findLength(String string){
		//The logic for this is to use the infinite loop to count each character till the charAt() method throws a runtime exception, handles the exception, and then return the count

		int i=0;
		try{
			for(; ;){
				string.charAt(i);
					i++;
			}
		}
        
		catch(IndexOutOfBoundsException e){
			return i;
		}
		
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String string = sc.next();
		//The main function calls the user-defined method as well as the built-in length() method and displays the result
		int builtInLength = string.length();
		int length = findLength(string);
		System.out.println(length + "\n" +builtInLength);
		sc.close();
		
	}
}
