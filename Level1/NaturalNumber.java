import java.util.*;
public class NaturalNumber {
	//method to check to calculate the sum of natural numbers entered by the user
	
	public int natural_number(int number){
		int result = number*(number+1)/2;
		return result;
	}
	
	public static void main(String [] args){
		//created a scanner class to take input from the user for number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		
		//object of class NaturalNumber is formed and natural_number method is called
		NaturalNumber naturalNumber = new NaturalNumber();
		int ans = naturalNumber.natural_number(number);
		System.out.println("The sum of " + number + " natural numbers is " + ans);
		
		//scanner class is closed
		sc.close();
		
		
		
	}
	
}