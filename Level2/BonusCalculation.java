
import java.util.Scanner;
 class BonusCalculation{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		double totalBonus = 0.0 , totalNewSalary = 0.0 , totalSalary = 0.0 ;
		double salary[][] = new double[10][2];//salary and yearOfService
		for (int i=0;i<10 ;i++ ) {
			salary[i][0] = scn.nextDouble();			
			salary[i][1] = scn.nextDouble();			
		}
		int index =0 ;
		double newSalary[][] = new double[10][2];//new salary and bonus
		for (int i=0; i<10 ;i++ ) {
		//Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
			if(salary[i][1]>=5){
				newSalary[i][1] =  ((0.02) * salary[i][0]);
				totalBonus+=newSalary[i][1];
				newSalary[i][0] = salary[i][0] + newSalary[i][1];
				totalNewSalary+=newSalary[i][0];
				totalSalary+=salary[i][0];
			}else{
				newSalary[i][1] =  ((0.05) * salary[i][0]);
				totalBonus+=newSalary[i][1];
				newSalary[i][0] = salary[i][0] + newSalary[i][1];
				totalNewSalary+=newSalary[i][0];
				totalSalary+=salary[i][0];
			}
		}
		for (int i =0 ;i<10 ;i++ ) {
			 System.out.println("Employee " + (i + 1) + " - Bonus: " + newSalary[i][1] + ", Old Salary: " + salary[i][0] + ", New Salary: " + newSalary[i][0]);
		}
		System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
		scn.close();

	}
}

