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
public class Tracking_prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        boolean isPrime = true;
        if(number<=1){
           isPrime = false;
        }
        else{
            for(int i=2;i<=Math.sqrt(number);i++){
                if(number%i==0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime)
        {
            System.out.println("The tracking number is prime");
        }
        else
        {
            System.out.println("The tracking number is not prime");
        }
        
    }
}
