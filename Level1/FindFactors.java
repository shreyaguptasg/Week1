import java.util.*;
class FindFactors{
	public static void main(String [] args){
		//created a variable number and take input from the user
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		int maxFactor = 10;
		int [] factors = new int[maxFactor];
		int index =0;
		for(int i=1; i<=number; i++){
			if(number%i==0){
				if(index == maxFactor){
					maxFactor = 2*maxFactor;
					int [] temp = new int[maxFactor];
					for(int j=0; j<factors.length; j++){
						temp[j]= factors[j];
						System.out.println(temp[j]);
					}
					factors = temp;
					
				}
					factors[index++] = i;
			}
		}
		System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i]);
            if (i < index - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
		sc.close();
			
	}
}

