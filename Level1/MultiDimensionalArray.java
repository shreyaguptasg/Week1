import java.util.*;
class MultiDimensionalArray{
	public static void main(String [] args){
		//created a variable number and take input from the user
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  the row ");
		int row = sc.nextInt();
		System.out.print("Enter  the column ");
		int column = sc.nextInt();
		int [][] Matrix = new int[row][column];
		for(int i=0; i<row; i++){
			for(int j=0;j<column; j++){
				Matrix[i][j] = sc.nextInt();
			}
		}
		int[] array = new int[row*column];
		int index=0;
		for(int i=0; i<row; i++){
			for(int j=0;j<column; j++){
				array[index++] = Matrix[i][j];
				
			}
		}
		
		for(int i=0; i<row*column; i++){
			System.out.print(array[i]+"");
		}
		sc.close();
			
	}
}

