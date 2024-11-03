/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.methods;

/**
 *
 * @author user
 */
public class Exercise_9_13 {
    public double maxValue = Integer.MIN_VALUE;
    public int row;
    public int col;
    public static Exercise_9_13 locateLargest(double[][] a){
        Exercise_9_13 location=new Exercise_9_13();
        for(int i=0;i<a.length;i++){
            for(int j = 0;j<a.length;j++){
                if(a[i][j]>location.maxValue){
                    location.maxValue = a[i][j];
                    location.row = i;
                    location.col = j;
                }
            }
        }
        return location;
    }
    
}
