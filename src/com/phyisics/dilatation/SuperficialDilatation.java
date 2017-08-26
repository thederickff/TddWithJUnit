/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phyisics.dilatation;

/**
 *
 * @author derickfelix
 */
public class SuperficialDilatation extends LinearDilatation {
    
    private final int dimension = 2;
    
    
    /**
     * β = (S1-S0)/S0ΔT
     * @param initialS - is the the length - S0 
     * @param finalS - is the the length - S1 
     * @param deltaT - is the temperature ΔT
     * @return alpha - is the coefficient α
     */
    public double beta(double initialS, double finalS, double deltaT) {
        //return alpha(initialS, finalS, deltaT) / dimension;
        return 0;
    }
    
    /**
     * ΔS = βL0ΔT
     * @param initialS - is the the length - S0 
     * @param deltaT - is the temperature ΔT
     * @param beta - is the coefficient α
     * @return deltaL - is the the length - ΔS 
     */
    public double deltaS(double initialS, double deltaT, double beta) {
        
        return 0;
    }
    
    
    /**
     * ΔT = ΔS / βS0
     * @param initialS - is the the length - S0 
     * @param finalS - is the the length - S1
     * @param beta - is the coefficient α
     * @return deltaT - is the temperature ΔT
     */
    public double deltaTS(double initialS, double finalS, double beta) {
        
        return 0;
    }
    
    /**
     * S0 = S1 - ΔS 
     * @param finalS - is the the length - S1
     * @param deltaS - is the the length - ΔS 
     * @return initialS - is the the length - S0
     */
    public double initialS(double finalS, double deltaS) {
        
        return 0;
    }
    
    /**
     * S1 = S0 + ΔS 
     * @param initialS - is the the length - S0
     * @param deltaS - is the the length - ΔS 
     * @return initialS - is the the length - S1
     */
    public double finalS(double initialS, double deltaS) {
        
        return 0;
    }
    
}
