import java.util.*;
public class Generate4DigitRandomNumber {
	//method that generates array of 4 digit random numbers given the size as a parameter 
   public int[] generate4DigitRandomArray(int size){
		int [] fourDigitNumber = new int[size];
		for(int i=0; i<size; i++){
			fourDigitNumber[i] = (int)(Math.random()*9000)+1000;
		}
		return fourDigitNumber;

		
	}
	
	// method to find average, min and max value of an array 

	
	public double[] findAverageMinMax(int[] numbers){
		double [] result = new double[3];
		int ansMax = numbers[0];
		int ansMin = numbers[0];
		int sum = 0;
		for(int i=0; i<3; i++){
			 sum += numbers[i];
			ansMin = Math.min(ansMin, numbers[i]);
			ansMax = Math.max(ansMax, numbers[i]);
		}
		result[0] = sum/5;
		result[1] = ansMin;
		result[2] = ansMax;
		return result;
	}


    
	
	
  public static void main(String[] args) {
    int size =5;
	Generate4DigitRandomNumber number = new Generate4DigitRandomNumber();
	int [] randomFourDigits = number.generate4DigitRandomArray(size);
	double [] averageMinMax = number.findAverageMinMax(randomFourDigits);
	for(int i=0; i<5; i++){
		System.out.println(randomFourDigits[i]);
	}
	for(int i=0; i<3; i++){
			System.out.println("The average, Min, and Max numbers from the generated numbers are " +averageMinMax[i]);
	}
	
	 
		
    
  }
}

