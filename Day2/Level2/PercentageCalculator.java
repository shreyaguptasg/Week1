
import java.util.*;

class PercentageCalculator{
	public static void main(String [] args){
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter a maths marks");
		int mathsMarks = cs.nextInt();
		System.out.println("Enter a physics marks");
		int physicsMarks = cs.nextInt();
		System.out.println("Enter a chemistry marks");
		int chemistryMarks = cs.nextInt();
		double average = (mathsMarks+physicsMarks+chemistryMarks)/3.0;
		System.out.println(".2f" average);
		
		if(average>=80){
			
			   System.out.println("Above agency-normalized standards");
		}
		else if(average<80 && average>=70){
		    System.out.println("Agency-normalized standards");
		}
		else if(average<70 && average>=60){
		    System.out.println("Below, but approching agency-normalized standards");
		}
		else if(average<60 && average>=50){
		    System.out.println("Well below agency-normalized standards");
		}
		else if(average<50 && average>=40){
		    System.out.println("Too below agency-normalized standards");
		}
		else{
		    System.out.println("Remedial standards");
		}
		
		
		
		
		
		cs.close();
	}
	
}

