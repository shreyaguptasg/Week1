import java.util.Scanner;
class YoungestFriend{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int[] age = new int[3];
		int[] height = new int[3];
		for (int i =0 ;i<3 ;i++ ) {
			age[i] = scn.nextInt();
		}
		for (int i =0 ;i<3 ;i++ ) {
			height[i] = scn.nextInt();
		}
		int Youngestfriend = Integer.MAX_VALUE ;
		int Tallestfriend = Integer.MIN_VALUE;
		for (int i =0 ;i<3 ;i++ ) {
			if(age[i]<Youngestfriend)
				Youngestfriend = age[i];
			else if(age[i]>Tallestfriend)
				Tallestfriend = age[i];
		}
		System.out.print("Youngestfriend is "+Youngestfriend+" and Tallestfriend is "+Tallestfriend );
          scn.close();
	}
}