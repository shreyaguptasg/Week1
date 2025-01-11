import java.util.Scanner;

 class PercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Creating arrays to store marks, percentages, and grades
        int[] physicsMarks = new int[numStudents];
        int[] chemistryMarks = new int[numStudents];
        int[] mathsMarks = new int[numStudents];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        // Taking input for marks of students
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");

            // Physics Marks
            System.out.print("Physics: ");
            physicsMarks[i] = sc.nextInt();
            if (physicsMarks[i] < 0) {
                System.out.println("Marks cannot be negative. Please re-enter.");
                i--; // Decrementing index
                continue;
            }

            // Chemistry Marks
            System.out.print("Chemistry: ");
            chemistryMarks[i] = sc.nextInt();
            if (chemistryMarks[i] < 0) {
                System.out.println("Marks cannot be negative. Please re-enter.");
                i--; // Decrementing index
                continue;
            }

            // Maths Marks
            System.out.print("Maths: ");
            mathsMarks[i] = sc.nextInt();
            if (mathsMarks[i] < 0) {
                System.out.println("Marks cannot be negative. Please re-enter.");
                i--; // Decrementing index
                continue;
            }
        }

        // Calculating percentage and grade
        for (int i = 0; i < numStudents; i++) {
            percentages[i] = (physicsMarks[i] + chemistryMarks[i] + mathsMarks[i]) / 3.0;

            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70 && percentages[i] < 80) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60 && percentages[i] < 70) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50 && percentages[i] < 60) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40 && percentages[i] < 50) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        // Printing marks, percentages, and grades
        System.out.println("Student Results: ");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics: " + physicsMarks[i]);
            System.out.println("Chemistry: " + chemistryMarks[i]);
            System.out.println("Maths: " + mathsMarks[i]);
            System.out.println("Percentage: " + percentages[i]);
            System.out.println("Grade: " + grades[i]);
            System.out.println();
        }

        sc.close();
    }
}

