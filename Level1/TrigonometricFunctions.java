import java.lang.Math;
import java.util.Scanner;


public class TrigonometricFunctions{
	public double [] calculateTrigonometricFunctions(double angle){
		double [] arr = new double[4];
		arr[0] = Math.toRadians(angle);
		arr[1] = Math.sin(angle);
		arr[2] = Math.cos(angle);
		arr[3] = Math.tan(angle);
		
		
		
		return arr;
    
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Taking input from the user.
    System.out.print("Enter angle: ");
    double angle= sc.nextDouble();
	 
   
    
    // calling the method and storing it in the variable.
	TrigonometricFunctions trigonometricfun = new TrigonometricFunctions();
    double []ans = trigonometricfun.calculateTrigonometricFunctions(angle);
    System.out.println("The  trigonometric angles are " + ans[0] + " " + ans[1] + " " +ans[2] + " " +ans[3]);
	sc.close();
    
  }
}