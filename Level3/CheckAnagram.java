import java.util.*;

class CheckAnagram{

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }

        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];

        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
        }

        for (int i = 0; i < text2.length(); i++) {
            frequency2[text2.charAt(i)]++;
        }

        return Arrays.equals(frequency1, frequency2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a first string: ");
        String text1 = input.nextLine();
        System.out.print("Enter the second text: ");
        String text2 = input.nextLine();

        boolean result = areAnagrams(text1, text2);

        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        input.close();
    }
}