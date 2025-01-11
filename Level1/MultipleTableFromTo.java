import java.util.*;
class MultipleTableFromTo{
	public static void main(String [] args){
		//Take integer input and store it in the variable number 
		// define an integer array to store the multiplication result in the variable multiplicationResult
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int [] multiplicationResult = new int[10];
		//Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
		//Finally, display the result from the array in the format number * i = ___
		if(number>=6 && number<=9){
			for(int i=0; i<=9; i++){
				multiplicationResult[i] = number*(i+1);
				System.out.println(number + " *  " + (i+1) + " = " + multiplicationResult[i]);
			}
		}
		else{
			System.out.println("Entered number not in range");
		}
		sc.close();
			
	}
}
