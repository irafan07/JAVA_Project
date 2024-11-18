# JAVA_Project
Library Management System

This project is a simple Library Management System implemented in Java. It allows users to add books, display available books, borrow books, and return books using a text-based menu. The program demonstrates basic object-oriented programming principles, including classes, encapsulation, and method overriding.

Features

Add a Book: Users can add a new book to the library by providing the title and author.

Display All Books: Displays the list of books in the library, showing if each book is currently available or borrowed.

Borrow a Book: Users can borrow a book by entering its title. If the book is available, it will be marked as borrowed.

Return a Book: Allows users to return a borrowed book by entering its title.

Exit: Exits the program.


Class Structure

1. Book

Represents a single book in the library.

Attributes:

Name: Title of the book (immutable).

Author: Author of the book (immutable).

Available: Boolean flag indicating if the book is available.


Methods:

getName(): Returns the title.

getAuthor(): Returns the author.

isAvailable(): Checks if the book is available.

borrowBook(): Marks the book as borrowed.

ReturnBook(): Marks the book as available.

toString(): Displays book information.



2. Library

Manages a collection of Book objects.

Attributes:

books[]: Array to store books.

NumOfBook: Counter for the current number of books in the library.


Methods:

AddBook(String Title, String Author): Adds a new book if capacity allows.

displayBooks(): Prints details of all books in the library.

SearchBook(String Title): Searches for a book by title.

BorrowBook(String Title): Allows borrowing of a book if available.

ReturnBook(String Title): Allows returning of a borrowed book.



3. MAIN

The main class that contains the interactive menu.

Methods:

main(String[] args): Starts an interactive menu for users to interact with the library.



Usage

1. Compile the Program: Compile the Java files using javac.

javac MAIN.java


2. Run the Program: Run the compiled code.

java MAIN


3. Menu Options:

Enter the number corresponding to the action you want to perform:

1: Add a book.

2: Display all books.

3: Borrow a book.

4: Return a book.

5: Exit the program.


Example Usage

--- Library Management System ---
1. Add Book
2. Display All Books
3. Borrow Book
4. Return Book
5. Exit
Choose an option: 1
Enter book title: Harry Potter
Enter book Author: J.K. Rowling
Book Successfully Added !

Choose an option: 2
Title: Harry Potter
Author: J.K. Rowling
Available: Yes

Choose an option: 3
Enter book title to borrow: Harry Potter
You Borrow A book Named Harry Potter

Choose an option: 4
Enter book title to return: Harry Potter
You have returned: Harry Potter

License

This project is open-source and available under the MIT License.
