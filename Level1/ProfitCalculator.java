import java.util.*;
class ProfitCalculator{
public static void main(String [] args){
int costPrice = 129;
int sellingPrice = 191;
int profit =  sellingPrice - costPrice ;
double profitPercentage = ((double)profit/(double)costPrice) *100;
System.out.println("The cost price is INR " + costPrice + "\nThe Selling price is INR " + sellingPrice + "\nThe profit is INR " + profit + "\nThe profit percenatge is " + profitPercentage);
}
}