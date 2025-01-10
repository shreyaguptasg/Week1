import java.util.*;
class Feeuniversity2{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
 int fee = input.nextInt(); //Created a variable named fee and value taken from user
 int discountPercent = input.nextInt(); // Created a variable named discountPercent and value taken from user
 int discount = (fee*discountPercent)/100; //Created a variable named discount and discount is computed and assigned
 int payableAmount = fee - discount; // Created a variable named payableAmount and computed
 System.out.println("The discount amount in INR " + discount + " and final discounted fee is INR " +payableAmount);
input.close();
}
}