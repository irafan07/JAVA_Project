package code.company;

import java.util.Scanner;
class Book{
    private final String Name;
    private final String Author;
    private boolean Available;
    public Book(String Name,String Author){
        this.Name=Name;
        this.Author=Author;
        this.Available=true;
    }

     public String getName() {
         return Name;
     }

     public String getAuthor() {
         return Author;
     }

     public boolean isAvailable() {
         return Available;
     }
     public void borrowBook() {
         if (Available) {
             Available = false;  // Book is borrowed
         } else {
             System.out.println("The book is already borrowed.");
         }
     }
     public void ReturnBook(){
        if(!Available){
            Available=true;
        }
        else {
            System.out.println("Book Never Borrow");
        }
     }
     @Override
     public String toString(){
        return  "Title:"+ Name +"\nAuthor:"+Author+"\nAvailable:"+(Available?"Yes":"No");
     }
 }
 class Library{
     private Book[] books;
     private int NumOfBook;
     public Library(int Capacity){
         books=new Book[Capacity];
         NumOfBook=0;
     }
     public void AddBook(String Title,String Author)
     {
         if(NumOfBook<books.length){
             books[NumOfBook]=new Book(Title,Author);
             NumOfBook++;
             System.out.println("Book Successfully Added !");
         }
         else {
             System.out.println("Library is Full !");
         }
     }
     public void displayBooks() {
         if (NumOfBook == 0) {
             System.out.println("No books available in the library.");
             return;
         }
         for (int i = 0; i < NumOfBook; i++) {
             System.out.println(books[i].toString());
         }
     }
     public Book SearchBook(String Title){
         for(int i=0;i<NumOfBook;i++){
             if(books[i].getName().equalsIgnoreCase(Title)){
                 return books[i];
             }
         }
         return null;
     }
     public void BorrowBook(String Title){
         Book book=SearchBook(Title);
         if(book!=null&& book.isAvailable()){
             book.borrowBook();
             System.out.println("You Borrow A book Named "+book.getName());
         }
         else if(book!=null){
             System.out.println("The book is already borrowed.");
         }
         else {
             System.out.println("Book not found.");
         }
     }
     public void ReturnBook(String title) {
             Book book = SearchBook(title);
             if (book != null && !book.isAvailable()) {
                 book.ReturnBook();
                 System.out.println("You have returned: " + book.getName());
             } else if (book != null) {
                 System.out.println("This book wasn't borrowed.");
             } else {
                 System.out.println("Book not found.");
             }
     }
}
public class MAIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library(10);  // Initialize the library with a capacity of 10 books

        while (true) {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1:
                    // Add a new book
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book Author: ");
                    String author = scanner.nextLine();
                    library.AddBook(title, author);
                    break;

                case 2:
                    // Display all books
                    library.displayBooks();
                    break;

                case 3:
                    // Borrow a book
                    System.out.print("Enter book title to borrow: ");
                    title = scanner.nextLine();
                    library.BorrowBook(title);
                    break;

                case 4:
                    // Return a book
                    System.out.print("Enter book title to return: ");
                    title = scanner.nextLine();
                    library.ReturnBook(title);
                    break;

                case 5:
                    // Exit the program
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}


