/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

import java.util.Date;

public class Exercise_9_3_class extends Date {
    private static final long startElapsedTime = 10000;
    private static final long endElapsedTime = 100000000000L;

    public static void main(String[] args) {
        Exercise_9_3_class date = new Exercise_9_3_class();
        for (long elapsedTime = startElapsedTime; elapsedTime < endElapsedTime; elapsedTime *= 10) {
            date.setTime(elapsedTime);
            System.out.println(date.toString());
        }
    }
}
