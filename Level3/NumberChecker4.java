import java.util.*;

class NumberChecker4{
	
	// Method to find number is prime or not
	public static boolean isPrime(int num){
		
        if(num <= 1){
			return false;
		}
		else{
			for (int i = 2; i < num/2; i++){
				if (num % i == 0){
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void isNeon(int num){
	    int sum = 0;
		int squaredNum = (int)Math.pow(num, 2);
		while(squaredNum != 0){
		    sum += squaredNum % 10;
			squaredNum /= 10;
		}
		
		if(sum == num){
			System.out.println(num + " is a Neon number");
		}
		else{
			System.out.println(num + " is not a Neon number");
		}
	}
	
	public static void isSpy(int num){
		int sum = 0, product = 1;
		int numCopy = num;
		while(num != 0){
		    sum += num % 10;
			num /= 10;
		}
		
		while(numCopy != 0){
		    product *= numCopy % 10;
			numCopy /= 10;
		}
		
		if(sum == product){
			System.out.println(num + " is a Spy number");
		}
		else{
			System.out.println(num + " is not a Spy number");
		}
	}
	
	// Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);

        return squareStr.endsWith(numStr);
    }

    // Method to check if a number is a buzz number
    public static void isBuzzNumber(int num) {
	    if(num % 7 == 0 || num % 10 == 7){
			System.out.println(num + " is a Buzz number");
		}
		else{
			System.out.println(num + " is not a Buzz number");
		}
    }
	
	public static void main(String[]args){
		
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = input.nextInt();
		
		if(isPrime(number)){
			System.out.println(number + " is a Prime number");
		}
		else{
			System.out.println(number + " is not a Prime number");
		}
		
		isNeon(number);
		
		if(isAutomorphic(number)){
			System.out.println(number + " is an Automorphic number");
		}
		else{
			System.out.println(number + " is not an Automorphic number");
		}
		
		isBuzzNumber(number);
		
        // Close the Scanner Object
		input.close();
	}
}