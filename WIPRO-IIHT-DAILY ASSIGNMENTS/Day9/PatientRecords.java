package Day9;
import java.util.HashMap;
import java.util.Map;

class PatientRecords {
    static Map<String, String> patients = new HashMap<>();
    
    static void addPatient(String id, String details) {
        patients.put(id, details);
        System.out.println("Patient added: " + id);
    }
    
    static void updatePatient(String id, String newDetails) {
        if (patients.containsKey(id)) {
            patients.put(id, newDetails);
            System.out.println("Patient updated: " + id);
        } else {
            System.out.println("Patient not found: " + id);
        }
    }
    
    static void getPatient(String id) {
        String details = patients.get(id);
        if (details != null) {
            System.out.println("Patient " + id + ": " + details);
        } else {
            System.out.println("Patient not found: " + id);
        }
    }
    
    public static void removePatient(String id) {
        if (patients.remove(id) != null) {
            System.out.println("Patient removed: " + id);
        } else {
            System.out.println("Patient not found: " + id);
        }
    }
    
    public static void listPatients() {
        System.out.println("All Patients:");
        for (Map.Entry<String, String> entry : patients.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }
    
    public static void checkPatient(String id) {
        System.out.println(id + " exists: " + patients.containsKey(id));
    }
    
    public static void countPatients() {
        System.out.println("Total patients: " + patients.size());
    }
    
    public static void clearSystem() {
        patients.clear();
        System.out.println("System cleared");
    }
    
    public static void main(String[] args) {
        addPatient("P1", "John Doe");
        addPatient("P2", "Jane Smith");
        
        listPatients();
        countPatients();
        
        getPatient("P1");
        updatePatient("P1", "John Doe");
        getPatient("P1");
        
        checkPatient("P1");
        checkPatient("P9");
        
        removePatient("P2");
        listPatients();
        
        clearSystem();
        countPatients();
    }
}
