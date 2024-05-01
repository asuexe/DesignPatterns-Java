package xemplle5com.EX5;

public class Exe {
    
    public static void main(String[] args) {
        Patient patient = new Patient("John Doe", 45, "stable");
        Doctor doctor1 = new Doctor("Dr. Smith");
        Doctor doctor2 = new Doctor("Dr. Johnson");
        
        patient.addObserver(doctor1);
        patient.addObserver(doctor2);
        
        patient.setCondition("critical");
        
        patient.removeObserver(doctor2);
        
        patient.setCondition("stable");
    }
    
}