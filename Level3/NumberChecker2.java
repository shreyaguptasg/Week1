public class NumberChecker2 {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to store the digits of the number in a digits array
    public static int[] getDigitsArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;  // Extract last digit
            number /= 10;  // Remove last digit
        }

        return digits;
    }

    // Method to find the sum of the digits of the number
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);  // Square the digit and add to sum
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; // 10 digits (0 to 9)

        // Initialize the first column with the digits 0 to 9
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;  // First column stores digits
            frequency[i][1] = 0;  // Second column stores frequency
        }

        // Count the frequency of each digit
        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }

    // Main method to call and test all utility methods
    public static void main(String[] args) {
        int number = 21; // Example number

        // Get digits array
        int[] digits = getDigitsArray(number);
        System.out.println("Digits array: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Find sum of digits
        int sum = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sum);

        // Find sum of squares of digits
        double sumOfSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);

        // Check if Harshad number
        boolean isHarshad = isHarshadNumber(number, digits);
        System.out.println("Is Harshad Number: " + isHarshad);

        // Find frequency of each digit
        int[][] frequency = findDigitFrequency(digits);
        System.out.println("Digit Frequency: ");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {  // Only print digits that occur
                System.out.println("Digit: " + frequency[i][0] + " - Frequency: " + frequency[i][1]);
            }
        }
    }
}
