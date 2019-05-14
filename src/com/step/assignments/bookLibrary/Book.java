package com.step.assignments.bookLibrary;

public class Book {
  private String title;
  private String authorName;
  private String genre;
  private String id;

  public Book(String title, String authorName, String genre, String id) {
    this.title = title;
    this.authorName = authorName;
    this.genre = genre;
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthorName() {
    return authorName;
  }

  public String getGenre() {
    return genre;
  }

  public String getId() {
    return id;
  }

  @Override
  public String toString() {
    return "Book{" +
            "title='" + title + '\'' +
            ", authorName='" + authorName + '\'' +
            ", genre='" + genre + '\'' +
            ", id='" + id + '\'' +
            '}';
  }
}
