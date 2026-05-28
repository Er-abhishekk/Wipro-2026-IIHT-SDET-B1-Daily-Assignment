package Day2.Loop;
import java.util.*;

public class Salary {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of employees: ");
	        int count = sc.nextInt();

	        for (int i = 1; i <= count; i++) {
	            System.out.print("Enter current salary for employee " + i + ": ");
	            double salary = sc.nextDouble();
	            double updatedSalary = salary + (salary * 0.10); // 10% increment
	            System.out.println("Updated Salary: " + updatedSalary);
	        }
	    }
}
