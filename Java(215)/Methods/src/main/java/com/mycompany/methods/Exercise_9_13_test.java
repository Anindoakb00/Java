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
public class Exercise_9_13_test {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the row and column");
       int row = sc.nextInt();
        int col=sc.nextInt();
               double[][] numbers = new double[row][col];
               System.out.println("Enter the elements");
         for(int r=0;r<numbers.length;r++){
             for(int c=0;c<numbers[r].length;c++){
                 numbers[r][c]=sc.nextInt();
                 
             }
         }
         Exercise_9_13 location = Exercise_9_13.locateLargest(numbers);
          System.out.printf("The location of the largest element is: %.2f at (%d, %d)", location.maxValue, location.row,
                location.col);
     
    }
    
    
    
}
