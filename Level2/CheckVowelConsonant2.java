import java.util.*;

class CheckVowelConsonant2{
	
	// Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacter(char c) {
        if (c >= 'A' && c <= 'Z') {
            c = (char) (c + 32);
		}
		
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "Vowel";
		}
		
        if (c >= 'a' && c <= 'z') {
            return "Consonant";
		}
		
        return "Not a Letter";
	}
	
	// Method to find vowels and consonants in a string
    public static String[][] getCharTypes(String str) {
        int length = str.length();
        String[][] charTypes = new String[length][2];
		
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            charTypes[i][0] = String.valueOf(c);
            charTypes[i][1] = checkCharacter(c);
		}
		
        return charTypes;
	}
	
	// Method to display a 2D array in a tabular format
    public static void displayTable(String[][] array) {
        System.out.printf("%-10s%-15s%n", "Character", "Type");
        System.out.println("-------------------------");
		
        for (String[] row : array) {
            System.out.printf("%-10s%-15s%n", row[0], row[1]);
		}
	}
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.println("Enter a string:");
        String text = input.nextLine();
		
        String[][] charTypes = getCharTypes(text);
		
        displayTable(charTypes);
		
		input.close();
	}
	
}