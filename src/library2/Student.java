/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library2;

/**
 *
 * @author Saurabh Kumar
 */
public class Student extends User{
      public Student(String name, int userId) {
        super(name, userId);
    }

    @Override
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(getName() + " borrowed the book: " + book.getTitle());
        } else {
            System.out.println("The book is not available.");
        }
    }
    
     @Override
    public void displayUserDetails() {
        System.out.println("User Type: Student");
        System.out.println("Name: " + getName());
        System.out.println("User ID: " + getUserId());
    }
    
}
