package com.step.assignments.bookLibrary;

import java.util.HashSet;
import java.util.Set;

public class Reader {

  private String name;
  private String id;
  private Set<Book> borrowedBooks;

  public Reader(String name, String id) {
    this.name = name;
    this.id = id;
    this.borrowedBooks = new HashSet<>();
  }

  public void getBook(Book book){
    this.borrowedBooks.add(book);
  }

  public boolean hasBook(Book book){
    return this.borrowedBooks.contains(book);
  }

  public void returnBook(Book book){
    this.borrowedBooks.remove(book);
  }

  @Override
  public String toString() {
    return "Reader{" +
            "name='" + name + '\'' +
            ", id='" + id + '\'' +
            '}';
  }
}
