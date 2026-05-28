package Day12;

import java.io.FileWriter;
import java.io.IOException;

public class ExFileWriting {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("sample.txt");
            
            writer.write("Lets make a sample of File handling");
            writer.write("\nIs this is right");
 
            writer.close();
            System.out.println("Data Written Successfully");
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
}