
import java.util.Scanner;


public class FindFactors{
	public static int[]  findFactors(int number){
		int count =0;
		for(int i=1; i<number;i++){
		if(number%i==0){
			count++;
		}
		}
		int [] arr = new int[count];
		int j=0;
		for(int i=1; i<number; i++){
			if(number%i==0){
				arr[j] = i;
				j++;
			}
		}
		return arr;
	}
	
	public static int sumOfFactors( int [] factors){
		int sum_factors =0;
		
		for(int i=0; i< factors.length; i++){
			sum_factors += factors[i];
		}
		return sum_factors;
	}
	
	public static int productOfFactors(int [] factors){
		int product_factors =1;
		for(int i=0; i< factors.length; i++){
			product_factors *= factors[i];
		}
		return product_factors;
		
	}
	
	public static int sumOfSquares(int [] factors){
		int sum_of_squares =0;
		for(int i=0; i< factors.length; i++){
			sum_of_squares += Math.pow(factors[i],2);
		}
		return sum_of_squares;
		
	}
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Taking input from the user.
    System.out.print("Enter number: ");
    int number = sc.nextInt();
	 
    int [] factors = findFactors(number);
	int sum = sumOfFactors(factors);
	int product = productOfFactors(factors);
	int sumsquare = sumOfSquares(factors);
	
	for(int i=0; i<factors.length; i++){
		System.out.print(factors[i] );
	}
	System.out.println("sum " + sum);
	System.out.println("product " + product);
	System.out.println("sumsquare " + sumsquare);
    
     
	sc.close();
    
  }
}