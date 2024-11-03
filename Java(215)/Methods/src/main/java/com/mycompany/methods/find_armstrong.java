/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.methods;

/**
 *
 * @author user
 */


import java.lang.Math;
import java.util.Scanner;
public class find_armstrong {
    public static int count_num(int num){
        int count=0;
        while(num!=0){
            num = num/10;
            count++;
        }
        
        return count;
        
    }
    public static int sum_of_digit(int n){
        int sum=0;
        int temp=n;
        int digit;
        while(temp!=0){
            digit = temp%10;
            sum+=digit;
            temp/=10;
        }System.out.println("the sum of the number is "+sum);
        return n;
    }
    public static boolean isArmstrong(int number){
        int sum=0;
        int digit,num;
        int temp = number;
        int count = count_num(number);
        
        while(temp!=0){
            digit = temp% 10;
            sum+=Math.pow(digit,count);
            temp/=10;
        }
        if(sum==number){
            
            System.out.println("The inputed number is armstrong");
            return true;
            
                
        }
        else{
            System.out.println("The inputed number is not arnmstrong");
            return false;
        }
        
        
    } 
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the number:");
        int number = sc.nextInt();
        isArmstrong(number);
        sum_of_digit(number);
        
    }
    
}
