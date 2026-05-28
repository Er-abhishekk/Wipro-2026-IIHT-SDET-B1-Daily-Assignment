package Day12;

import java.io.File;

public class ExFileDelete {
    public static void main(String[] args) {
        File file = new File("sample.txt");
        
        if (file.exists()) {
            boolean deleted = file.delete();
            
            if (deleted) {
                System.out.println("DELETED successfully!");
                
            } else {
                System.out.println("Failed to delete ");
            }
        } else {
            System.out.println("does not exist!");
        }
    }
}
