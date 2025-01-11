
import java.util.Scanner;
 class ReverseNumbers{
	public static int findCount(int number){
		int index =0;
		while (number!=0) {
			number/=10;
			index++;
		}
		return index;
	}
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		//Take user input for a number. 
		int number = scn.nextInt();
		//Find the count of digits in the number. 
		int length = findCount(number);
		int[] arr = new int[length];
		//Find the digits in the number and save them in an array
		for (int i=0;i<length;i++) {
			arr[i] = number%10;
			number/=10;
		}
		for (int i=0;i<length ;i++) {
			System.out.print(arr[i]+"");
		}
	}
}