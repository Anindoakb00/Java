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
public class Multiple_table_genarator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your preferable nth Table:");
        int n = sc.nextInt();
        int table;
        System.out.println("The "+ n +"th" + " table is:");
        for(int i=1;i<=10;i++){
            table = n*i;
            System.out.println(n+"*"+i+" = "+table);
        }
        
    }
}
