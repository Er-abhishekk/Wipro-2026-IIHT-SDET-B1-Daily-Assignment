package Day1;

public class salary {
	
	    public static void main(String[] args) {	        
	        double basicSalary = 45000;
	        double tax = 2500;       
	        int bonus = 5000;	       
	        double netSalary = (basicSalary + bonus) - tax;
	        System.out.println("Basic Salary: " + basicSalary);
	        System.out.println("Bonus: " + bonus);
	        System.out.println("Tax Deduction: " + tax);
	        System.out.println("-------------------------");
	        System.out.println("Net Salary: " + netSalary);
	    }
}


