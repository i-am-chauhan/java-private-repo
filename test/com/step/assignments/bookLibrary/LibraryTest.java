package com.step.assignments.bookLibrary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

  Library library;
  Book harry;
  Book alchemist;
  Librarian ram;
  Reader me;

  @BeforeEach
  void setUp() {
    harry = new Book("Harry", "Rowling", "Fantasy", "1d");
    alchemist = new Book("Alchemist", "Anonymous", "Fantasy", "1e");
    ram = new Librarian("Ram","Octimus");
    library = new Library(ram);
    me = new Reader("Me", "reader1");
  }

  @Test
  void addBook() {
    Set<Book> set = new HashSet<>();
    set.add(alchemist);
    library.addBook(alchemist, ram);
    assertEquals(library.getBooks(),set);
  }

  @Test
  void addReader() {
    Set<Reader> set = new HashSet<>();
    set.add(me);
    library.addReader(me);
    assertEquals(library.getReaders(), set);
  }

  @Test
  void searchBook() {
    List<Book> books = new ArrayList<>();

    books.add(alchemist);
    library.addBook(alchemist,ram);
    List actualOutput = library.searchBook("Alchemist");

    assertEquals(actualOutput,books);
  }

  @Test
  void borrowBook() {
    library.addReader(me);
    library.addBook(alchemist,ram);
    library.borrowBook(me,alchemist);
    Map<Book, Reader> assignedBook = new HashMap<>();
    assignedBook.put(alchemist, me);

    assertEquals(library.getAssignedBooks(), assignedBook);
  }
}