/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author user
 */
public class Array_of_Objects {
    public static void main(String[] args){
        Main_Array[] refrigerator = new Main_Array[3];
        Main_Array food1 = new Main_Array("pizza");
        Main_Array food2 = new Main_Array("humburger");
        Main_Array food3 = new Main_Array("hotdog");
        
        refrigerator[0]= food1;
        refrigerator[1]= food2;
        refrigerator[2]= food3;
        System.out.println(refrigerator[0].Name);
        System.out.println(refrigerator[1].Name);
        System.out.println(refrigerator[2].Name);
        
        
        
    }
}
