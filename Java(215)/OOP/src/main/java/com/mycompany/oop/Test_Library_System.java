/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Test_Library_System {
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your book Id");
        double book_Id = sc.nextDouble();
        System.out.println("Enter the book name");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter the name of the author");
        String author_name = sc.nextLine();
        //sc.nextLine();
        Library_System owner = new Library_System(book_Id,name,author_name);
        owner.display_info();
            
        }
        
    }

