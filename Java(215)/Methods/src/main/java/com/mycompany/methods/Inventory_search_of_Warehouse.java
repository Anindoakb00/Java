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

public class Inventory_search_of_Warehouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        sc.nextLine();  // Consume the newline left by nextInt()

        String[] a = new String[size];

        // Loop for entering inventory codes
        for (int i = 0; i < size; i++) {
            System.out.println("Code " + (i + 1) + ": ");
            a[i] = sc.nextLine();  // Read input string for each code
        }

        // Search functionality
        System.out.println("Enter the code you want to search:");
        String SearchCode = sc.nextLine();  // Read the code to be searched
        
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (a[i].equals(SearchCode)) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Code " + SearchCode + " is present in the inventory");
        } else {
            System.out.println("Code " + SearchCode + " is not found in the inventory");
        }
    }
}
