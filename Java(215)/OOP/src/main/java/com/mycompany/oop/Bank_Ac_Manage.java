/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author user
 */
/**Problem**: Design a `BankAccount` class to manage customers bank accounts. Each account has a unique account number, a name, and a balance. Add methods to:
     - Deposit money
     - Withdraw money (if there are sufficient funds)
     - Show the account balance
     - Get details of all transactions (using an array to store the history of transactions)
   - **Extra Challenge**: Include a method to calculate if the account number is a *prime number* (to check if it’s "special").
   */

import java.util.ArrayList;

public class Bank_Ac_Manage{
    int accountNumber;
    String accountHolder;
    double balance;
    ArrayList<String> tranactionHistory;
    Bank_Ac_Manage(int acNum, String achol, double intialBal){
        accountNumber = acNum;
        accountHolder = achol;
        balance = intialBal;
        tranactionHistory = new ArrayList<>();
        
        tranactionHistory.add("Account creater with initial balance"+intialBal);
    }
    void deposite(double amount){
        if(amount>0){
            balance+=amount;
            tranactionHistory.add("Deposited:"+amount);
            System.out.println("Deposite: "+amount);
        }else{
            System.out.println("Invalid deposite amount");
        }
        
    }
    //withdraw money from the acccount if there are suffeciant funds
    void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            tranactionHistory.add("Withdrew: "+ amount);
            System.out.println("Withdrew: "+ amount);
        }else{
            System.out.println("Invalid amount.");
        }
    }
    //show the account balance
    void showBalance(){
        System.out.println("Current balance:"+ balance);
    }
    //Get details of all TransactionHistory
    void showTransactionHistory(){
        System.out.println("Transaction History for account number "+ accountNumber + ":");
        for(String transaction:tranactionHistory){
            System.out.println(transaction);
        }
        
    }
    //check if the account number is a prime Number
    public boolean isPrimeAccountNumber(){
        return isPrime(accountNumber);
    }
    boolean isPrime(int number){
        if(number<=1)
            return false;
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0)
                return false;
        }
        return true;
    }
    
    
    
    
}