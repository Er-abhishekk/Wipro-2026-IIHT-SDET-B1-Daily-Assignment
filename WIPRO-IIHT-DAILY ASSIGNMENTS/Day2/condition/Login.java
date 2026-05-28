package Day2.condition;
import java.util.*;

public class Login {	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String user = "kushanumar";
	        String pass = "1234";

	        System.out.print("Enter username: ");
	        String username = sc.next();
	        System.out.print("Enter password: ");
	        String password = sc.next();

	        if (username.equals(user) && password.equals(pass)) {
	            System.out.println("Login Success!");
	        } else {
	            System.out.println("Login Failure.");
	        }
 }
	

}
