package Task_63;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  // Используйте класс Book из домашнего задания к уроку 53 (см. Book.java), но без интерфейса Comparable.
  //Создайте список книг и отсортируйте книги по автору, (при одинаковых авторах - по названиям)
  // при помощи анонимного класса в качестве компаратора.


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Book> books = new ArrayList<>();

    books.add(new Book("Дэниел Киз", "Таинственная история Билли Миллигана", 320));
    books.add(new Book("Дэниел Киз", "Aaa", 320));
    books.add(new Book("Джордж Оруэлл", "Скотный двор", 360));
    books.add(new Book("Уильям Голдинг", "Повелитель мух", 190));
    books.add(new Book("Дэниел Киз", "Цветы для Элджернона", 290));
    books.add(new Book("Виктор Пелевин", "Чапаев и пустота", 240));
    books.add(new Book("Антуан де Сент-Экзюпери", "Маленький принц", 210));
    books.add(new Book("Олдос Хаксли", "О дивный новый мир", 360));

    boolean isRun = true;
    while (isRun) {
      System.out.println("\t\t\tВыберите способ сортировки:");
      System.out.println("1. По автору книги");
      System.out.println("2. При одинаковых авторах - по названию");
      System.out.println("3. По названию книги");
      System.out.println("0. Выход");

      if (scanner.hasNextInt()) {
        int command = scanner.nextInt();
        scanner.nextLine();

        switch (command) {
          case 1:
            printComparisonByAuthor(books);
            break;
          case 2:
            printComparisonByAuthorAndByTitles(books);
            break;
          case 3:
            printComparisonByTitles(books);
            break;
          case 0:
            System.out.println("До встречи");
            isRun = false;
            break;
          default:
            System.out.println("Нет такой опции");
            break;
        }
      }
    }
  }

  private static void printComparisonByAuthor(ArrayList<Book> books) {
    books.sort(new Comparator<Book>() {
      @Override
      public int compare(Book o1, Book o2) {
        return o1.getAuthorBook().compareTo(o2.getAuthorBook());
      }
    });
    printComparisonByAuthorAndTitles(books);
  }

  private static void printComparisonByAuthorAndByTitles(ArrayList<Book> books) {
    books.sort(new Comparator<Book>() {
      @Override
      public int compare(Book o1, Book o2) {

        int author = o1.getAuthorBook().compareTo(o2.getAuthorBook());
        if ( author!= 0) {
          return author;
        }
        return o1.getNameBook().compareTo(o2.getNameBook());
      }
    });
    printComparisonByAuthorAndTitles(books);
  }

  private static void printComparisonByTitles(ArrayList<Book> books) {
    books.sort(new Comparator<Book>() {
      @Override
      public int compare(Book o1, Book o2) {
        return o1.getNameBook().compareTo(o2.getNameBook());
      }
    });
    printComparisonByAuthorAndTitles(books);
  }

  private static void printComparisonByAuthorAndTitles(ArrayList<Book> books) {
    for (int i = 0; i < books.size(); i++) {
      System.out.println((i + 1) + ". " + books.get(i));
    }
  }
}
