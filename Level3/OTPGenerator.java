import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {

    // Method to generate a 6-digit OTP number
    public static int generateOTP() {
        // Generate a 6-digit OTP (number between 100000 and 999999)
        return (int)(Math.random() * 900000) + 100000;
    }

    // Method to ensure that the OTP numbers generated are unique
    public static boolean areOTPsUnique(int[] otps) {
        // Create a HashSet to store OTPs and check uniqueness
        Set<Integer> otpSet = new HashSet<>();
        
        for (int otp : otps) {
            if (!otpSet.add(otp)) {
                // If the OTP is already in the set, it's not unique
                return false;
            }
        }
        return true; // All OTPs are unique
    }

    public static void main(String[] args) {
        int[] otps = new int[10]; // Array to store 10 OTPs

        // Generate 10 OTPs and store them in the array
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        // Print the generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Check if all the generated OTPs are unique
        boolean unique = areOTPsUnique(otps);
        if (unique) {
            System.out.println("\nAll OTPs are unique.");
        } else {
            System.out.println("\nSome OTPs are not unique.");
        }
    }
}
