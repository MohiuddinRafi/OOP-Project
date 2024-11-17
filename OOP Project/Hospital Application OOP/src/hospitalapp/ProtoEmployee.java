/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalapp;

/**
 *
 * @author peter
 */
public abstract class ProtoEmployee {//Ask about the issue while running this
     protected String name;
     protected String role;
     protected String empId;
     
     public ProtoEmployee(){//these constructors don't seem to be working properly need to look into
        name = " ";
        empId = " ";
        role = " ";
    }
    
     public ProtoEmployee(String name, String empId, String role) {
        this.name = name;
        this.empId = empId;
        this.role = role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getEmpId() {
        return empId;
    }
    
     public String getDetails(){
        return "Employee Details: "+empId+","+name+","+role;
    }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}
