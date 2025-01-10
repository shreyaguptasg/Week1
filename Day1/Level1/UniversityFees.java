import java.util.*;
class FeeUniversity{
public static void main(String [] args){
 int fee = 125000; //Created a variable named fee and assigned 125000 
 int discountPercent = 10; // Created a variable named discountPercent and assign 10 
 int discount = (fee*discountPercent)/100; //Created a variable named discount and discount is computed and assigned
 int payableAmount = fee - discount; // Created a variable named payableAmount and computed
 System.out.println("The discount amount in INR " + discount + " and final discounted fee is INR " +payableAmount);
}
}
