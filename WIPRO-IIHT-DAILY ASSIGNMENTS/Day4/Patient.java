package Day4;

interface PatientService {
	 void registerPatient();
	 void showPatientDetails();
	}


class Doctor {
    String name;
    String special;

    Doctor(String name, String special) {
        this.name = name;
        this.special = special;
        
    }
        void GeneralPhysician(String name) {
            System.out.println("hello, may name is "+name+" tell me your problem");
        }
        
        void Cardiologist(String name) {
            System.out.println("hello, may name is "+name+" tell me your problem");
        }
    }   
class Patient {
    private int id;
    private String name;
    private int age;
    private String illness;
    Patient[][] list = new Patient[5][5];
    
    int index = 0;
    Patient(int id, String name, int age, String illness) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.illness = illness;
        
        System.out.println("registered");
        }

    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getIllness() {
        return illness;
    }

	public static void main(String[] arg) {
		
		Patient p = new Patient(1, "alpha", 50, "pain");
		Doctor d = new Doctor("d", "Cardiologist");
		
		System.out.println(p.getId()+" \n" + p.getName()+" \n"+ p.getAge() + " \n"+p.getIllness());
		
		if(p.getIllness()=="pain") {
			d.Cardiologist("dr. s kumar");
		}else {
			d.GeneralPhysician("lemda");
		}
		
		}
	
}

