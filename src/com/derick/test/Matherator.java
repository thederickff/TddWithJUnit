/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.derick.test;

/**
 *
 * @author derickfelix
 */
public class Matherator implements Adder, Subtractor, Operator {

    @Override
    public long add(long... operands) {
        long ret = operands[0];

        for (int i = 1; i < operands.length; i++) {
            ret += operands[i];
        }
        return ret;
    }

    @Override
    public long subtract(long... operands) {
        long ret = operands[0];

        for (int i = 1; i < operands.length; i++) {
            ret -= operands[i];
        }
        return ret;
    }

    @Override
    public String operate(char[] operands, double... numbers) {
        double n = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(operands[i-1] == '-'){
                n -= numbers[i];
            }
            if(operands[i-1] == '+') {
                n += numbers[i];
            }
            if(operands[i-1] == '*') {
                n *= numbers[i];
            }
        }
        return Double.toString(n);
    }

}
