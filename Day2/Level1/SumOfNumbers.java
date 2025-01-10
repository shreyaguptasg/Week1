
import java.util.Scanner;

class SumOfNumbers{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		double total = 0.0;
		double valueFromUser = sc.nextDouble();
		
		while(valueFromUser!=0){
		  total+= valueFromUser;
		   System.out.println("Enter again");
		  valueFromUser = sc.nextDouble();
		 }
		 System.out.println(total);
		sc.close();
	}
}


