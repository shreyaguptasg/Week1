import java.util.*;

class Calculator{
	public static void main(String [] args){
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter first number");
		double first = cs.nextInt();
		System.out.println("Enter second number");
		double second = cs.nextInt();
		System.out.println("Choose an operator(+, -, *, /):");
		char op = cs.next().charAt(0);
		double result =0;
		
		switch(op){
			case '+': result= first + second;
					System.out.println("The addition of the number is " + result);
					break;
			case '-': result= first - second;
					System.out.println("The addition of the number is " + result);
					break;
			case '*': result= first*second;
					System.out.println("The addition of the number is " + result);
					break;
			case '/': result= first/second;
					System.out.println("The addition of the number is " + result);
					break;
			default: System.out.println("Invalid response");
		}
			
			
		
		
		cs.close();
	}
	
}