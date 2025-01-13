import java.util.Scanner;
public class YoungestFriend  {
	//define a method which takes in age as a parameter and returns age of youngest friend

    public int youngestFriend(int [] age) {
		if(age[0]<age[1] && age[0]<age[2]){
			return age[0];
		}
		else if(age[1]<age[0] && age[1]<age[2]){
			return age[1];
		}
		else {
			return age[2];
		}
		
		
    }
		//define a method which takes in age as a parameter and returns height of tallest friend
	
	 public int tallestFriend(int [] height) {
		if(height[0]>height[1] && height[0]>height[2]){
			return height[0];
		}
		else if(height[1]>height[0] && height[1]>height[2]){
			return height[1];
		}
		else {
			return height[2];
		}
		
		
    }

    
	
	
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Taking input from the user.
    int [] age = new int[3];
	int [] height = new int[3];
	
	for(int i=0; i<3; i++){
		System.out.println("enetr age");
		age[i] =sc.nextInt();
		System.out.println("enetr height");
		height[i] =sc.nextInt();
	}
	YoungestFriend youngest_friend = new YoungestFriend();
	System.out.println("youngest friend " + youngest_friend.youngestFriend(age));
	System.out.println("tallest friend " + youngest_friend.tallestFriend(height));
	
	
	
	
	 
		sc.close();
    
  }
}

