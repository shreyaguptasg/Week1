import java.util.Scanner;

class Factorial{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int integer = sc.nextInt();
		int factorial=1;
		if(integer>0){
			while(integer!=0){
				 factorial = factorial*integer;
				 integer--;
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

