
import java.util.*;

class CountDigit{
	public static void main(String [] args){
		Scanner cs = new Scanner(System.in);
		int count =0;
		int number= cs.nextInt();
		
		
		while(number!=0){
			int remainder = number%10;
			number /=10;
			count++;
			
		}
		
			System.out.println("The count of the digit is " +count);
		
		
		
		cs.close();
	}
	
}


			
			