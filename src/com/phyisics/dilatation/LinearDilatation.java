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
public class LinearDilatation {
    
   
    /**
     * α = ΔL/LiΔT
     * @param initialL - is the the length - L0 
     * @param finalL - is the the length - L1 
     * @param deltaT - is the temperature ΔT
     * @return alpha - is the coefficient α
     */
    protected double alpha(double initialL, double finalL, double deltaT) {
        double alpha = (finalL - initialL)/(initialL * deltaT);
        
        String format = String.format("%.7f", alpha);
        alpha = Double.parseDouble(format);
        return alpha;
    }
    
    /**
     * ΔL = αLiΔT
     * @param initialL - is the the length - L0 
     * @param deltaT - is the temperature ΔT
     * @param alpha - is the coefficient α
     * @return deltaL - is the the length - ΔL 
     */
    protected double deltaL(double initialL, double deltaT, double alpha) {
        double deltaL = initialL * alpha * deltaT;
        
        //String format = String.format("%.7f", finalL);
        //finalL = Double.parseDouble(format);
        return deltaL;
    }
    /**
     * ΔT = ΔL / αLi
     * @param initialL - is the the length - L0 
     * @param finalL - is the the length - L1
     * @param alpha - is the coefficient α
     * @return deltaT - is the temperature ΔT  
     */
    protected double deltaTL(double initialL, double finalL, double alpha) {
        
        double deltaT = (finalL - initialL) / (initialL * alpha);
        String format = String.format("%.1f", deltaT);
        
        deltaT = Double.parseDouble(format);
        return deltaT;
    }
    
    /**
     * L0 = L1 - ΔL 
     * @param finalL - is the the length - L1
     * @param deltaL - is the the length - ΔL 
     * @return initialL - is the the length - L0
     */
    protected double initialL(double finalL, double deltaL) {
        return finalL - deltaL;
    }
    /**
     * L1 = L0 + ΔL 
     * @param initialL - is the the length - L0
     * @param deltaL - is the the length - ΔL 
     * @return initialL - is the the length - L1
     */
    protected double finalL(double initialL, double deltaL) {
        return initialL + deltaL;
    }
    
}
