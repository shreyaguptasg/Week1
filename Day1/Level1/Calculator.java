import java.util.*;
class Calculator{
public static void main(String [] args){
 Scanner input = new Scanner(System.in);
 int number1 = input.nextInt();
 int number2 = input.nextInt();
 int addition = number1 + number2;
 int subtraction = number1 - number2;
 int multiplication = number1*number2;
 double division = (double)number1/(double)number2;
 System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + "," + subtraction + ", "  + multiplication + ", and " + division);

 input.close();
 
}
}