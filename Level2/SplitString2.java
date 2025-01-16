import java.util.*;

class SplitString2{
	
	// Method to split the string
	public static String[][] splitString(String str){
		String[][] splitedString = new String[15][2];
		String word = "";
		int charCount = 0, j = 0;
		for(int i=0; i<len(str); i++){
			if(str.charAt(i) == ' '){
				splitedString[j][0] = word;
				word = "";
				splitedString[j][1] = String.valueOf(charCount);
				charCount = 0;
				j++;
			}
			else{
				word += str.charAt(i);
				charCount++;
			}
		}
		
		if (!word.isEmpty()) {
			splitedString[j][0] = word;
			splitedString[j][1] = String.valueOf(charCount);
		}
		
		return splitedString;
	}
	
	// Method to measure the length of the string
	public static int len(String str){
		int count = 0;
		
        for (char c : str.toCharArray()) {
            count++;
		}
		
        return count;
	}
	
	
	public static void main(String[]args){
		
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String string = input.nextLine();
		
		String[][] wordArray = splitString(string);
		
		System.out.println("Words" + "\t\t\t" + "Length");
		for(int i=0; i<wordArray.length; i++){
			if (wordArray[i][0] != null){
                System.out.println(wordArray[i][0] + "\t\t\t" + wordArray[i][1]);
			}
		}
		
        // Close the Scanner Object
		input.close();
	}
}