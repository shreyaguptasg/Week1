import java.util.*;

class BMICalculator{
	
	// Method to compute BMI and status for all persons
    public static String[][] computeBMIAndStatus(double[][] personData) {
        String[][] result = new String[personData.length][4]; // Height, Weight, BMI, Status
		
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double heightInCm = personData[i][1];
			
            double heightInMeters = heightInCm / 100.0;
			
            double bmi = weight / (heightInMeters * heightInMeters);
            bmi = Math.round(bmi * 100.0) / 100.0;
			
            String status = determineBMIStatus(bmi);
			
            result[i][0] = String.valueOf(heightInCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
		}
		
        return result;
	}
	
    // Method to determine BMI status based on BMI value
    public static String determineBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
			} else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal weight";
			} else if (bmi >= 25 && bmi <= 39.9) {
            return "Overweight";
			} else {
            return "Obese";
		}
	}
	
    // Method to display the BMI data in a tabular format
    public static void displayTable(String[][] bmiData) {
        System.out.printf("%-10s%-10s%-10s%-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("---------------------------------------------");
		
        for (String[] row : bmiData) {
            System.out.printf("%-10s%-10s%-10s%-15s%n", row[0], row[1], row[2], row[3]);
		}
	}
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        double[][] personData = new double[10][2];
		
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (in kg) for person " + (i + 1) + ":");
            personData[i][0] = input.nextDouble();
			
            System.out.println("Enter height (in cm) for person " + (i + 1) + ":");
            personData[i][1] = input.nextDouble();
		}
		
        String[][] bmiData = computeBMIAndStatus(personData);
		
        displayTable(bmiData);
		
		input.close();
	}
}