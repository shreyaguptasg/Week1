import java.util.*;

class CharacterFrequency3{

    // Method to find the frequency of characters in a string using nested loops
    public static String[] findCharFrequency(String text) {
        char[] characters = text.toCharArray();
        int[] frequency = new int[characters.length];

        for (int i = 0; i < characters.length; i++) {
            frequency[i] = 1;
        }

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        frequency[i]++;
                        characters[j] = '0';
                    }
                }
            }
        }

        int distinctCount = 0;
        for (char c : characters) {
            if (c != '0') {
                distinctCount++;
            }
        }

        // Create a 1D String array to store characters and their frequencies
        String[] charFrequency = new String[distinctCount];
        int index = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                charFrequency[index] = characters[i] + " : " + frequency[i];
                index++;
            }
        }

        return charFrequency;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String[] result = findCharFrequency(text);

        System.out.println("Character Frequencies:");
        for (String entry : result) {
            System.out.println(entry);
        }

        input.close();
    }
}