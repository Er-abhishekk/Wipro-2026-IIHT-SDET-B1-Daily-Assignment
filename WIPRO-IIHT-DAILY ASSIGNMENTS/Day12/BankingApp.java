package Day12;
import java.io.*;
import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        String historyFile = "transactions.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(historyFile, false))) {
            bw.write("ACC123 | DEPOSIT | $500.00 | 2024-05-10\n");
            System.out.println("Transaction recorded.");
        } catch (IOException e) {
        	e.printStackTrace(); 
        	}

        try (Scanner sc = new Scanner(new File(historyFile))) {
            while (sc.hasNextLine()) {
                System.out.println("Reading Record: " + sc.nextLine());
            }
        } catch (FileNotFoundException e) {
        	System.out.println("File not found."); 
        	}
    }
}