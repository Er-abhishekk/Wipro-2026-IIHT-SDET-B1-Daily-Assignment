package Day9;

import java.util.TreeSet;

public class PatientRegistry {
    private static TreeSet<String> patients = new TreeSet<>();
    
    public static void registerPatient(String patientId) {
        if (patients.contains(patientId)) {            
            System.out.println("Already registered");
        } else {
            patients.add(patientId);
            System.out.println("Patient added to the system");
            System.out.println("unique ID: " + patientId);
        }
    }
    
    public static void viewPatients() {
        System.out.println("the list of registered patients:");
        System.out.println(patients);
    }
    
    public static void main(String[] args) {
        registerPatient("P3");
        registerPatient("P1");
        registerPatient("P2");
        registerPatient("P1");
        viewPatients();
    }
}
