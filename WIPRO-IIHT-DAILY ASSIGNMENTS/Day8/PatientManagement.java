package Day8;

import java.util.ArrayList;
import java.util.Scanner;

public class PatientManagement {
	static ArrayList<String> patients = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
	static void addPatient() {
        System.out.print("Enter patient name: ");
        String name = sc.nextLine();
        patients.add(name);
        System.out.println("Patient added! Total: ");
    }
    
    static void showAll() {
        if(patients.isEmpty()) {
            System.out.println("No patients");
            return;
        }
        System.out.println("\nPatients:");
        for(int i = 0; i < patients.size(); i++) {
            System.out.println(patients.get(i));
        }
    }
    
  
    
    
    public static void main(String[] args) {
        
    	while(true) {
            System.out.println("\n1. Add Patient");
            System.out.println("2. Show All Patients");            
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            
            int choice = sc.nextInt();
            sc.nextLine();
            
            if(choice == 1){
            	addPatient();
            }
            else if(choice == 2){
            	showAll();
            }            
            else if(choice == 3){
                System.out.println("Bye!");
                break;
            }
        }
    }
    
    
}
