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
public class Diagonals_in_Financial_Marrics {
    
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of row");
      int row = sc.nextInt();
      System.out.println("Enter the size of col");
      int col = sc.nextInt();
      int[][] matrix = new int[row][col];
      for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
               System.out.print("array["+(i)+","+(j)+"]: ");
               matrix[i][j]=sc.nextInt();
               
           }
          
      }
      System.out.println("The following matrix is:");
       for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
               System.out.print(matrix[i][j]+ " ");
             
           }
          System.out.println( );
      }
       // Loop in order to find the sum of primary diagonals og the matrix
       
    int primarydiagonalsum =0;
      for(int i=0;i<row;i++){
           
               primarydiagonalsum+=matrix[i][i];
             
             
           }
          
      
      // Loop in order to find the sum of secondary diagonals og the matrix
       
       int secondarydiagonal=0;
      for(int i=0;i<row;i++){
           
               secondarydiagonal+=matrix[i][col-i-1];
               
               
             
           }
        System.out.println("The sum of primary diagonals is: "+primarydiagonalsum);
        System.out.println("The sum of secondary diagonals is: "+secondarydiagonal);
        System.out.println("So, Here The sum of main diagonal(loans): "+primarydiagonalsum);
         
      
        
    }
}
