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

public class Test_Bank_Ac_Manage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your account Number:\n");
        int accountNum = sc.nextInt();
        System.out.println("Enter the account holder namen:\n");
        String accountHolder = sc.nextLine();
        sc.nextLine();
        System.out.println("what is your initial balance:\n");
        double initialBalance = sc.nextDouble();
        Bank_Ac_Manage account= new Bank_Ac_Manage(accountNum,accountHolder,initialBalance);
        while(true){
            System.out.println("\nOption");
            System.out.println("1.Deposite");
            System.out.println("2.Withdraw");
            System.out.println("3.show Balance");
            System.out.println("4.show Transaction History");
            System.out.println("5.check if Account Number is Prime");
            System.out.println("6.Exit");
            System.out.println("choose an option");
            int option = sc.nextInt();
            
            
       
        switch(option){
            case 1:
                System.out.println("Enter the amount you want to deposit:");
                double depositemoney = sc.nextDouble();
                account.deposite(depositemoney);
                break;
            case 2:
                System.out.println("Enter the amount you want to withdwal:");
                double withdrawAmount = sc.nextDouble();
                account.withdraw(withdrawAmount);
                break;
            case 3:
                account.showBalance();
                break;
            case 4:
                account.showTransactionHistory();
                break;
            case 5:
                if(account.isPrimeAccountNumber()){
                    System.out.println("The account number" + accountNum + "is a prime");
                }
                else{
                    System.out.println("The account number" + accountNum + "is  not a prime");
                }
                break;
            case 6:
                System.out.println("Exiting............");
               
                return ;
            default:
                System.out.println("Invalid option please try again");

        
    }
    
}
}
}








