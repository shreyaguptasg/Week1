import java.util.*;

class CountVowelConsonant{
	
	// Method to check if a character is a vowel or consonant
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
	
	// Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;
		
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
			
            String result = checkCharacter(c);
            if (result.equals("Vowel")) {
                vowelCount++;
				} else if (result.equals("Consonant")) {
                consonantCount++;
			}
		}
		
        return new int[]{vowelCount, consonantCount};
	}
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.println("Enter a string:");
        String text = input.nextLine();
		
        int[] counts = countVowelsAndConsonants(text);
		
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);
		
		input.close();
	}
    
}