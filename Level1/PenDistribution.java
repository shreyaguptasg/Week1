import java.util.*;
class PenDistribution{
public static void main(String [] args){
int numberOfPens = 14;// created a varaiable name and assigned value to it
int numberOfChildren = 3;// created a varaiable name and assigned value to it
int equallyDistributedPens = 14/3;//  created a varaiable name and computation is done
int remainingPens = numberOfPens%numberOfChildren; //  created a varaiable name and computation is done
System.out.println("The pen per student is " + equallyDistributedPens + " and the remaining pen not distributed is " + remainingPens);
}
}