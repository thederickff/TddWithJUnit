/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.derick.test;

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
public class MatheratorTest {
    
    Matherator classUnderTest;
    public MatheratorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.classUnderTest = new Matherator();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Matherator.
     */
    @Test
    public void testAdd() {
        System.out.println("Add");
        // Let Java add it up
        long result = 10 + (-2) + 23 + 16;
        
        // Compare that to what the Matherator gives us
        assertEquals(result, this.classUnderTest.add(10, -2, 23, 16));
        result = 0;
        assertEquals(result, this.classUnderTest.add(0));
        result = 100 + 354;
        assertEquals(result, this.classUnderTest.add(100, 354));
        result = 1234 + 4321 + 9876 + 5679;
        assertEquals(result, this.classUnderTest.add(1234, 4321, 9876, 5679));
    }

    /**
     * Test of subtract method, of class Matherator.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        long result = 100 - (-345) - 4;
        assertEquals(result, this.classUnderTest.subtract(100, -345, 4));
        result = 0;
        assertEquals(result, this.classUnderTest.subtract(0, 0, 0, 0, 0));
    }
    
}