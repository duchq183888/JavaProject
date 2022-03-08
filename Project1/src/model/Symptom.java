/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author hqd16
 */
public class Symptom {
    private String SymptomName;
    private double Degree;

    public Symptom() {
    }

    public Symptom(String SymptomName, double Degree) {
        this.SymptomName = SymptomName;
        this.Degree = Degree;
    }

    public String getSymptomName() {
        return SymptomName;
    }

    public void setSymptomName(String SymptomName) {
        this.SymptomName = SymptomName;
    }

    public double getDegree() {
        return Degree;
    }

    public void setDegree(double Degree) {
        this.Degree = Degree;
    }
   
        
    
}
