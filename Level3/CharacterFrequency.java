import java.util.*;

class CharacterFrequency{

    // Method to find the frequency of characters in a string
    public static int[][] findCharFrequency(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        int distinctCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                distinctCount++;
            }
        }

        int[][] charFrequency = new int[distinctCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                charFrequency[index][0] = i;
                charFrequency[index][1] = frequency[i];
                index++;
            }
        }

        return charFrequency;
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        int[][] result = findCharFrequency(text);

        System.out.println("Character Frequencies:");
        for (int i = 0; i < result.length; i++) {
            System.out.println((char) result[i][0] + " : " + result[i][1]);
        }

        input.close();
    }
}