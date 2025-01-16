import java.util.*;

class SplitString{
	
	// Method to split the string
	public static String[] splitMethod(String str){
		
		int wordCount = 1;
		
		for(int i=0; i<len(str); i++){
			if(str.charAt(i) == ' '){
				wordCount++;
			}
		}
		
		int[] spaceArray = new int[wordCount - 1];
		
		int j = 0;
		for(int i=0; i<len(str); i++){
			if(str.charAt(i) == ' '){
				spaceArray[j++] = i;
			}
		}
		
		String[] wordArray = new String[wordCount];
		j=0;
		for(int i=0; i<spaceArray.length; i++){
			wordArray[i] = str.substring(j, spaceArray[i]);
			j = spaceArray[i] + 1;
		}
		
		wordArray[wordCount - 1] = str.substring(j);
		
		return wordArray;
	}
	
	// Method to measure the length of the string
	public static int len(String str){
		int count = 0;
		
        for (char c : str.toCharArray()) {
            count++;
		}
		
        return count;
	}
	
	// Method to compare two arrays
	public static boolean arrayCheck(String[] strArr1, String[] strArr2){
		if(strArr1.length != strArr2.length){
			return false;
		}
		
		for(int i=0; i<strArr1.length; i++){
			if(!strArr1[i].equals(strArr2[i])){
				return false;
			}
		}
		
		return true;
	}

	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String string = input.nextLine();
		
		String[] splitedString1 = splitMethod(string);
		String[] splitedString2 = string.split(" ");
		
		/*for(int i=0; i<splitedString1.length; i++){
			System.out.println(splitedString1[i] + " " + splitedString2[i]);
		}*/
		
		if(arrayCheck(splitedString1, splitedString2)){
			System.out.println("Arrays are same");
		}
		else{
			System.out.println("Arrays not are same");
		}
        		
        // Close the Scanner Object
		input.close();
	}
}