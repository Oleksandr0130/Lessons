package lesson_01;

//Напишите программу, которая находит сумму всех чисел от 1 до 100.
public class Progr2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до 100: " + sum);
    }
}
