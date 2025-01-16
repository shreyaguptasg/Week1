import java.util.*;

class StudentScorecard{
	// Method to generate random scores for Physics, Chemistry, and Maths
    public static int[][] generateRandomScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];
		
        for (int i = 0; i < numStudents; i++) {
			scores[i][0] = (int) (Math.random() * 51) + 50;
			scores[i][1] = (int) (Math.random() * 51) + 50;
			scores[i][2] = (int) (Math.random() * 51) + 50;
		}
        return scores;
	}
	
    // Method to calculate total, average, and percentage
    public static double[][] calculateTotals(int[][] scores) {
        double[][] totals = new double[scores.length][3];
		
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
			
            totals[i][0] = total;
            totals[i][1] = Math.round(average * 100.0) / 100.0;
            totals[i][2] = Math.round(percentage * 100.0) / 100.0;
		}
		
        return totals;
	}
	
    // Method to assign grades based on percentage
    public static String[] assignGrades(double[][] totals) {
        String[] grades = new String[totals.length];
		
        for (int i = 0; i < totals.length; i++) {
            double percentage = totals[i][2];
			
            if (percentage >= 80){
                grades[i] = "A";
				} else if (percentage >= 70) {
                grades[i] = "B";
				} else if (percentage >= 60) {
                grades[i] = "C";
				} else if (percentage >= 50) {
                grades[i] = "D";
				} else if (percentage >= 40) {
                grades[i] = "E";
				} else {
                grades[i] = "R";
			}
		}
		
        return grades;
	}
	
    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] totals, String[] grades) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-15s%-10s%n", 
		"Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");
        System.out.println("------------------------------------------------------------------------------------------");
		
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d%-10d%-10d%-10d%-10.0f%-10.2f%-15.2f%-10s%n", 
				i + 1, scores[i][0], scores[i][1], scores[i][2], 
			totals[i][0], totals[i][1], totals[i][2], grades[i]);
		}
	}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.println("Enter the number of students:");
        int numStudents = input.nextInt();
		
        int[][] scores = generateRandomScores(numStudents);
		
        double[][] totals = calculateTotals(scores);
		
        String[] grades = assignGrades(totals);
		
        displayScorecard(scores, totals, grades);
		
		input.close();
	}
	
}