package Day2.Loop;
import java.util.*;

public class PasswordLoop {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPass = "secret123";
        int attempts = 0;
        int maxAttempts = 2;

        while (attempts < maxAttempts) {
            System.out.print("Enter password: ");
            String input = sc.next();
            if (input.equals(correctPass)) {
                System.out.println("Access Granted!");
                return;
            } else {
                attempts++;
                System.out.println("Wrong! Remaining attempts: " + (maxAttempts - attempts));
            }
        }
        System.out.println("Account Locked.");
    }
}
