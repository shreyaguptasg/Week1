import java.util.Scanner;

public class SmallestAndLargestNumber{
  public static int[] findSmallestAndLargest(int number1, int number2, int number3){
    int arr[] = new int[2]; // initializing answer array.
    
    //finding smallest
    if (number1 < number2 && number1 < number3) {
      arr[0] = number1;
    } else if (number2 < number1 && number2 < number3) {
      arr[0] = number2;
    } else {
      arr[0] = number3;
    }
    
    // finding Largest
    if (number1 > number2 && number1 > number3) {
      arr[1] = number1;
    } else if (number2 > number1 && number2 > number3) {
      arr[1] = number2;
    } else {
      arr[1] = number3;
    }
    
    return arr; // returning the array.
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Taking input from the user.
    System.out.print("Enter numbers: ");
    int number1 = sc.nextInt();
    int number2 = sc.nextInt();
    int number3 = sc.nextInt();
    
    // calling the method and storing it in the variable.
    int ans[] = findSmallestAndLargest(number1, number2, number3);
    System.out.println("The smallest number: " + ans[0] + " and largest number is: " + ans[1]);
    
  }
}