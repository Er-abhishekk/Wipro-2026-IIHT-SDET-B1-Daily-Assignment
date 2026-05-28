package Day3;

public class PatientRecord {
	private String healthInfo;

    public String getHealthInfo() {
        return healthInfo;
    }

    public void updateRecord(String Data, boolean isDoctor) {
        if (isDoctor) {
            this.healthInfo = Data;
        } else {
            System.out.println("Only doctors can update records");
        }
    }
    public static void main(String[] arg) {
    	
    }
}
