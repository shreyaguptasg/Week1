import java.util.Scanner;
public class StudentVoteChecker  {
	//define a method which takes in age as a parameter and returns true or false

    public boolean canStudentVote(int  age) {
	// validate the age for a negative number, if a negative return is false cannot vote. 
	//For valid age check for age is 18 or above return true; else return false;
       
			if(age<0){
				return false;
			}
			
			else if(age>=18){
				return true;
			}
			else{
				return false;
			}
		
		
    }

    
	
	
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Taking input from the user.
    System.out.print("Enter age of students: ");
    int [] age = new int[10];
	
	for(int i=0; i<10; i++){
		age[i] = sc.nextInt();
		StudentVoteChecker studentvote = new StudentVoteChecker();
		
		 if( studentvote.canStudentVote(age[i])){
			System.out.println(age[i] + " can vote");
		}
		else{
			System.out.println(age[i] + " cannot vote");
		}
	}
	
	
	 
		sc.close();
    
  }
}

