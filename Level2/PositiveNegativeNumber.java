import java.util.Scanner;
public class PositiveNegativeNumber  {
	//define a method which takes in number as a parameter and returns whether a number is positive or not

    public  static int isPositive( int number) {
		if(number>=0){
			 int result = isEven(number);
			 return result;
		}
		else{
			return -1;
		}
		
		
    }
		//define a method which takes number  as a parameter and returns even or odd number
	
	 public  static int isEven(int number) {
		if(number%2==0){
			return 0;
		}
		else {
			return 1;
		}
		
		
    }
	//created a method compatre to compare first and last number
	//1 for fristNumber greater than lastNumber
	//-1 for fristNumber lesser than lastNumber
	//0 for fristNumber equal to lastNumber
	public static int compare(int fristNumber, int lastNumber){
		if(fristNumber>lastNumber){
			return 1;
		}
		else if(fristNumber<lastNumber){
			return -1;
		}
		else{
			return 0;
		}
	}

    
	
	
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Taking input from the user.
    int [] number = new int[5];
	
	System.out.println("enetr numbers");
	for(int i=0; i<5; i++){
		
		number[i] =sc.nextInt();
	}
	int is_Positive=0;
	int firstelement = number[0];
	int lastelement = number[4];
	for(int i=0;i<number.length; i++){
		 is_Positive = isPositive(number[i]);
		//int is_Even =  isEven(number[i]);
		if(is_Positive ==1){
		System.out.println("number is positive and odd");
		
	}
		else if(is_Positive ==0){
			System.out.println("number is positive and even");
		
	}
		else{
		System.out.println("number is negative");
		}
	}
	int is_Compare = compare(firstelement, lastelement);
	
	
	
	if(is_Compare==1){
		System.out.println("1 for fristNumber greater than lastNumber");
		
	}
	else if(is_Compare ==0){
		System.out.println("0 for fristNumber equal to lastNumber");
		
	}
	else{
		System.out.println("-1 for fristNumber lesser than lastNumber");
	}
	
	
	
	
	 
		sc.close();
    
  }
}

