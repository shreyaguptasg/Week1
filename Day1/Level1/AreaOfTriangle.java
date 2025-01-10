import java.util.*;
class AreaOfTriangle{
public static void main(String [] args){
 Scanner input = new Scanner(System.in);
 int base = input.nextInt();
 int height = input.nextInt();
 double heightInInches = height/2.54;
 double heightInfeet = heightInInches*12;
 System.out.println("Your Height in cm is " + height + " while in feet is " + heightInfeet + " and inches is " +heightInInches);
 input.close();
 
}
}