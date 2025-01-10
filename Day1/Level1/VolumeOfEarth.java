import java.util.*;
class VolumeOfEarth{
public static void main(String [] args){
int radius = 6378; //created a variable and value is assigned to it
double volumeInKilometers = (4/3) *3.14*radius*radius*radius;// created a variable and its volume is calculated
double volumeInMiles = volumeInKilometers*1.6;
System.out.println("The volume of earth in cubic kilometres is " + volumeInKilometers + " and cubic miles is " +volumeInMiles);
}
}
