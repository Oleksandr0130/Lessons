package lesson_9.HomeWork;


import java.util.Random;
import java.util.Scanner;

//За каждый месяц банк начисляет к сумме вклада 7% от суммы.
// Напишите консольную программу, в которую пользователь вводит сумму вклада и количество месяцев.
// А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
// Для вычисления суммы с учетом процентов используйте цикл for.
//
//Пусть сумма вклада будет представлять тип float.
//
//Введите сумму вклада: 100
//Введите срок вклада в месяцах: 1
//После 1 месяцев сумма вклада составит 107,00
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму вклада: ");
        Float money = scanner.nextFloat();

        System.out.print("Кол-во месяцев: ");
        int month = scanner.nextInt();

        float procent = 7f;

        for (int i = 0; i < month; i++) {
            money = ((money * procent) / money) + money;
        }
        System.out.println(" сумма вклада составит  " + money);

        }

    }

