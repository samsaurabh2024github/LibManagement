
This project is a Library Management System implemented in Java that makes use of all four Object-Oriented Programming (OOP) principles: Encapsulation, Inheritance, Polymorphism, and Abstraction. It allows you to perform several operations related to managing books and users (students and librarians) in a library.

Key Functionalities
Book Management:

Add, Remove, and Update books in the library using their ISBN (International Standard Book Number).
List all available books with their details (title, author, ISBN, and availability status).
User Management:

Add users as either Students or Librarians with specific user IDs and names.
Remove or update user information.
Display details of all users, showing their type (student or librarian) and personal information.
Borrow books: Students and librarians can borrow books, with customized messages indicating whether the book is available or not.
Display User Details:

Each user type (Student, Librarian) has a method to display its details, showcasing how polymorphism works in the project.
File Breakdown and Explanation of OOP Principles
1. Book.java
Encapsulates the details of a book using private fields (title, author, isbn, isAvailable).
Uses getter and setter methods to access and modify the book's data, demonstrating encapsulation.
Implements the LibraryItem interface, which has the displayDetails() method to show book information, illustrating abstraction.

3. User.java (Abstract Class)
Represents the base class for all types of users.
Contains common properties (name, userId) and abstract methods like borrowBook() and displayUserDetails().
Acts as an example of abstraction, as it defines a common structure for all user types without specifying exact details.
Defines the contract for subclasses (Student, Librarian) to implement, showcasing how inheritance and polymorphism are used.

5. Student.java and Librarian.java (Subclasses)
Both classes extend the User class and provide concrete implementations of the borrowBook() and displayUserDetails() methods.
Demonstrates inheritance, as Student and Librarian inherit properties and behavior from the User class.
Uses polymorphism through method overriding. Each class implements the borrowBook() method differently to reflect the user type.
Implements the displayUserDetails() method to provide specific details about students or librarians.

7. Library.java (The Manager Class)
Manages collections of books (List<Book>) and users (List<User>).
Provides methods for adding, removing, and updating books and users.
Contains the displayAllUsers() method, which iterates through all users and calls their respective displayUserDetails() methods,
utilizing polymorphism to handle different user types seamlessly.

9. LibraryManagementSystem.java (Main Class)
Contains the main() method, which acts as the entry point for the application.
Uses a Scanner for user input to provide a menu-driven interface with options to manage books and users.
Implements a loop with a switch statement to allow the user to select actions like adding books, removing users, listing all books, and displaying user details.
Demonstrates how different functionalities of the system work together, providing a real-world scenario of OOP in action.
How the Project Demonstrates OOP Principles
Encapsulation:

Both the Book and User classes encapsulate their properties using private fields and public methods to interact with them. 
This controls access to the data and protects the integrity of the objects.
Inheritance:

The User class serves as a base class for Student and Librarian, allowing these subclasses to inherit common properties and behaviors
(name, userId, borrowing functionality) while providing their specific implementations.
Polymorphism:

Polymorphism is utilized through the borrowBook() and displayUserDetails() methods. Although both Student and Librarian implement these methods differently, 
they are called in a unified way using a User reference.
When calling displayUserDetails() on an instance of User, the correct subclass method (Student or Librarian) is executed, depending on the object's type, at runtime.
Abstraction:

The User class is abstract and defines abstract methods (borrowBook(), displayUserDetails()), forcing subclasses to implement these methods.
This hides the complex logic of different user types and allows for interaction at a higher level.
The LibraryItem interface defines a common method (displayDetails()) for all items in the library,
allowing the program to handle various library items in a consistent manner.
Summary
This Library Management System project showcases how OOP concepts can be effectively used to build a real-world application.
The modular structure of the system allows for easy extension. For instance, new user types (e.g., teachers) can be added by creating additional subclasses of User,
adhering to the open-closed principle in software design.

The project's use of abstraction and polymorphism allows the system to handle different user types and book objects seamlessly. Encapsulation protects data integrity,
and inheritance promotes code reuse, resulting in a flexible and maintainable codebase.
