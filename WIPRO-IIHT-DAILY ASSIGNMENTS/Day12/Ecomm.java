package Day12;
import java.io.*;
import java.util.Scanner;

public class Ecomm {
    public static void main(String[] args) {
        String orderData = "OrderID: 99 | Customer: John Doe | Item: Laptop | Price: $1200";
        
        try (PrintWriter pw = new PrintWriter(new FileWriter("orders.txt", true))) {
            pw.println(orderData);
            System.out.println("Order and shipping details saved.");
        } catch (IOException e) {
        	e.printStackTrace(); 
        	}
        try (Scanner sc = new Scanner(new File("orders.txt"))) {
            while (sc.hasNextLine()) {
                System.out.println("Reading Record: " + sc.nextLine());
            }
        } catch (FileNotFoundException e) {
        	System.out.println("File not found."); 
        	}
    }
}
