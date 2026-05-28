package Day6;
import java.util.*;
public class ATMSystem {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	int correctPin = 1234;
	         

	        System.out.println("1. User inserts card.");
	        System.out.println("2. Enters PIN.");
	        int num = sc.nextInt();
	        int enteredPin = num;
	        
	        try {
	            if (enteredPin != correctPin) {
	                throw new Exception("Invalid PIN entered.");
	            }
	            System.out.println("Access Granted!");
	            
	        } catch (Exception e) {
	            System.out.println("Error caught: " + e.getMessage());
	            
	        } finally {
	            System.out.println("Transaction Logged: System session ended.");
	        }
	    }
}
