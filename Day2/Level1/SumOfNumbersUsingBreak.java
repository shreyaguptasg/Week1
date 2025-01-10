import java.util.Scanner;

class SumOfNumbersUsingBreak{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		double total = 0.0;
		double valueFromUser = sc.nextDouble();
		
		while(true){
			if(valueFromUser == 0 || valueFromUser<0){
				break;
			}
		   total+= valueFromUser;
		   System.out.println("Enter again");
		   valueFromUser = sc.nextDouble();
		 }
		 System.out.println(total);
		sc.close();
	}
}