package Day12;
import java.io.*;

class Employee implements Serializable {
 String name;
 int id;
 Employee(String name, int id) {
	 this.name = name; this.id = id; 
	 }
}

public class EmpMan {
 public static void main(String[] args) {
     Employee emp = new Employee("Sarah Jenkins", 501);

     try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("emp.txt"))) {
         out.writeObject(emp);
         System.out.println("Employee object saved.");
     } catch (IOException e) { 
    	 e.printStackTrace();
    	 }

     try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("emp.txt"))) {
         Employee retrieved = (Employee) in.readObject();
         System.out.println("Retrieved: " + retrieved.name + " (ID: " + retrieved.id + ")");
     } catch (Exception e) { 
    	 e.printStackTrace();
    	 }
 }
}

