import java.util.Scanner;
public class LeapYear{
	//Leap year is divisible by 4 and not divisible by 100 or divisible by 400
	//calculating leap year by ceating a method 
	public static boolean leapYear( int year){
		if((year%4==0 && year%100!=0) || ( year%400==0)){
			return true;
		}
			return false;
		}
	
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Taking input from the user.
    System.out.print("Enter year: ");
    int year = sc.nextInt();
	 
    //check if the year is valid or not
	if(year>=1582){
		boolean ans = leapYear(year);
		if(ans){
		 System.out.println("It's a leap year");
		}
		else{
		 System.out.println("It's not a leap year");
		}
		
	}
	else{
		System.out.println("enter a year greater than 1582");
	}
		sc.close();
    
  }
}

