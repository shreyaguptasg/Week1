import java.util.Scanner;
public class BMIStatus  {
	//define a method which takes an array  as a parameter and returns bmi status of each members in an organisation

    public  static double [][] BMI( double [][] bmiCalculator) {
		for(int i=0; i<10; i++){
		
			//BMI = weight / (height * height)
			
			bmiCalculator[i][2] = bmiCalculator[i][0]/(bmiCalculator[i][1]*bmiCalculator[i][1]);
			
			
			
		}
		return bmiCalculator;
	}
	
	public static String [] status(double [][]bmiCalculator){
		String [] statusArray = new String[10];
		for(int i=0; i<10; i++){
			if(bmiCalculator[i][2] <=18.4){
					statusArray[i] = "UnderWeight";
			}
			else if(bmiCalculator[i][2] >=18.5 && bmiCalculator[i][2] <=24.9){
					statusArray[i] = "Normal";
			}
			else if(bmiCalculator[i][2] >=25.0 && bmiCalculator[i][2] <=39.9){
					statusArray[i] = "OverWeight";
			}
			else{
					statusArray[i] ="Obese";
			}
		}
		return statusArray;
	}
    
	
	
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Taking input from the user.
    double [][] bmiCalculator = new double[10][3];
	
	System.out.println("enter weight and height");
	for(int i=0; i<10; i++){
		
		bmiCalculator[i][0] =sc.nextDouble();
		bmiCalculator[i][1] =sc.nextDouble();
		bmiCalculator[i][1] /=100;
	}
	
	bmiCalculator= BMI(bmiCalculator);
	
	String [] result = status(bmiCalculator);
	for(int i=0; i<10; i++){
		System.out.println(result[i]);
	}
	
	 
		sc.close();
    
  }
}

