/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Saurabh Kumar
 */
public class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // Remove a book from the library
    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
        System.out.println("Book with ISBN " + isbn + " removed.");
    }

    // Update book details
    public void updateBook(String isbn, String newTitle, String newAuthor) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.setTitle(newTitle);
                book.setAuthor(newAuthor);
                System.out.println("Book details updated.");
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }

    // List all books
    public void listBooks() {
        for (Book book : books) {
            book.displayDetails();
        }
    }

    // Add a user to the library
    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user.getName());
    }

    // Remove a user from the library
    public void removeUser(int userId) {
        users.removeIf(user -> user.getUserId() == userId);
        System.out.println("User with ID " + userId + " removed.");
    }

    // Update user details
    public void updateUser(int userId, String newName) {
        for (User user : users) {
            if (user.getUserId() == userId) {
                user.setName(newName);
                System.out.println("User details updated.");
                return;
            }
        }
        System.out.println("User with ID " + userId + " not found.");
    }
    
     // Method to display all user details
    public void displayAllUsers() {
        for (User user : users) {
            user.displayUserDetails();
            System.out.println("-------------------------");
        }
    }
    
}
