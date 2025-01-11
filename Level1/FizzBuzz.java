import java.util.*;
class FizzBuzz{
	public static void main(String [] args){
		//created a variable number and take input from the user
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  the number ");
		int number = sc.nextInt();
		
		String [] result = new String[number];
		if(number>0){
			for(int i=0; i< number; i++){
				if(i%3==0 && i%5==0){
					result[i] = "FizzBuzz";
				}
				else if(i%3==0){
					result[i] = "Fizz";
				}
				else if(i%5==0){
					result[i] = "Buzz";
				}
				else{
					result[i] = Integer.toString(i);;
				}
			}
		}
		
		for(int i=0; i<number; i++){
			System.out.print(" Position " + (i) + " = " + result[i] + "");
		}
		sc.close();
			
	}
}

