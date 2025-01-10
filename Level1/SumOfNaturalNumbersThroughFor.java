import java.util.Scanner;

class SumOfNaturalNumbersThroughFor{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int formulaSum =0;
		int sumLoop =0;
		if(number>=0){
			 formulaSum = number*(number+1)/2;
			for(;number>0; number--){
				sumLoop+= number;
			}
			
		}
		if(formulaSum==sumLoop){
		 System.out.println(formulaSum);
		 }
		sc.close();
	}
}

