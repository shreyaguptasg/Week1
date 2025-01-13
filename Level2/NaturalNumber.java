
import java.util.Scanner;


public class NaturalNumber{
	//calculating the sum of n natural numbers through recursion
		public static int recursionSum(int number){
			int result =0;
			if(number>=1){
				 result = number + recursionSum(number-1);
				
			}
		return result;
			
		}

	////calculating the sum of n natural numbers through formula
		public static int formulaSum(int number){
			int result =0;
			for(int i=1; i<=number; i++){
				result+= i;
			}
		return result;
			
		}
	
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Taking input from the user.
    System.out.print("Enter number: ");
    int number = sc.nextInt();
	 
    //check if the number is natural or not
	if(number>=0){
		int sumRecursion = recursionSum(number);
		int sumFormula = formulaSum(number);
		System.out.println("sum through recursion " + sumRecursion);
		System.out.println("sum through formula " + sumFormula);
	}
	else{
		System.exit(0);
	}
	
	
	
	
    
     
	sc.close();
    
  }
}