/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.methods;

/**
 *
 * @author user
 */
public class Exercise_9_7_test {
     public static void main(String[] args) {

        Exercise_9_7 obj = new Exercise_9_7(1122, 20_000);
        obj.setAnnualInterestRate(4.5);
        obj.withdraw(2500);
        obj.deposit(3000);

        System.out.println("The balance in account " + obj.getID() + " is now: $" + obj.getBalance());
        System.out.println("The total interest, at a rate of " + obj.getMonthlyInterestRate() + "%"
                + " per month is " + obj.getMonthlyInterest());
        System.out.println("And your account was created on " + obj.getDateCreated());
    }
}
