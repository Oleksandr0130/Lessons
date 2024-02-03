package lesson_8.HomeWork_8;



// Task 1 Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while


public class Task1 {
    public static void main(String[] args) {
     int number = 1;
     do {
         if (number % 5 == 0) {
             System.out.println("Число: " + number);
         }
         number++;

     } while (number <= 100);
    }
}
