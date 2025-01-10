import java.util.Scanner;

class BonusCalculation{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		int yearOfService = sc.nextInt();
		double bonus =0;
		if(yearOfService>5){
			bonus = salary + (salary * 0.05);
			System.out.println(bonus);
		}
		else{
			System.out.println(" No bonus");
		}
		  
		
		sc.close();
	}
}

