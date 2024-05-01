package xemplle5com.EX5;

public class Doctor implements PatientObserver {
    
    private String name;
    
    public Doctor(String name) {
        this.name = name;
    }
    
    public void update(Patient patient) {
        System.out.println("Doctor " + name + " received an alert: " + patient.getName() + "'s condition has changed to " + patient.getCondition());
    }
    
}
