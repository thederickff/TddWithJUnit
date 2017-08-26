/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phyisics.dilatation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author derickfelix
 */
public class SuperficialDilatationTest {
    
    public SuperficialDilatationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of beta method, of class SuperficialDilatation.
     */
    @Test
    public void testBeta() {
        System.out.println("beta");
        double initialS = 200;
        double finalS = 200.8;
        double deltaT = 100;
        SuperficialDilatation instance = new SuperficialDilatation();
        double expResult = 2E-5;
        
        double result = instance.beta(initialS, finalS, deltaT);
        assertEquals(expResult, result, 0.0);
        
    }
    
    /**
     * Test of deltaS method, of class SuperficialDilatation.
     */
    @Test
    public void testDeltaS() {
        System.out.println("finalS");
        double initialS = 4;
        double deltaT = 40;
        double beta = 1.7E-5;
        SuperficialDilatation instance = new SuperficialDilatation();
        double expResult = 0.00272;
        double result = instance.deltaS(initialS, deltaT, beta);
        assertEquals(expResult, result, 0.0);
        
        
        
        result = instance.initialS(4.00272, 0.00272);
        assertEquals(4, result, 0.0);
        result = instance.finalS(4.0, 0.00272);
        assertEquals(4.00272, result, 0.0);
    }
    
    /**
     * Test of deltaT method, of class SuperficialDilatation.
     */
    @Test
    public void testDeltaT() {
        System.out.println("deltaS");
        double initialS = 2.0;
        double finalS = 2.24;
        double beta = 60E-5;
        SuperficialDilatation instance = new SuperficialDilatation();
        double expResult = 200;
        double result = instance.deltaTS(initialS, finalS, beta);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
