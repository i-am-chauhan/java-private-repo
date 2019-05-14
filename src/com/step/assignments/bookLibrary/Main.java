package com.step.assignments.bookLibrary;

public class Main {

  public static void main(String[] args) {
    Book harry = new Book("Harry", "Rowling", "Fantasy", "1d");
    Book alchemist = new Book("Alchemist", "Anonymous", "Fantasy", "1e");
    Librarian ram = new Librarian("Ram","Octimus");
    Library library = new Library(ram);
    library.addBook(harry, ram);
    library.addBook(alchemist, ram);
    Reader me = new Reader("Me", "reader1");
    library.addReader(me);
    System.out.println(library.searchBook("Harry"));
//    library.borrowBook(me, harry);
    System.out.println(library.booksBorrowedBy(me));
    System.out.println(library.getBooks());
//    System.out.println(library.booksBorrowedBy("You"));
  }
}
