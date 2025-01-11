import java.util.*;
public class NumberCheck {
	//method to check if number entered by user is negative, positive or zero
	//for negative return -1, for positive return 1 and for zero return zero
	public int number_Check(int number){
		if(number>0){
			return 1;
		}
		else if(number<0){
			return -1;
		}
		return 0;
	}
	
	public static void main(String [] args){
		//created a scanner class to take input from the user for number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		
		//object of class NumberCheck is formed and number_Check method is called
		NumberCheck  numberCheck = new NumberCheck ();
		int ans = numberCheck.number_Check(number);
		System.out.println("the entered number is " + number + " is " +ans);
		
		//scanner class is closed
		sc.close();
		
		
		
	}
	
}