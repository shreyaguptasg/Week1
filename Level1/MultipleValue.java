import java.util.*;
class MultipleValue{
	public static void main(String [] args){
		//Create a variable to store an array of 10 elements of type double as well as a variable to store the total of type double initializes to 0.0. 
		//Also, the index variable is initialized to 0 for the array	
		Scanner sc = new Scanner(System.in);
		
		double total = 0.0;
		double [] element = new double[10];
		int index=0;
		while(true){ //Use infinite while loop as in while (true)
			//Take the user entry and check if the user entered 0 or a negative number to break the loop 			
			System.out.println("Enter an element");
			double doubleValue = sc.nextDouble();
			if(element[index]<=0 || index == 10){
				//Also, break from the loop if the index has a value of 10 as the array size is limited to 10.
				break;
			}
			else{
				element[index] = doubleValue;
				//If the user entered a number other than 0 or a negative number inside the while loop then assign the number to the array element and increment the index value
				index++;
			}
			
		}
		for(int i=0; i<10; i++){
			//Take another for loop to get the values of each element and add it to the total 		
			total += element[index];
		}
		System.out.println(total);
		//Finally display the total value
		sc.close();
			
	}
}
