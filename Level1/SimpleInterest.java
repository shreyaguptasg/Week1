import java.util.*;
public class SimpleInterest{
	//method to calculate the simple interest given principle, rate and time as parameters
	public int calculator(int principal, int rate, int time){
		int result = (principal*rate*time)/100;
		return result;
	}
	
	public static void main(String [] args){
		//created a scanner class to take input from the user for principal, rate and time
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principal");
		int principal = sc.nextInt();
		System.out.println("Enter rate");
		int rate = sc.nextInt();
		System.out.println("Enter time");
		int time = sc.nextInt();
		
		//object of class SimpleInterest is formed and calculator method is called
		SimpleInterest simpleInterest = new SimpleInterest();
		int ans = simpleInterest.calculator(principal, rate, time);
		System.out.println("Simple interest for principal " + principal + " rate " + rate + " % and time " + time + " years is " +ans);
		
		//scanner class is closed
		sc.close();
		
		
		
	}
	
}