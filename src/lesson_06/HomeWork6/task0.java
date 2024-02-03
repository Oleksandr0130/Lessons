package lesson_06.HomeWork6;

import java.util.Scanner;

public class task0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число на выбор: 1, 2 или 3: ");

        int scan = scanner.nextInt();

        if (scan == 1){
            System.out.println("вы ввели число: " + scan);
        } else
            if (scan == 2) {
                System.out.println("вы ввели число: " + scan);
        } else if (scan == 3) {
                System.out.println("вы ввели число: " + scan);

            }else {
                System.out.println("Вы ввели неверное число!!!");
            }

        System.out.println();

    }
}
