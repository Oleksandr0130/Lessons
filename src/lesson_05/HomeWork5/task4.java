package lesson_05.HomeWork5;

import java.util.Random;
// Task 04
//
//Создайте переменную типа int.
//Инициализируйте переменную произвольным значением
//Выведите строку в формате:
//Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
//Число: 3 четное: false, кратно 3: true, четное и кратное 3: false
//Присвойте переменной другое произвольное значение. Перезапустите программу - убедитесь в верности выдаваемой строки.

public class task4 {
    public static void main(String[] args) {
        Random random = new Random();

        int rand = random.nextInt(11); // 0...10

        // czetnoje kotoroje delitsa na 2 bez ostatka. T.e. ostatok rawen 0
        boolean even = rand % 2 == 0;
        boolean devBythree = rand % 3 == 0; // pri delenii czisla na 3 ostatok raven 0
        boolean istwice = even & devBythree;

        System.out.printf("Число: %d четное: %s; кратно : %s; четное и кратное : %s\n", rand, even, devBythree, istwice);
    }
}

