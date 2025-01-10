import java.util.*;
class DistanceCalculation{
public static void main(String [] args){
 Scanner input = new Scanner(System.in);
 int distance = input.nextInt();
 double distanceInFeet = distance/3;
 double distanceInInches = distanceInFeet*12;
 System.out.println("Your Height in cm is " + distance + " while in feet is " + distanceInFeet + " and inches is " +distanceInInches);
 input.close();
 
}
}