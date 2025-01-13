import java.util.*;

class NumberChecker3{
	
	// Method to count the digits in a number
	public static int countDigits(int num){
		int count = 0;
		while(num != 0){
			num /= 10;
			count++;
		}
		
		return count;
	}
	
	// Method to store digits of the number in an array
	public static int[] createArray(int num, int n){
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = num % 10;
			num /= 10;
		}
		
		return arr;
	}
	
	// Method to reverse the array
	public static int[] reverseDigitsArray(int[] arr){
		for(int i=0; i<arr.length/2; i++){
			int temp = arr[i];
			arr[i] = arr[arr.length - i -1];
			arr[arr.length - i -1] = temp;
		}
		
		return arr;
	}
	
	// Method to compare two arrays
	public static boolean compareArray(int[] arr1, int[] arr2){
		if(arr1.length != arr2.length){
			return false;
		}
		
		for(int i=0; i<arr1.length; i++){
			if(arr1[i] != arr2[i]){
				return false;
			}
		}
		
		return true;
	}
	
	// Method to check whether number is a palindrome number or not
	public static boolean isPalindrome(int[] arr){
		for(int i=0; i<arr.length/2; i++){
			if(arr[i] != arr[arr.length - i -1]){
				return false;
			}
		}
		
		return true;
	}
	
	// Method to check whether number is a duck number or not
	public static void checkDuckNumber(int[] arr){
	    boolean isDuck = true;
		for(int i=0; i<arr.length; i++){
			if(arr[i] == 0){
				isDuck = false;
				break;
			}
		}
		
		if(isDuck){
			System.out.println("Number is a Duck number");
		}
		else{
			System.out.println("Number is not a Duck number");
		}
	}
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = input.nextInt();
		
		int count = countDigits(number);
		int[] digitsArray = createArray(number, count);
		for(int i=0; i<count; i++){
			System.out.print(digitsArray[i] + " ");
		}
		
		int[] reversedArray = reverseDigitsArray(digitsArray);
		for(int i=0; i<count; i++){
			System.out.print(reversedArray[i] + " ");
		}
		
		if(compareArray(digitsArray, reversedArray)){
			System.out.println("Arrays are equal");
		}
		else{
			System.out.println("Arrays are not equal");
		}
		
		if(isPalindrome(digitsArray)){
			System.out.println("Number is a palindrome number");
		}
		else{
			System.out.println("Number is not a palindrome number");
		}
		
		checkDuckNumber(digitsArray);
        		
        // Close the Scanner Object
		input.close();
	}
}