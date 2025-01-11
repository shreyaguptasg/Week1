import java.util.*;
class NumberCheck{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		
		int [] number = new int[5];
		for(int i=0; i<number.length;i++){
			number[i] = sc.nextInt();
			if(number[i]>0){
				if(number[i]%2==0){
					System.out.println(number[i] + " is an even number");
				}
				else{
					System.out.println(number[i] + " is a odd number");
				}
				
			}
		    else if(number[i]<0){
				System.out.println(number[i] + " is a negative number");
			}
			else{
				System.out.println(number[i] + " is the number");
			}
			
			if(number[0] == number[4]){
				System.out.println("Numbers are equal");
			}
			else if(number[0] > number[4]){
				System.out.println(number[0] + " Numbers is greater than " + number[4]);
			}
			else{
				System.out.println(number[0] + " Numbers is less than " + number[4]);
			}
		}
		sc.close();
			
	}
}
