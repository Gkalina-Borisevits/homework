import java.util.Scanner;

public class Task_62 {
 // Напишите рекурсивный метод public static String reverse(int x), который будет возвращать строку,
  // содержащую десятичные цифры числа в обратном порядке (развернёт число).
 public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

   System.out.print("Введите положительное целое число: ");
   while (scanner.hasNextInt()){
     int number = scanner.nextInt();
     System.out.println(reverse(number));
   }
 }
  public static String reverse(int x) {
   if (x <=9) {
     return null;
   } else {
     return x % 10 + reverse(x / 10);
   }
  }
}
