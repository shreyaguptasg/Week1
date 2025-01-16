import java.util.Scanner;

public class SplitWords {
    // Method to convert lowercase into uppercase 
    public static String  upperCase(String string) {
			String upper_case ="";
			for(int i=0; i<string.length(); i++){
				char ch = string.charAt(i);
				if(ch>= 'a' && ch<='z'){
					ch =(char)(ch - ('a' - 'A'));
				}
				upper_case +=ch;
			}
			return upper_case;
        
    }
	// Method to compare two strings  
	 public static boolean compare(String string1, String string2) {
			
			for(int i=0; i<string1.length(); i++){
				if(string1.charAt(i)!=string2.charAt(i)){
					return false;
				}        
			}
			return true;
        
    }
	public static String [][] splitText(String string){
		String [][] ch = new String[20][2];
		String words ="";
		int charCount=0, j=0;
		for(int i=0; i<string.length(); i++){
			 if(string.charAt(i) == ' '){
				ch[j][0] = words;
				ch[j][1] = charCount;
			}
		}
		return ch;
	}
	
	public static int findLength(String string){
		int count=0;
		for(int i=0; i<string.length(); i++){
			count++;
			if(string.charAt(i) == " " ){
				count++;
			}
			
		}
		return count;
	}
	
	 public static String[][] createWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // Word
            result[i][1] = String.valueOf(findLength(words[i])); // Length as String
        }
        return result;
    }
	

 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = sc.nextLine();
		String [] word = splitText(string);
		String [][] word_length_array = createWordLengthArray(string);
		for (String[] pair : word_length_array) {
            System.out.printf("%-15s%-10d%n", pair[0], Integer.parseInt(pair[1]));
        }
		String upper_case= upperCase(string);
		boolean ans = compare(string, upper_case);
		if(ans){
			System.out.println("Strings are equal");
		}
		else{
			System.out.println("Strings are not  equal");
		}
		sc.close();
      } 
}