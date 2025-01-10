import java.util.*;
class SquarePerimeter{
public static void main(String [] args){
 Scanner input = new Scanner(System.in);
 int sideOfSquare = input.nextInt();
 int perimeter = 4*sideOfSquare;
 System.out.println("The length of the side is " + sideOfSquare + " whose perimeter is " + perimeter);
 input.close();
 
}
}