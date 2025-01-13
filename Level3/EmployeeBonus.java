import java.util.Random;

public class EmployeeBonus {

    // Method to generate a random salary and years of service
    public static double[][] generateEmployeeData(int numEmployees) {
        Random random = new Random();
        double[][] employeeData = new double[numEmployees][2];  // [0] = salary, [1] = years of service

        for (int i = 0; i < numEmployees; i++) {
            // Generate a random 5-digit salary
            employeeData[i][0] = 10000 + (random.nextDouble() * 90000); // Salary between 10000 and 100000
            
            // Generate random years of service between 1 and 20
            employeeData[i][1] = 1 + random.nextInt(20);
        }

        return employeeData;
    }

    // Method to calculate the bonus and new salary based on years of service
    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3];  // [0] = salary, [1] = bonus, [2] = new salary

        for (int i = 0; i < employeeData.length; i++) {
            double salary = employeeData[i][0];
            int yearsOfService = (int) employeeData[i][1];

            double bonus = 0;
            if (yearsOfService > 5) {
                bonus = salary * 0.05;  // 5% bonus for more than 5 years of service
            } else {
                bonus = salary * 0.02;  // 2% bonus for 5 or fewer years of service
            }

            double newSalary = salary + bonus;
            
            // Store old salary, bonus, and new salary
            updatedData[i][0] = salary;
            updatedData[i][1] = bonus;
            updatedData[i][2] = newSalary;
        }

        return updatedData;
    }

    // Method to calculate the total old salary, total new salary, and total bonus
    public static void calculateTotalPayment(double[][] updatedData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        for (int i = 0; i < updatedData.length; i++) {
            totalOldSalary += updatedData[i][0];
            totalBonus += updatedData[i][1];
            totalNewSalary += updatedData[i][2];
        }

        // Display the results in a tabular format
        System.out.printf("%-10s%-15s%-15s%-15s\n", "Employee", "Old Salary", "Bonus", "New Salary");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < updatedData.length; i++) {
            System.out.printf("%-10d%-15.2f%-15.2f%-15.2f\n", i+1, updatedData[i][0], updatedData[i][1], updatedData[i][2]);
        }
        System.out.println("------------------------------------------------------------");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus: %.2f\n", totalBonus);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
    }

    public static void main(String[] args) {
        int numEmployees = 10;

        // Generate employee data
        double[][] employeeData = generateEmployeeData(numEmployees);

        // Calculate bonus and new salary
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);

        // Calculate and display total salary and bonus details
        calculateTotalPayment(updatedData);
    }
}
