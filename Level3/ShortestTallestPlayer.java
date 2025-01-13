import java.util.*;
public class ShortestTallestPlayer {

	// method to Find the sum of all the elements present in the array.

   public static int sumOfElements(int [] heights){
		int sum =0;
		for(int i=0; i<heights.length; i++){
			sum += heights[i];
		}
		return sum;
    }
	
	// method to find the mean height of the players on the football team
	
	public static double meanOfElements (int sum, int numberOfPlayers){
		double mean = sum/numberOfPlayers;
		return mean;	
	}
	
	//method to find the shortest height of the players on the football team 

	public static int shortestHeight (int [] heights){
		int shortest = heights[0];
		for(int i=0; i<11; i++){
			shortest = Math.min(shortest, heights[i]);
		}
		return shortest;	
	}
	
	//method to find the tallest height of the players on the football team

	public static int tallestHeight (int [] heights){
		int tallest = heights[0];
		for(int i=0; i<11; i++){
			tallest = Math.max(tallest, heights[i]);
		}
		return tallest;	
	}


    
	
	
  public static void main(String[] args) {
   
	int [] heights = new int[11];
	for(int i=0; i<11; i++){
		heights[i] = (int)(Math.random() * (250-150+1)) + 150;
		System.out.println(heights[i]);
	}
	
	int sum = sumOfElements(heights);
	double mean = meanOfElements(sum, 11);
	int shortest_Height = shortestHeight(heights);
	int tallest_Height = tallestHeight(heights);
	
	System.out.println("sum of all the heights of players is " + sum);
	System.out.println("mean of all the heights of players is " + mean);
	System.out.println("shortest player  height is " + shortest_Height);
	System.out.println("tallest player height is " + tallest_Height);
	
	 
		
    
  }
}

