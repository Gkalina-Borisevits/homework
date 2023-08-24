package Task_64;

public class Book {

  private final String authorBook;
  private final String nameBook;
  private final int pagesBook;

  public Book(String authorBook, String nameBook, int pagesBook) {
    this.authorBook = authorBook;
    this.nameBook = nameBook;
    this.pagesBook = pagesBook;
  }

  public String getAuthorBook() {
    return authorBook;
  }

  public String getNameBook() {
    return nameBook;
  }

  @Override
  public String toString() {
    return authorBook + ", " +
        nameBook ;
  }
}
