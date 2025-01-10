import java.util.Scanner;

class OddEvenNumber{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int integer = sc.nextInt();
		int initialNumber=1;
		if(integer>0){
			for(;initialNumber<=integer; initialNumber++){
				 if(initialNumber%2==0){
					System.out.println("Number " + initialNumber + " is even");
				}
				else{
					System.out.println("Number " + initialNumber + " is odd");
				}
				
		    }
		}
		  
		
		sc.close();
	}
}

