
import java.util.*;

class PowerNumber{
	public static void main(String [] args){
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = cs.nextInt();
		System.out.println("Enter the power");
		int power = cs.nextInt();
		int result = 1;
		for(int i=1; i<=power; i++){
			 result *= number;
			
		}
		System.out.println(result);
	
		cs.close();
	}
	
}

