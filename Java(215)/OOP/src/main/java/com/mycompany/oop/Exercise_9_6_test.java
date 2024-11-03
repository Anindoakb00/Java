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

public class Exercise_9_6_test {
    public static void main(String[] args) {
        int[] testNums = new int[100000];
        Random random = new Random();
        // Fill the entire array with random numbers
        for (int i = 0; i < testNums.length; i++) {
            testNums[i] = random.nextInt(10000);
        }

        Exercise_9_6 stopwatch = new Exercise_9_6();
        stopwatch.start();
        System.out.println("Start time: " + stopwatch.getStartTime() + " ms");

        // Call selection sort on the entire array
        selectionSort(testNums);
        
        stopwatch.stop();
        System.out.println("End time: " + stopwatch.getEndTime() + " ms");
        System.out.println("Elapsed time for selection sort: " + 
                           (stopwatch.getEndTime() - stopwatch.getStartTime()) + " ms");
    }

    // Move the selectionSort method outside the main method
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
