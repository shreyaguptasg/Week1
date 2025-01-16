import java.util.Scanner;

class CharacterFrequency2{

    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String text) {
        StringBuilder uniqueChars = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueChars.length(); j++) {
                if (uniqueChars.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars.append(currentChar);
            }
        }

        return uniqueChars.toString().toCharArray();
    }

    // Method to find the frequency of characters in a string
    public static String[][] findCharFrequency(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        char[] uniqueChars = uniqueCharacters(text);

        String[][] charFrequency = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            charFrequency[i][0] = String.valueOf(uniqueChars[i]);
            charFrequency[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }

        return charFrequency;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String[][] result = findCharFrequency(text);

        System.out.println("Character Frequencies:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " : " + result[i][1]);
        }

        input.close();
    }
}