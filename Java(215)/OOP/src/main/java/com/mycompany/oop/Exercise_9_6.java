/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author user
 */
public class Exercise_9_6 {

     
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    
    public Exercise_9_6() {
        startTime = System.currentTimeMillis();
    }

    
    public void start() {
        startTime = System.currentTimeMillis();
    }

    
    public void stop() {
        endTime = System.currentTimeMillis();
    }

    
    public long getElapsedTime() {
        return (endTime - startTime);
    }


}