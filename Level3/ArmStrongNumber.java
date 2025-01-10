import java.util.*;

class ArmStrongNumber{
	public static void main(String [] args){
		Scanner cs = new Scanner(System.in);
		int number = cs.nextInt();
		int sum =0;
		int digit = findDigit(number);
		
		int originalNUmber = number;
		while(originalNUmber!=0){
			int remainder = number%10;
			sum+= Math.pow(remainder, digit);
			originalNUmber= originalNUmber/10;
		}
		if(number== sum){
			System.out.println("The number is an armstrong number");
		}
		else{
			System.out.println("The number is not an  armstrong number");
		}
		
		
		cs.close();
	}
	static int findDigit(int number) {
			int size = 0;
			while (number != 0) {
			number /= 10;
			size++;
		}
        return size;
		}
}
			
			