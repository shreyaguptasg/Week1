import java.util.Scanner;

class SumOfNaturalNumbers{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int formulaSum =0;
		int sumLoop =0;
		if(number>=0){
			 formulaSum = number*(number+1)/2;
			while(number!=0){
				 sumLoop = sumLoop + number;
				number--;
			}
			
		}
		if(formulaSum==sumLoop){
		 System.out.println(formulaSum);
		 }
		sc.close();
	}
}

