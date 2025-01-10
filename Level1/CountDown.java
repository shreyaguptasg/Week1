import java.util.Scanner;

class CountDown{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int counter = sc.nextInt();
		while(counter!=0){
			System.out.print(counter);
			counter--;
		}
		sc.close();
	}
}