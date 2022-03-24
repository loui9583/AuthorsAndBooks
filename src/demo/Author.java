package demo;

import java.util.ArrayList;

public class Author {

private String name;
private char gender;
private String email;

  private final ArrayList<Book> books = new ArrayList<>();

  public String getName() {
    return name;
  }

  public ArrayList<Book> getBooks() {
    return books;
  }

  public Book getBook(int i) {
   return this.books.get(i);
  }

  public char getGender() {
    return gender;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  public void addBook(Book book){
this.books.add(book);
  }
Author (String name,char gender,String email){
    this.name=name;
    this.gender=gender;
    this.email=email;
}
Author(){};

}
