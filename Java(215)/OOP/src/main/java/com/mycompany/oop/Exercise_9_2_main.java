/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author user
 */


public class Exercise_9_2_main {
    public static void main(String[] args) {
        Exercise_9_2_class test = new Exercise_9_2_class("ORCL", "Oracle Corporation");

        test.setPreviousclosingPrice(34.5);
        test.setCurrentPrice(34.35);

        // Printing the percentage change
        System.out.println("The price change for " + test.getSymbol() + " (" + test.getName() + ") is " +
                           Math.round(test.getchangePercent() * 100.0) / 100.0 + "%");
    }
}
