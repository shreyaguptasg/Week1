import java.util.*;

class FindUniqueCharacters2{
	
	// Method to find the length of the text without using the length() method
    public static int findLength(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
			}
			} catch (IndexOutOfBoundsException e) {
            return length;
		}
	}
	
    // Method to find unique characters in a string using charAt() method
    public static char[] findUniqueCharacters(String str) {
        int length = findLength(str);
        char[] tempResult = new char[length];
        int uniqueCount = 0;
		
        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;
			
            // Check if the character is already in the result array
            for (int j = 0; j < uniqueCount; j++) {
                if (tempResult[j] == currentChar) {
                    isUnique = false;
                    break;
				}
			}
			
            // If unique, add to the temporary result array
            if (isUnique) {
                tempResult[uniqueCount] = currentChar;
                uniqueCount++;
			}
		}
		
        // Create a new array to store only unique characters
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = tempResult[i];
		}
		
        return uniqueChars;
	}
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.println("Enter a string:");
        String text = input.nextLine();
		
        char[] uniqueChars = findUniqueCharacters(text);
		
        System.out.println("Unique characters in the string:");
        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
		}
		
		input.close();
	}
}