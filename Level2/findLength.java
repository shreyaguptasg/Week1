import java.util.*;
public class LengthCalculate{
	public static int findLength(String string){
		
		int i=0;
		try{
			for(; ;){
				string.charAt(i);
					i++;
			}
		}
        
		catch(IndexOutOfBoundsException e){
			return i;
		}
		
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		
		findLength(string);
		sc.close();
		
	}
}
