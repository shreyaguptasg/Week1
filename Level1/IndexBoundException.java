/*Write a program to demonstrate ArrayIndexOutOfBoundsException
Hint => 
Define a variable of array of names and take input from the user
Write a Method to generate the Exception. Here access index larger then the length of the array. This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate ArrayIndexOutOfBoundsException. Here access index larger then the length of the array. This will generate a runtime exception. Use the try-catch block to handle the ArrayIndexOutOfBoundsException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/
import java.util.Scanner;

public class IndexBoundException {
    // Method to generate the ArrayIndexOutOfBoundsException 
    public static void generatorException(String [] names, int index) {
        
			if(index>=names.length || index<0){
			System.out.println("Exception occured");
			}		
        
    }
	// Method to handle the ArrayIndexOutOfBoundsException 
	 public static void handleException(String [] names, int index) {
			try{
				
					System.out.println(names[index]);
				
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("ArrayIndexOutOfBoundsException has occured");
			}
        
    }
	

    // Method to handle RuntimeException
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
        String []  names = new String[size];
		for(int i=0; i<size; i++){
			names[i] = sc.next();
		}
		System.out.println("Enter the position you want to access in the array");
		int position = sc.nextInt();
		generatorException(names, position);
		handleException(names, position);
		
		
		sc.close();
      } 
}