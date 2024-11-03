/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author user
 */


public class Exercise_9_2_class {
    private String Symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    // Constructor
    public Exercise_9_2_class(String symbol, String name) {
        this.Symbol = symbol;
        this.name = name;
    }

    // Getter for Symbol
    public String getSymbol() {
        return Symbol;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Setter for Previous Closing Price
    public void setPreviousclosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    // Setter for Current Price
    public void setCurrentPrice(double currentPrice) {  // Fixed method name
        this.currentPrice = currentPrice;
    }

    // Method to calculate the percentage change
    public double getchangePercent() {
        return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;  // Fixed division
    }
@Override
  public String toString() {
       return "Stock{Symbol='" + Symbol + "', Name='" + name + "', PreviousClosingPrice=" + previousClosingPrice +
               ", CurrentPrice=" + currentPrice + "}";
    }
}
