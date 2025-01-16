import java.util.*;

class CheckPalindromeString{

    // Logic 1: Check if a string is a palindrome by comparing start and end characters
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Check if a string is a palindrome using recursion
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Check if a string is a palindrome by reversing the string
    public static boolean isPalindromeUsingReverse(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];

        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
		Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Perform palindrome checks using the three logics
        boolean resultIterative = isPalindromeIterative(text);
        boolean resultRecursive = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean resultUsingReverse = isPalindromeUsingReverse(text);

        System.out.println("Palindrome Check Results:");
        System.out.println("Using Iterative Logic: " + resultIterative);
        System.out.println("Using Recursive Logic: " + resultRecursive);
        System.out.println("Using Reverse Logic: " + resultUsingReverse);

        input.close();
    }
}