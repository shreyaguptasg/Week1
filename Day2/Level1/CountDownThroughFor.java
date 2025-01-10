import java.util.Scanner;

class CountDownThroughFor{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int counter = sc.nextInt();
		for(;counter>0; counter--){
		  System.out.print(counter );
		 }
		sc.close();
	}
}