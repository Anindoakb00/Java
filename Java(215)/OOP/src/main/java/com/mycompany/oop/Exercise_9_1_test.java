/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author user
 */
public class Exercise_9_1_test {
    public static void main(String[]args){
      Exercise_9_1 r1 = new Exercise_9_1(4,40);
      Exercise_9_1 r2 = new Exercise_9_1(3.5,35.9);
      System.out.println("The width,height,area and perimeter of reactangle "+
                          r1.getWidth()+", "+r1.getHeight()+","+r1.get_Area()+","+r1.get_Perimeter());
      System.out.println("The width,height,area and perimeter of reactangle "+
                          r2.getWidth()+", "+r2.getHeight()+","+r2.get_Area()+", "+r2.get_Perimeter());
    }
}
