package Day8;

import java.util.HashSet;

public class HospitalReg {
    private HashSet<String> patientIds= new HashSet<>();

    public void regPatient(String id) {
        if (patientIds.add(id)) {
        	System.out.println("Patient with ID " + id + " added to the system.");
        } else {
        	System.out.println("ID " + id + " is already registered.");
        }
    }

    public void viewPatients() {
        System.out.println("\nList of Unique Registered IDs");
        if (patientIds.isEmpty()) {
            System.out.println("No patients registered.");
        } else {
            for (String id : patientIds) {
                System.out.println("Patient ID: " + id);
            }
        }
    }

    public static void main(String[] args) {
        HospitalReg hospital = new HospitalReg();

        hospital.regPatient("P1");
        hospital.regPatient("P2");
        hospital.regPatient("P1");

        hospital.viewPatients();
    }
}

