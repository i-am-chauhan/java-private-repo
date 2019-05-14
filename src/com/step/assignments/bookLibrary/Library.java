package com.step.assignments.bookLibrary;

import java.util.*;

public class Library {

  Set<Book> books;
  Set<Book> removedBooks;
  Set<Reader> readers;
  Map<Book, Reader> assignedBooks;
  Librarian librarian;

  public Library(Librarian librarian) {
    this.librarian = librarian;
    this.books = new HashSet<>();
    this.removedBooks = new HashSet<>();
    this.readers = new HashSet<>();
    this.assignedBooks = new HashMap<>();
  }

  private boolean isLibrarian(Librarian librarian){
    return this.librarian == librarian;
  }

  public void addBook(Book book, Librarian librarian){
    if(this.isLibrarian(librarian)) this.books.add(book);
  }

  public void addReader(Reader reader){
    this.readers.add(reader);
  }

  public List<Book> searchBook(String bookName){
    List<Book> suggestions = new ArrayList<>();
    this.books.forEach(book -> {
      if(book.getTitle() == bookName){
        suggestions.add(book);
      }
    });
    return Collections.unmodifiableList(suggestions);
  }

  private boolean isReader(Reader reader){
    return this.readers.contains(reader);
  }

  public void borrowBook(Reader reader, Book book){
    if(!this.isReader(reader) || this.isBorrowed(book)) return;
    this.books.remove(book);
    this.assignedBooks.put(book,reader);
    reader.getBook(book);
  }

  public boolean isBorrowed(Book book){
    return this.assignedBooks.keySet().contains(book);
  }

  public void returnBook(Book book, Reader reader){
    if(!isReader(reader) || !reader.hasBook(book)) return;
    this.books.add(book);
    this.assignedBooks.remove(book);
    reader.returnBook(book);
  }

  public Reader whoBorrowed(Book book){
    return this.assignedBooks.get(book);
  }

  public List<Book> booksBorrowedBy(Reader user){
    List<Book> borrowedBooks = new ArrayList<>();
    this.assignedBooks.keySet().forEach(book -> {
      if(this.assignedBooks.get(book) == user){
        borrowedBooks.add(book);
      }
    });
    return Collections.unmodifiableList(borrowedBooks);
  }

  public void removeBook(Book book, Librarian librarian){
    if(!this.isLibrarian(librarian)) return;
    this.books.remove(book);
    this.removedBooks.add(book);
  }

  public boolean isRemoved(Book book){
    return this.removedBooks.contains(book);
  }

  public Set getBooks(){
    return Collections.unmodifiableSet(this.books);
  }

  public Set<Reader> getReaders(){
    return Collections.unmodifiableSet(this.readers);
  }

  public Map<Book, Reader> getAssignedBooks(){
    return Collections.unmodifiableMap(this.assignedBooks);
  }
}
