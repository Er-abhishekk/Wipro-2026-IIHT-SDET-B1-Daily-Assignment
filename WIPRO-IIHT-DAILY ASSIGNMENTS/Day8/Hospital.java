package Day8;

import java.util.LinkedList;

class HospitalQueue{
    LinkedList<String> patients = new LinkedList<>();

    public void addPatient(String name) {
        patients.addLast(name);
        System.out.println(name + " added to queue");
    }

    public void addEmergencyPatient(String name) {
        patients.addFirst(name);
        System.out.println(name + " added as emergency");
    }

    public void removePatient() {
        if (patients.isEmpty()) {
            System.out.println("No patients in queue");
        } else {
            String removed = patients.removeFirst();
            System.out.println(removed + " is treated and removed");
        }
    }

    public void viewPatients() {
        if (patients.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Patient Queue: " + patients);
        }
    }

    public void firstPatient() {
        if (!patients.isEmpty()) {
            System.out.println("First patient: " + patients.getFirst());
        }
    }

    public void lastPatient() {
        if (!patients.isEmpty()) {
            System.out.println("Last patient: " + patients.getLast());
        }
    }
}

public class Hospital {
    public static void main(String[] args) {

        HospitalQueue hq = new HospitalQueue();
        hq.addPatient("Ravi");
        hq.addPatient("Amit");
        hq.addEmergencyPatient("Suresh");
        hq.viewPatients();
        hq.firstPatient();
        hq.lastPatient();
        hq.removePatient();
        hq.viewPatients();
    }
}