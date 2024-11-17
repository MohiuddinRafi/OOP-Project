/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalapp;

/**
 *
 * @author Mohiuddin Khan Rafi(x22128271)
 */
public class OrdinaryPatients extends Patients{
    private String symptoms;
    private String symDuration;

    public OrdinaryPatients(String symptoms, String symDuration, String name, String age, String guardNam, String ppsn) {
        super(name, age, guardNam, ppsn);
        this.symptoms = symptoms;
        this.symDuration = symDuration;
    }

    public OrdinaryPatients() {
        super();
        this.symptoms = " ";
        this.symDuration = " ";
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getSymDuration() {
        return symDuration;
    }

    public void setSymDuration(String symDuration) {
        this.symDuration = symDuration;
    }
    @Override
    public String getDetails(){
        return super.getDetails()+"\n Symptom: "+symptoms+"\n Symptom Duration: "+symDuration;
    }
    
    
}
