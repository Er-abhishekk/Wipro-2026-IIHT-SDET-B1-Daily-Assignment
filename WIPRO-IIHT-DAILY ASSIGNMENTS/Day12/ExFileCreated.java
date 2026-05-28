package Day12;
import java.io.File;
import java.io.IOException;

public class ExFileCreated {
    public static void main(String[] args) {
        try {
            File file = new File("sample.txt");
            boolean created = file.createNewFile();
            
            if (created) {
                System.out.println("sample.txt CREATED");
                
            } else {
                System.out.println("already exists!");
            }
            System.out.println("Location: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
