/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalapp;

/**
 *
 * @author Mohiuddin Khan Rafi(x22128271)
 */
public class InjuredPatients extends Patients {

    private String injurType;
    private String bloodP;

    public InjuredPatients(String injurType, String bloodP, String name, String age, String guardNam, String ppsn) {
        super(name, age, guardNam, ppsn);
        this.injurType = injurType;
        this.bloodP = bloodP;
    }

    public InjuredPatients() {
        super();
        this.injurType = " ";
        this.bloodP = " ";
    }

    public String getInjurType() {
        return injurType;
    }

    public void setInjurType(String injurType) {
        this.injurType = injurType;
    }

    public String getBloodP() {
        return bloodP;
    }

    public void setBloodP(String bloodP) {
        this.bloodP = bloodP;
    }

    @Override
    public String getDetails() {
        return super.getDetails() +"\nType of Injury: "+ injurType +"\n Blood Pressure: "+ bloodP;

    }

}
