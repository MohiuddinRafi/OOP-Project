/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalapp;

/**
 *
 * @author David
 */
public class Equipment {
     private double syringe;
     private double gauze;
     private double ppe;
     private double bandage;
     private double splint;

    public Equipment(double syringe, double gauze, double ppe, double bandage, double splint) {
        this.syringe = syringe;
        this.gauze = gauze;
        this.ppe = ppe;
        this.bandage = bandage;
        this.splint = splint;
    }

    public double getSyringe() {
        return syringe;
    }

    public void setSyringe(double syringe) {
        this.syringe = syringe;
    }

    public double getGauze() {
        return gauze;
    }

    public void setGauze(double gauze) {
        this.gauze = gauze;
    }

    public double getPpe() {
        return ppe;
    }

    public void setPpe(double ppe) {
        this.ppe = ppe;
    }

    public double getBandage() {
        return bandage;
    }

    public void setBandage(double bandage) {
        this.bandage = bandage;
    }

    public double getSplint() {
        return splint;
    }

    public void setSplint(double splint) {
        this.splint = splint;
    }
     
     
    
}
