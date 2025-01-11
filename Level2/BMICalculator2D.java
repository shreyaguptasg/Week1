import java.util.Scanner;

 class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = sc.nextInt();

        // 2d array to store height, weight, and BMI
        double[][] personData = new double[numPersons][3]; // [height, weight, BMI]
        String[] weightStatus = new String[numPersons]; // Array to store weight status

        // Taking input for height and weight of each person
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            // Height input
            System.out.print("Height (in meters): ");
            personData[i][0] = sc.nextDouble();

            // Weight input
            System.out.print("Weight (in kilograms): ");
            personData[i][1] = sc.nextDouble();

            // Calculating BMI and storing it in the array
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determining the weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25 && personData[i][2] < 40) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Printing results
        System.out.println("BMI Results:");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + personData[i][0] + " meters");
            System.out.println("Weight: " + personData[i][1] + " kilograms");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
            System.out.println();
        }

        sc.close();
    }
}