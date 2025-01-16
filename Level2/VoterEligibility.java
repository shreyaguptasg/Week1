import java.util.*;

class VoterEligibility{
	
	// Method to generate random 2-digit ages for the given number of students
    public static int[] generateAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];
		
        for (int i = 0; i < n; i++) {
			ages[i] = (int) (Math.random() * 81);
		}
		
		
        return ages;
	}
	
    // Method to check voting eligibility and return a 2D array
    public static String[][] checkVoterEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
		
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
			
            if (ages[i] < 0) {
                result[i][1] = "Invalid Age";
				} else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
				} else {
                result[i][1] = "Cannot Vote";
			}
		}
		
        return result;
	}
	
    // Method to display the 2D array in a tabular format
    public static void displayTable(String[][] array) {
        System.out.printf("%-10s%-15s%n", "Age", "Voting Status");
        System.out.println("-------------------------");
		
        for (String[] row : array) {
            System.out.printf("%-10s%-15s%n", row[0], row[1]);
		}
	}
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.println("Enter the number of students:");
        int num = input.nextInt();
		
        int[] ages = generateAges(num);
		
        String[][] eligibility = checkVoterEligibility(ages);
		
        displayTable(eligibility);
		
		input.close();
	}
	
    
}