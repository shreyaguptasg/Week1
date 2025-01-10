
import java.util.*;

class BMICalculator{
	public static void main(String [] args){
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter weight");
		double weight = cs.nextDouble();
		System.out.println("Enter height");
		double height = cs.nextDouble();
		       height= height*100;
		double BMI = weight/(height*height);
	   
		if(weight>=40.0){
			System.out.println("Obese");
		}
		else if(weight<=39.9 && weight>=25.0){
		    System.out.println("Overweight");
		}
		else if(weight<=24.9 && weight>=18.5){
		    System.out.println("Normal");
		}
		else{
		    System.out.println("Normal");
		}
		
				cs.close();
	}
	
}

