import java.util.*;
class Multiplication{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int [] table = new int[11];
		for(int i=1; i<=10;i++){
			table[i] = number*i;
			System.out.println(number + " * " + i + " = " + table[i]); 
		}
		sc.close();
			
	}
}
