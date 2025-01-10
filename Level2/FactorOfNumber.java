
import java.util.*;

class FactorOfNumber{
	public static void main(String [] args){
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = cs.nextInt();
		int result = 1;
		for(int i=1; i<number; i++){
			if(number%i==0){
				System.out.println(i);
			}
			
		}
		
	
		cs.close();
	}
	
}

