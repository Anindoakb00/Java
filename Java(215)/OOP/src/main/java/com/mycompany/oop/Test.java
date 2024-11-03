/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author user
 */
public class Test {
    public static void main(String[] args){
        understanding_Objects teacher1;
        teacher1 = new understanding_Objects();
        teacher1.name = "Anindo";
        teacher1.gender ="male";
        teacher1.phone = 1000000;
        System.out.println("Name: "+ teacher1.name);
        System.out.println("Gender: "+ teacher1.gender);
        System.out.println("Phone: "+ teacher1.phone);
        
        System.out.println();
        //New characterist for teacher 2
        understanding_Objects teacher2=new understanding_Objects();
        teacher2.name = "Amorto";
        teacher2.gender ="male";
        teacher2.phone =100900;
        System.out.println("Name: "+ teacher2.name);
        System.out.println("Gender: "+teacher2.gender);
        System.out.println("Phone: "+ teacher2.phone);
        
    }
    
}
