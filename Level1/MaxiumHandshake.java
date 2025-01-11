import java.util.*;
public class MaxiumHandshake{
	//method to calculate the maxium handshake are made
	public int numberOfHandshake(int number){
		int result = (number*(number-1))/2;
		return result;
	}
	
	public static void main(String [] args){
		//created a scanner class to take input from the user for numberOfStudents
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numberOfStudents");
		int number = sc.nextInt();
		
		
		//object of class MaxiumHandshake is formed and numberOfHandshake method is called
		MaxiumHandshake maxiumHandshake = new MaxiumHandshake();
		int ans = maxiumHandshake.numberOfHandshake(number);
		System.out.println("The maxium handshake are made by " + number + " students is " +ans);
		
		//scanner class is closed
		sc.close();
		
		
		
	}
	
}