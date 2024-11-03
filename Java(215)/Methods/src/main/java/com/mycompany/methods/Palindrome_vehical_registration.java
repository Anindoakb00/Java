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
public class Palindrome_vehical_registration {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter registration number:");
        int Regnum = sc.nextInt();
        int Reverse_num=0;
        while(Regnum!=0){
            int temp = Regnum%10;
            Reverse_num = Reverse_num*10+temp;
            Regnum/=10;
            
            
        }
        if(Regnum==Reverse_num){
            System.out.println("The number is palindrome number ");
            
        }
        else{
            System.out.println("The number is not palindrome number ");
        }
        
    }
    
}
