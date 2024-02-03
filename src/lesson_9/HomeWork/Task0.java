package lesson_9.HomeWork;

import java.util.Random;


//Task 0
//
//Заполните массив 20 случайными целыми числами.
// Программа должна вывести на экран массив,
// количество четных чисел в массиве
// и сумму всех четных чисел.


public class Task0 {
    public static void main(String[] args) {
        Random random = new Random();

        int size = random.nextInt(20)+1;
        System.out.println("Массив: " + size);

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array [i] = random.nextInt(20)+1;
        }
        int num1 = 0;
        int sum = 0;


        for (int i = 0; i < array.length; i++){
            int num = array[i];
            System.out.print( num + " ");

            if (num % 2 == 0){
                num1++;
                sum += num;

            }
        }
        System.out.println("Кол-во четных чисел: " + num1);
        System.out.println("Сумма чисел: " + sum);


    }
}
