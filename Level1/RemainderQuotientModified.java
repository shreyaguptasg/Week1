import java.util.Scanner;

public class RemainderQuotientModified{
  public static int[] findRemainderAndQuotient(int number, int divisor){
    int arr[] = new int[2]; // initializing answer array.
    
    //finding quotient
	arr[0] = number/divisor;
	
    
    
    // finding Largest
   arr[1] = number%divisor;
    
    return arr; // returning the array.
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Taking input from the user.
    System.out.print("Enter number of chocolates: ");
    int number= sc.nextInt();
	 System.out.print("Enter number of children: ");
    int divisor = sc.nextInt();
   
    
    // calling the method and storing it in the variable.
    int ans[] = findRemainderAndQuotient(number, divisor);
    System.out.println("The  number of chocolates each children gets is : " + ans[0] + " and remaining chocolates is: " + ans[1]);
	sc.close();
    
  }
}