/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.methods;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class Prime_Event_Schedule {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { 
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the event date:");
        int num = sc.nextInt();
        
        if (isPrime(num)) {
            System.out.print("We will arrange the programme, as the date is prime.");
        } else {
            System.out.println("The date is not prime, no arrangement will be made.");
        
    }
    }
}
