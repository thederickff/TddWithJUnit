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

    /**
     * Test of subtract method, of class Matherator.
     */
    @Test
    public void testOperate() {
        System.out.println("Operate");
        double n1 = 25;
        double n2 = 20;
        double n3 = 10;
        double n4 = 5;
        double n5 = 2;
        String result = (n1 - n2) + "";
        char[] operands = new char[4];
        operands[0] = '-';
        assertEquals(result, this.classUnderTest.operate(operands, n1, n2));
        n1 = 400;
        n2 = 200;
        result = (n1 + n2) + "";
        operands[0] = '+';
        assertEquals(result, this.classUnderTest.operate(operands, n1, n2));
        System.out.println("2 operations");
        
        result = (n1 - n2 + n3) + "";
        operands[0] = '-';
        operands[1] = '+';
        assertEquals(result, this.classUnderTest.operate(operands, n1, n2, n3));
        result = (n1 + n2 - n3) + "";
        operands[0] = '+';
        operands[1] = '-';
        assertEquals(result, this.classUnderTest.operate(operands, n1, n2, n3));
        result = (n1 + n2 + n3) + "";
        operands[0] = '+';
        operands[1] = '+';
        assertEquals(result, this.classUnderTest.operate(operands, n1, n2, n3));
        System.out.println("3 operations");
        result = (n1 - n2 - n3 + n4) + "";
        operands[0] = '-';
        operands[1] = '-';
        operands[2] = '+';
        assertEquals(result, this.classUnderTest.operate(operands, n1, n2, n3, n4));
        result = (n1 + n2 - n3 + n4) + "";
        operands[0] = '+';
        operands[1] = '-';
        operands[2] = '+';
        assertEquals(result, this.classUnderTest.operate(operands, n1, n2, n3, n4));
        System.out.println("4 operations");
        result = (n1 + n2 - n3 + n4 - n5) + "";
        operands[0] = '+';
        operands[1] = '-';
        operands[2] = '+';
        operands[3] = '-';
        assertEquals(result, this.classUnderTest.operate(operands, n1, n2, n3, n4, n5));
        result = (n4 * n5) + "";
        operands[0] = '*';
        assertEquals(result, this.classUnderTest.operate(operands, n4, n5));
        result = (n4 - n5 * n3) + "";
        operands[0] = '-';
        operands[1] = '*';
        assertEquals(result, this.classUnderTest.operate(operands, n4, n5, n3));
    }

}
