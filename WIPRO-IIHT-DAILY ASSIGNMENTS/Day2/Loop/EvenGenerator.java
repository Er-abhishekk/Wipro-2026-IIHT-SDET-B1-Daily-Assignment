package Day2.Loop;
import java.util.*;
public class EvenGenerator {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter limit: ");
	        int limit = sc.nextInt();

	        System.out.println("Even numbers between 1 and " + limit);
	        for (int i = 1; i <= limit; i++) {
	            if (i % 2 == 0) {
	                System.out.print(i + " ");
	            }
	        }
	    }
}
