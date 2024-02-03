package lesson_07.HomeWork7;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число на выбор: 1 до 7:  ");

        int scan = scanner.nextInt();



        switch (scan){
            case 1:
                System.out.println("Понедельник");
                break;

            case 2:
                System.out.println("Вторник");
                break;

            case 3:
                System.out.println("Среда");
                break;

            case 4:

                System.out.println("Четверг");
                break;
            case 5:

                System.out.println("Пятница");
                break;
            case 6:
            case 7:
                System.out.println("Выходной");
                break;

            default:
                System.out.println("Вы ввели неверное число: " + scan);


        }

    }
}
