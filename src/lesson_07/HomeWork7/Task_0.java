package lesson_07.HomeWork7;

import java.util.Scanner;

public class Task_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число на выбор: 1, 2 или 3:  ");

        int scan = scanner.nextInt();

                System.out.println("Вы ввели число: " + scan);

        switch (scan){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Вы ввели неверное число: " + scan );
        }
    }
}
