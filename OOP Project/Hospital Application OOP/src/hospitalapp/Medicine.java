/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalapp;

/**
 *
 * @author David
 */
public class Medicine {
    private double tablets;
    private double capsules;
     private double saline;

    public Medicine(double tablets, double capsules, double saline) {
        this.tablets = tablets;
        this.capsules = capsules;
        this.saline = saline;
    }

    public double getTablets() {
        return tablets;
    }

    public void setTablets(double tablets) {
        this.tablets = tablets;
    }

    public double getCapsules() {
        return capsules;
    }

    public void setCapsules(double capsules) {
        this.capsules = capsules;
    }

    public double getSaline() {
        return saline;
    }

    public void setSaline(double saline) {
        this.saline = saline;
    }
     
     
    
}
