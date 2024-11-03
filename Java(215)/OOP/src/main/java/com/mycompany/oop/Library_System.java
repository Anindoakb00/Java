/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author user
 */
/*
 2. **Library System**
   - **Problem**: Create a `Library` class that manages books in a library. Each `Book` has attributes like a title, author, and a unique book ID.
     - Add methods to:
       - Add a new book
       - Check out a book (if it’s available)
       - Return a book
       - List all books of a specific genre 
       - Use an array to store all borrowed book IDs and have a method to find out how many books are currently borrowed.
   - **Extra Challenge**: Include a method in the `Book` class to check if the book ID is an *Armstrong number*, which could add a unique identifier for special books in the library.

*/
public class Library_System {
    
    String Book_title,Author_Name;
   double bookId;
    Library_System(double book_id,String title,String author){
        Book_title = title;
        Author_Name = author;
        bookId = book_id;
    }
    void display_info(){
        System.out.println("The book Id is"+bookId);
        System.out.println("The book title name is "+Book_title);
        System.out.println("The author name is "+Author_Name);
        
    }
    
    
}
