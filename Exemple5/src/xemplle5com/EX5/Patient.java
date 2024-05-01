package xemplle5com.EX5;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    
    private String name;
    private int age;
    private String condition;
    private List<PatientObserver> observers = new ArrayList<>();
    
    public Patient(String name, int age, String condition) {
        this.name = name;
        this.age = age;
        this.condition = condition;
    }
    
    public void addObserver(PatientObserver observer) {
        observers.add(observer);
    }
    
    public void removeObserver(PatientObserver observer) {
        observers.remove(observer);
    }
    
    public void setCondition(String condition) {
        if (!this.condition.equals(condition)) {
            this.condition = condition;
            notifyObservers();
        }
    }
    
    private void notifyObservers() {
        for (PatientObserver observer : observers) {
            observer.update(this);
        }
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getCondition() {
        return condition;
    }
    
}






