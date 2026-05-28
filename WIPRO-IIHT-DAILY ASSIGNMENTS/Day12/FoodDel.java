package Day12;
import java.io.*;
import java.util.Scanner;

public class FoodDel {
    public static void main(String[] args) {
        
        try (Scanner s = new Scanner(new File("menu.txt"))) {
            System.out.println("Available Menu:");
            while (s.hasNextLine()) {
            	System.out.println("- " + s.nextLine());
            	}          
           
        } catch (Exception e) { 
        	System.out.println("Menu file missing."); 
        	}
    }
}
