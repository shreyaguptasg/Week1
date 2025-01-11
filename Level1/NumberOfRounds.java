import java.util.*;
public class NumberOfRounds{
	//method to calculate the number Of Rounds completed by the athelete
	public double numberOfRounds(int side1, int side2, int side3){
		//perimeter is calculated and then number_Of_rounds is computed
		int perimeter = (side1 + side2 + side3)*1000;
		int distancecovered = 5;
		
		
		double number_Of_rounds = perimeter/distancecovered;
		return number_Of_rounds;
	}
	
	public static void main(String [] args){
		//created a scanner class to take input from the user for numberOfStudents
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side 1 in meters");
		int side1 = sc.nextInt();
		System.out.println("Enter the side 2 in meters");
		int side2 = sc.nextInt();
		System.out.println("Enter the side 3 in meters");
		int side3    = sc.nextInt();
		
		
		//object of class NumberOfRounds is formed and numberofRounds method is called
		NumberOfRounds roundNumber = new NumberOfRounds();
		double ans = roundNumber.numberOfRounds(side1, side2, side3);
		System.out.println("The number of rounds completed by athelete is " + ans);
		
		//scanner class is closed
		sc.close();
		
		
		
	}
	
}