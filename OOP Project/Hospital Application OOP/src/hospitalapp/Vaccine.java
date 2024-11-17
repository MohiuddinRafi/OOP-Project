/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalapp;

/**
 *
 * @author David
 */
public class Vaccine {
     private double covid;
     private double polio;
     private double flu;
     private double dengue;

    public Vaccine(double covid, double polio, double flu, double dengue) {
        this.covid = covid;
        this.polio = polio;
        this.flu = flu;
        this.dengue = dengue;
    }

    public double getCovid() {
        return covid;
    }

    public void setCovid(double covid) {
        this.covid = covid;
    }

    public double getPolio() {
        return polio;
    }

    public void setPolio(double polio) {
        this.polio = polio;
    }

    public double getFlu() {
        return flu;
    }

    public void setFlu(double flu) {
        this.flu = flu;
    }

    public double getDengue() {
        return dengue;
    }

    public void setDengue(double dengue) {
        this.dengue = dengue;
    }
      
      
    
}
