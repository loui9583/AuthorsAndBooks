package demo;

public class Book extends Author {

private String title;
private int numPages;
private Author author;

  public String getTitle() {
    return title;
  }

  public Author getAuthor() {
    return author;
  }

  public int getNumPages() {
    return numPages;
  }

  Book(String title, int numPages, Author author){
    this.author=author;
    this.numPages=numPages;
    this.title=title;
  }



}
