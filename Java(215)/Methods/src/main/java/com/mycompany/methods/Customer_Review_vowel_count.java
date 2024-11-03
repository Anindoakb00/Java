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
    
public class Customer_Review_vowel_count {
    
   public static boolean hasVowels(String review) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        review = review.toLowerCase();
        for(int i=0;i<review.length();i++){
           char ch = review.charAt(i);
            for(char vowel:vowels){
                if(ch==vowel){
                    System.out.println("a vowel is present in text");
                    return true;
                }
            }
            
        }
        System.out.println("No vowel is present in the text");
        return false;
        

   }
    
  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
                
        System.out.println("Enter your review please:");
        String input = sc.nextLine();
       
       hasVowels(input);
       
    }
}
