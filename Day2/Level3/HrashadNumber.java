import java.util.*;

class HarshadNumber{
	public static void main(String [] args){
		Scanner cs = new Scanner(System.in);
		int sum =0;
		int number= cs.nextInt();
		int originalNumber =  number;
		
		
		while(number!=0){
			int remainder = number%10;
			sum += remainder;
			number /=10;
		}
		
		if(originalNumber%sum ==0){
			System.out.println("The number " + originalNumber + " is an Harshad Number");
		}
		else{
		System.out.println("The number " + originalNumber + " is  not an Harshad Number");
		}
		
		cs.close();
	}
	
}
			
			