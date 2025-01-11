import java.util.*;
public class SpringSeason {
	//method to check if entered day and month is a Spring Season or not
	
	public boolean springSeason(int month, int day){
		 if ((month == 3 && day >= 20 && day <= 31) || (month >= 4 && month <= 5 && day >= 1 && day <= 31) || (month == 6 && day <= 20 && day <= 31)) {
            return true;
        } 
		return false;
	}
	
	public static void main(String [] args){
		//created a scanner class to take input from the user for month and day
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month");
		int month = sc.nextInt();
		System.out.println("Enter the day");
		int day = sc.nextInt();
		
		
		//object of class SpringSeason is formed and springSeason method is called
		SpringSeason spring_season = new SpringSeason();
		boolean  ans = spring_season.springSeason(month, day);
		if(ans){
			System.out.println("the entered date is a Spring Season");
		}
		else{
			System.out.println("the entered date is not a Spring Season");
		}
		
		
		//scanner class is closed
		sc.close();
		
		
		
	}
	
}