
import java.util.*;

class MultipleOfNumber{
	public static void main(String [] args){
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = cs.nextInt();
		
		for(int i=100; i>=number; i--){
			if(number%i==0){
				System.out.println(i);
				continue;
			}
			
		}
		cs.close();
	}
	
}

