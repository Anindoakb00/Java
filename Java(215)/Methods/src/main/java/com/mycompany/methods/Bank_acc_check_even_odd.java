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
public class Bank_acc_check_even_odd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer:");
        int number = sc.nextInt();
        int lastdigit = number%10;
        switch(lastdigit){
            case 0:
                case 2:
                    case 4:
                        case 6:
                            case 8:
                                System.out.println("The account is eligible for the promotion(Even last digit");
                                break;
                            case 1:
                            case 3:
                            case 5:
                            case 7:
                            case 9:
                                System.out.println("The account is not eligible for the promotion(Odd last digit");
                                break;
                            default:
                                System.out.println("Invalid input.");
                                
                                
                
        }
        sc.close();
        
    }
}
