/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author user
 */
public class Exercise_9_1 {
    private double width;
    private double height;
    Exercise_9_1(double new_width,double new_height){
        this.width= new_width;
        this.height = new_height;
        
    }
     Exercise_9_1() {
        width = 1;
        height = 1;
    }
     public double getWidth() {
        return width;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }
    double get_Area(){
        return width*height;
    }
    double get_Perimeter(){
        return 2*width + 2*height;
    }
    
}
