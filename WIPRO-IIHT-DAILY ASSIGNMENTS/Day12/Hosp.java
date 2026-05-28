package Day12;
import java.io.*;

public class Hosp {
    public static void savePatientReport(String patientName, String diagnosis) {
        try (PrintWriter fileout = new PrintWriter(new FileWriter(patientName + "Report.txt"))) {
            System.out.println("MEDICAL REPORT ");
            System.out.println("Patient: " + patientName);
            System.out.println("Diagnosis: " + diagnosis);
        } catch (IOException e) {
        	e.printStackTrace();
        	}
    }
    public static void main(String[] args) {
        
    	savePatientReport("Sam", "Flu");
    }
}
