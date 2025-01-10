import java.util.Scanner;

class NumberCheck{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();//created a variable and taken an input from the user
		if(number>0){
			System.out.println("The number" + number + " is positive");
		}
		else if(number<0){
			System.out.println("The number" + number + " is negative");
		}
		else{
			System.out.println("The number" + number + " is zero");
		}
		sc.close();
	}
}