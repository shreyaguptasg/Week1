import java.util.*;
class MeanHeight{
	public static void main(String [] args){
		//Create a double array named heights of size 11 and 
		//get input values from the user.

		double [] heights = new double[11];
		Scanner sc = new Scanner(System.in);
	    double sum =0.0;
		for(int i=0; i<heights.length; i++){
			heights[i] = sc.nextDouble();
			//calculate  sum of all the elements present in the array.
			 sum =sum +heights[i];
			
		}
		//created a variable meanHeight and Divide the sum by 11 to find the mean height 

		double meanHeight = sum/11;
		// print the mean height of the football team
		System.out.println(meanHeight);
		sc.close();
			
	}
}

