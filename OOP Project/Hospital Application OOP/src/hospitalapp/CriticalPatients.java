/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalapp;

/**
 *
 * @author Mohiuddin Khan Rafi(x22128271)
 */
public class CriticalPatients extends Patients{
    private String operation;
    private String concent;

    public CriticalPatients(String operation, String concent, String name, String age, String guardNam, String ppsn) {
        super(name, age, guardNam, ppsn);
        this.operation = operation;
        this.concent = concent;
    }

    public CriticalPatients() {
        super();
        this.operation = " ";
        this.concent = " ";
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getConcent() {
        return concent;
    }

    public void setConcent(String concent) {
        this.concent = concent;
    }
    @Override
    public String getDetails(){
        return super.getDetails()+"\nOperation: "+operation+"\n Concent: "+concent;
    }
    
    
}
