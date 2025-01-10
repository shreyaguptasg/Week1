
import java.util.*;

class PrimeNumber{
	public static void main(String [] args){
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = cs.nextInt();
		boolean isPrime = true;
		if(number<=1){
			isPrime = false;
		}
		else{
			for(int i=2; i<=Math.sqrt(number);i++){
				if(number%i==0){
					isPrime = false;
					break;
				
			    }
			}
			
				
			
			
		}
		
		if(isPrime){
		   System.out.println("Number is a prime number");
		}
		else{ System.out.println("Number is  not a prime number");
		}
		
		
		
		
		
		
		cs.close();
	}
	
}

