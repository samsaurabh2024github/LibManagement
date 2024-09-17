/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library2;

import java.util.Scanner;

/**
 *
 * @author Saurabh Kumar
 */
public class LibraryManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            // Display menu options
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Update Book");
            System.out.println("4. List All Books");
            System.out.println("5. Add User");
            System.out.println("6. Remove User");
            System.out.println("7. Update User");
            System.out.println("8. Display All Users");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (choice) {
                case 1:
                    // Add Book
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book ISBN: ");
                    String isbn = scanner.nextLine();
                    Book newBook = new Book(title, author, isbn);
                    library.addBook(newBook);
                    break;

                case 2:
                    // Remove Book
                    System.out.print("Enter ISBN of the book to remove: ");
                    String removeIsbn = scanner.nextLine();
                    library.removeBook(removeIsbn);
                    break;

                case 3:
                    // Update Book
                    System.out.print("Enter ISBN of the book to update: ");
                    String updateIsbn = scanner.nextLine();
                    System.out.print("Enter new title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter new author: ");
                    String newAuthor = scanner.nextLine();
                    library.updateBook(updateIsbn, newTitle, newAuthor);
                    break;

                case 4:
                    // List All Books
                    System.out.println("Listing all books:");
                    library.listBooks();
                    break;

                case 5:
                    // Add User
                    System.out.print("Enter user type (1 for Student, 2 for Librarian): ");
                    int userType = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter user name: ");
                    String userName = scanner.nextLine();
                    System.out.print("Enter user ID: ");
                    int userId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline

                    if (userType == 1) {
                        User student = new Student(userName, userId);
                        library.addUser(student);
                    } else if (userType == 2) {
                        User librarian = new Librarian(userName, userId);
                        library.addUser(librarian);
                    } else {
                        System.out.println("Invalid user type.");
                    }
                    break;

                case 6:
                    // Remove User
                    System.out.print("Enter user ID to remove: ");
                    int removeUserId = scanner.nextInt();
                    library.removeUser(removeUserId);
                    break;

                case 7:
                    // Update User
                    System.out.print("Enter user ID to update: ");
                    int updateUserId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter new user name: ");
                    String newUserName = scanner.nextLine();
                    library.updateUser(updateUserId, newUserName);
                    break;

                    case 8:
                    // Display All Users
                    System.out.println("Displaying all users:");
                    library.displayAllUsers();
                    break;
                case 9:
                    // Exit
                    exit = true;
                    System.out.println("Exiting the Library Management System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
    

