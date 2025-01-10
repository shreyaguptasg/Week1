
import java.util.*;

class LogicalLeapYear{
	public static void main(String [] args){
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = cs.nextInt();
		
		if(year>=1582){
			if(year%4==0 && year%100==0 && year%400==0){
			   System.out.println("The year is a leap year");
		}
		else{
		    System.out.println("The leap is not a leap year");
			}
		}
		else{
			System.out.println("Invalid year");
		}
		
		
		
		cs.close();
	}
	
}

