
import java.util.*;

class greatestFactor{
	public static void main(String [] args){
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = cs.nextInt();
		int greatestFactor = 1;
		for(int i= number-1; i>=1; i--){
			if(number%i==0){
				greatestFactor=i;
				break;
			}
		}
		System.out.println(greatestFactor);
	
		cs.close();
	}
	
}

