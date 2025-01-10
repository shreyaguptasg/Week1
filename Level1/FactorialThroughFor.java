import java.util.Scanner;

class FactorialThroughFor{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int integer = sc.nextInt();
		int factorial=1;
		if(integer>0){
			for(;integer>=1; integer--){
				 factorial = factorial*integer;
			}
		  System.out.println(factorial);
		}
		else if(integer==0){
			System.out.println("1");
		}
		else{
		System.out.println("Factorial not possible");
		}
		sc.close();
	}
}
