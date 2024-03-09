package com.mycompany.propertymanagement.controller;

public class CalculatorMain {

    public static void main (String [] args){
        CalculatorController cc = new CalculatorController();
        double result = cc.add(2.5,3.4);
        System.out.println(result);
    }
}
