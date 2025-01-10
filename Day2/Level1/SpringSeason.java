import java.util.Scanner;
 class SpringSeason {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int month = scn.nextInt();
        int day = scn.nextInt();

        if ((month == 3 && day >= 20 && day <= 31) || (month >= 4 && month <= 5 && day >= 1 && day <= 31) || (month == 6 && day <= 20 && day <= 31)) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}