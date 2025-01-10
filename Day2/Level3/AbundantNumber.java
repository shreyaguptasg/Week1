import java.util.*;

class AbundantNumber{
	public static void main(String [] args){
		Scanner cs = new Scanner(System.in);
		int sum =0;
		int number= cs.nextInt();
		
		
		for(int i=1; i<number; i++){
			if(number%i ==0){
				sum += i;
			}
		}
		
		if(sum>number){
			System.out.println("The number " + number + " is an Abundant Number");
		}
		else{
		System.out.println("The number " + number + " is  not an Abundant Number");
		}
		
		cs.close();
	}
	
}
			
			