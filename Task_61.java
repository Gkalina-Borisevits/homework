import java.util.Scanner;

public class Task_61 {

 // Найти минимальное чётное число в последовательности положительных чисел или вывести -1,
  // если такого числа не существует.
 // Оценить временную и пространственную сложность алгоритма.

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int min = Integer.MAX_VALUE;
    System.out.println("Введите необходимое количество чисел");
    int count = scanner.nextInt();
    System.out.println("Введите " + count + " положительных чисел, каждое с новой строки");

    for (int i = 0; i < count; i++) {
      int number = scanner.nextInt();

      if(number % 2 == 0 && number < min){
        min = number;
      }
    } System.out.println(min);

  }
}

