package Day12;
import java.io.*;
public class ExFileRead {
	 public static void main(String[] args) {
	        try {
	            FileReader reader = new FileReader("sample.txt");
	            BufferedReader bufferedReader = new BufferedReader(reader);
	            String line;
	            
	            while((line = bufferedReader.readLine()) != null) {
	                System.out.println(line);
	            }
	            bufferedReader.close();
	        }
	        catch(IOException e) {
	            System.out.println(e);
	        }
	    }
}
