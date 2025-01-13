import java.util.*;

public class StudentScorecard{

    // Method to generate random 2-digit scores for Physics, Chemistry, and Maths
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];
        
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 10 + (int)(Math.random() * 10);
            scores[i][1] = 10 + (int)(Math.random() * 10);
            scores[i][2] = 10 + (int)(Math.random() * 10);
        }
        
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateTotalsAndPercentages(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3];
        
        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        
        return results;
    }

    // Method to display the scorecard of all students in a tabular format
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
        System.out.println((i + 1) + "\t" + scores[i][0] + "\t\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t\t" + results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "%");
}

    }
	
    public static void main(String[] args) {
	
	    Scanner input = new Scanner(System.in);
        int numStudents = input.nextInt();
        
        // Generate random scores for the students
        int[][] scores = generateScores(numStudents);
        
        double[][] results = calculateTotalsAndPercentages(scores);
        
        displayScorecard(scores, results);
    }
}