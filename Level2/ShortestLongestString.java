import java.util.*;

class ShortestLongestString{
	
	// Method to split the text into words without using split()
    public static String[] customSplit(String str) {
        int wordCount = 1;
        int length = findStringLength(str);
		
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
			}
		}
		
        String[] words = new String[wordCount];
        int start = 0, wordIndex = 0;
		
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                words[wordIndex++] = str.substring(start, i);
                start = i + 1;
			}
		}
		
        // Add the last word
        words[wordIndex] = str.substring(start);
        return words;
	}
	
	// Method to find the length of a string without using length()
    public static int findStringLength(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
		}
        return count;
	}
	
	// Method to generate a 2D array of words and their lengths
    public static String[][] getWordLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];
		
        for (int i = 0; i < words.length; i++) {
			wordLengths[i][0] = words[i];
			wordLengths[i][1] = String.valueOf(findStringLength(words[i]));
		}
		
		return wordLengths;
	}
	
	// Method to find the shortest and longest strings
    public static String[] findShortestAndLongest(String[][] wordLengths) {
		String shortestWord = wordLengths[0][0];
		String longestWord = wordLengths[0][0];
		int shortestLength = Integer.parseInt(wordLengths[0][1]);
		int longestLength = Integer.parseInt(wordLengths[0][1]);
		
		for (String[] wordLength : wordLengths) {
			int length = Integer.parseInt(wordLength[1]);
			
			if (length < shortestLength) {
				shortestWord = wordLength[0];
				shortestLength = length;
			}
			
			if (length > longestLength) {
				longestWord = wordLength[0];
				longestLength = length;
			}
		}
		
		return new String[]{shortestWord, longestWord};
	}
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.println("Enter a text:");
        String text = input.nextLine();
		
        String[] words = customSplit(text);
		
        String[][] wordLengths = getWordLengths(words);
		
        String[] result = findShortestAndLongest(wordLengths);
		
        System.out.println("\nWords and their lengths:");
        for (String[] wordLength : wordLengths) {
            System.out.println(wordLength[0] + ", Length: " + wordLength[1]);
		}
		
        System.out.println("\nShortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
		
		input.close();
	}
	
}