import java.util.Scanner;
public class RootsOfEquation {
	//define a method which takes roots as parameter and calculate whether the root is positive, negative or zero

   public static int []  roots(int delta, int a, int b){
		int [] result;
		//f delta is positive the find the two roots using formulae 
		//root1 of x = (-b + delta)/(2*a) 
		//root1 of x = (-b - delta)/(2*a)

		if(delta>0){
			result= new int[2];
			result[0] = (int)(-b + Math.sqrt(delta))/(2*a);
			result[1] = (int)(-b - Math.sqrt(delta))/(2*a);
		}
		// if delta is zero then there is only one root of x  
		//root of x = -b/(2*a)
		else if(delta==0){
			result = new int[1];
			result[0] = (int)-b/(2*a);
		}
		//If delta is negative return empty array or nothing 
		else{
			result = new int[0];
		}
		return result;
		
	}

    
	
	
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Taking input from the user.
   int a = sc.nextInt();
   int b = sc.nextInt();
   int c= sc.nextInt();
	
	int delta = b*b + 4*a*c;
	
	
	int [] rootsOfEquation = roots(delta,a,b);
	for(int i=0; i<rootsOfEquation.length; i++){
		System.out.println(rootsOfEquation[i]);
	}
	
	
	 
		sc.close();
    
  }
}

