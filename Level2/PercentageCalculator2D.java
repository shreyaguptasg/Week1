import java.util.Scanner;

 class PercentageCalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Creating a 2D array to store marks of students
        int[][] marks = new int[numStudents][3]; // 3 columns for physics, chemistry, and maths
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        // Taking input for marks of students
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");

            // Physics Marks
            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();
            if (marks[i][0] < 0) {
                System.out.println("Marks cannot be negative. Please re-enter.");
                i--; // Decrementing index
                continue;
            }

            // Chemistry Marks
            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();
            if (marks[i][1] < 0) {
                System.out.println("Marks cannot be negative. Please re-enter.");
                i--; // Decrementing index
                continue;
            }

            // Maths Marks
            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();
            if (marks[i][2] < 0) {
                System.out.println("Marks cannot be negative. Please re-enter.");
                i--; // Decrementing index
                continue;
            }
        }

        // Calculating percentage and grade
        for (int i = 0; i < numStudents; i++) {
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

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
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + percentages[i]);
            System.out.println("Grade: " + grades[i]);
            System.out.println();
        }

        sc.close();
    }
}