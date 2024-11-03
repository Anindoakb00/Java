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

public class healthTracker {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many miles you walks");
        int hT=sc.nextInt();
        int sum=0;
        for(;hT!=0;hT/=10){
            int last_digit=hT%10;
            sum+=last_digit;
            
            
        }
        System.out.println("Today you walks " + sum+" steps,best of luck!");
            
        
    }
    
}
