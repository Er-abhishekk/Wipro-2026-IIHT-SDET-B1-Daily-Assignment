package Day2.condition;
import java.util.*;
public class Shopping {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter purchase amount: ");
	        int amount = sc.nextInt();

	        if (amount >= 1000) {
	            System.out.println("You get a 10% discount!");
	        } else {
	            System.out.println("No discount available.");
	        }
	    }
}
