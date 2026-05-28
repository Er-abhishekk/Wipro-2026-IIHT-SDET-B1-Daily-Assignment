package Day3;

public class Employee {
	 public String name;
	    private double salary;

	    public Employee(String name, double salary) {
	        this.name = name;
	        this.salary = salary;
	        System.out.println(name +" " + salary);
	    }
	    
	    public double getSalary() {
	        return salary;
	    }
	    public void setSalary(double salary) {
	        if (salary > 0) {
	            this.salary = salary;
	        }
	  }
	    public static void main(String[] arg) {
	    	Employee shanu = new Employee(shan, 4000);
	    	shanu.name();
	    }
	 
}

