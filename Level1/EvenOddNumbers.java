import java.util.*;
class EvenOddNumbers{
	public static void main(String [] args){
		//created a variable number and take input from the user
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		//check for Natural Number. 
		//If not a natural number then print an error and exit the program

		if(number>=0){
			//Create an integer array for even and odd numbers with size = number / 2 + 1
			//Create index variables for odd and even numbers and initialize them to zero


			int [] even = new int[number/2 + 1];
			int [] odd = new int[number/2 + 1];
			int indexEven = 0;
			int indexOdd =0;
			//iterate from 1 to the number, and in each iteration of the loop,
			//save the odd or even number into the corresponding array
			System.out.print("Enter numbers: ");
			for(int i=1; i<=number; i++){
				int num = sc.nextInt();
				if(num%2==0){
					even[indexEven++] = num;
				}
				else{
					odd[indexOdd++] = num;
				}
			}
			//Finally, print the odd and even numbers array using the odd and even index

			for(indexOdd =0; indexOdd<odd.length; indexOdd++){
				
				System.out.println("Odd index are " + odd[indexOdd]);
			}
			for(indexEven =0; indexEven<even.length; indexEven++){
				
				System.out.println("Even index are " + even[indexEven]);
			}
		}
		else{
			 System.err.println("Invalid number");
			 System.exit(0);
		}
		sc.close();
			
	}
}

