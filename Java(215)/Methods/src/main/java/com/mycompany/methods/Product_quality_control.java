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
public class Product_quality_control {
    public static void findDivisors(int productCode){
        System.out.print("The divisors of product code " + productCode+ " are: ");
        for(int i=1;i<=productCode;i++){
            if(productCode%i==0)
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the the product number: ");
        int number = sc.nextInt();
        findDivisors(number);
        
        
    }
      
}
    

