package demo;

public class Main {

  public static void main(String[] args) {

    Main main = new Main();

    Author JKR = new Author("JK. Rowling", 'F', "JKR@gmail.com");
    Author JRRT = new Author("J. R. R. Tolkien", 'M', "JRRT@gmail.com");

    Book HP1 = new Book("Harry Potter 1", 500, JKR);
    Book HP2 = new Book("Harry Potter 2", 800, JKR);
    Book HP3 = new Book("Harry Potter 3", 900, JKR);

    JKR.addBook(HP1);
    JKR.addBook(HP2);
    JKR.addBook(HP3);

    Book LOTR1 = new Book("Lord of the Rings 1", 1000, JRRT);
    Book LOTR2 = new Book("Lord of the Rings 2", 1200, JRRT);
    Book LOTR3 = new Book("Lord of the Rings 3", 1500, JRRT);
    Book LOTR4 = new Book("Lord of the Rings 4", 1300, JRRT);

    JRRT.addBook(LOTR1);
    JRRT.addBook(LOTR2);
    JRRT.addBook(LOTR3);


    main.printAuthor(JKR);
    main.printAuthor(JRRT);
  }

  public void printAuthor(Author author) {
    System.out.println("\n" + author.getName() + "      " + author.getGender() + " " + author.getEmail());
    for (int i = 0; i < author.getBooks().size(); i++) {
      System.out.println(author.getBook(i).getTitle() + "            " + author.getBook(i).getNumPages());
    }
  }

}
