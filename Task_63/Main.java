package Task_63;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
  // Используйте класс Book из домашнего задания к уроку 53 (см. Book.java), но без интерфейса Comparable.
  //Создайте список книг и отсортируйте книги по автору, (при одинаковых авторах - по названиям)
  // при помощи анонимного класса в качестве компаратора.


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Book> books = new ArrayList<>();

    books.add(new Book("Дэниел Киз", "Таинственная история Билли Миллигана", 320));
    books.add(new Book("Джордж Оруэлл", "Скотный двор", 360));
    books.add(new Book("Уильям Голдинг", "Повелитель мух", 190));
    books.add(new Book("Дэниел Киз", "Цветы для Элджернона", 290));
    books.add(new Book("Виктор Пелевин", "Чапаев и пустота", 240));
    books.add(new Book("Антуан де Сент-Экзюпери", "Маленький принц", 210));
    books.add(new Book("Олдос Хаксли", "О дивный новый мир", 360));

    System.out.println("Выберите способ сортировки:");
    System.out.println("1. По автору книги");
    System.out.println("2. По названию книги");
    int mode = scanner.nextInt();
    scanner.nextLine();
    switch (mode) {
      case 1:
        printComparisonByAuthor(books);
        break;
      case 2:
        printComparisonByTitles(books);
        break;
      default:
        System.out.println("Нет такой опции");
        break;
    }
  }

  private static void printComparisonByAuthor(List<Book> books) {
    books.sort(new Comparator<Book>() {
      @Override
      public int compare(Book o1, Book o2) {
        return o1.getAuthorBook().compareTo(o2.getAuthorBook());
      }
    });
    printComparisonByAuthorAndTitles(books);
  }

  private static void printComparisonByTitles(List<Book> books) {
    books.sort(new Comparator<Book>() {
      @Override
      public int compare(Book o1, Book o2) {
        return o1.getNameBook().compareTo(o2.getNameBook());
      }
    });
    printComparisonByAuthorAndTitles(books);
  }

  private static void printComparisonByAuthorAndTitles(List<Book> books) {
    for (Book book : books) {
      System.out.println(book);
    }

  }
}
