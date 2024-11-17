/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalapp;

/**
 *
 * @author Mohiuddin Khan Rafi (x22128271)
 */
public class Patients {

    private String name;
    private String age;
    private String guardNam;
    private String ppsn;

    public Patients(String name, String age, String guardNam, String ppsn) {
        this.name = name;
        this.age = age;
        this.guardNam = guardNam;
        this.ppsn = ppsn;
    }

    public Patients() {
        name = " ";
        age = " ";
        guardNam = " ";
        ppsn = " ";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGuardNam() {
        return guardNam;
    }

    public void setGuardNam(String guardNam) {
        this.guardNam = guardNam;
    }

    public String getPpsn() {
        return ppsn;
    }

    public void setPpsn(String ppsn) {
        this.ppsn = ppsn;
    }

    public String getDetails() {
        return "Patients Details:\n Name: "+ name +"\n Age: "+ age + "\n Guardian Name: "+ guardNam + "\n PPS number: "+ ppsn;
    }

}
