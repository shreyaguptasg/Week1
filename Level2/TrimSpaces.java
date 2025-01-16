import java.util.*;

class TrimSpaces{
	
	// Method to trim leading and trailing spaces
    public static String customTrim(String str) {
        int start = 0, end = str.length() - 1;
		
        while (start <= end && str.charAt(start) == ' ') {
            start++;
		}
		
        while (end >= start && str.charAt(end) == ' ') {
            end--;
		}
		
        return createSubstring(str, start, end + 1);
	}
	
    // Method to create a substring using charAt()
    public static String createSubstring(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
		
        for (int i = start; i < end; i++) {
            substring.append(str.charAt(i));
		}
		
        return substring.toString();
	}
	
    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
		}
		
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
			}
		}
		
        return true;
	}
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.println("Enter a string with leading and trailing spaces:");
        String text = input.nextLine();
		
        String trimmedString1 = customTrim(text);
        String trimmedString2 = text.trim();
		
        boolean areEqual = compareStrings(trimmedString1, trimmedString2);
		
        System.out.println("Are the two results equal? " + areEqual);
		
		input.close();
	}
	
    
}