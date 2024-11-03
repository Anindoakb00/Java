/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author user
 */
import java.util.Random;
public class Exercise_9_4__Main {
    
        private static final int seed = 1000;
        private static final int n =100;
        public static void main(String[] args){
            Random random = new Random(seed);
            for(int i =0;i<50;i++){
                if(i%10==0) System.out.println();
                System.out.print(random.nextInt(n)+ " ");
            }
        }
        
    
    
}
