import java.util.*;
class HandshakeCalculation{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int  numberOfStudents = input.nextInt();
		int maxiumHandshake = (numberOfStudents*(numberOfStudents -1))/2;
		System.out.println("The number of possible handshakes are " + maxiumHandshake);
		input.close();
 
}
}