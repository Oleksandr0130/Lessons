package lesson_9;

import java.util.Random;

//Создать массив случайной длинны (от 5 до 15) целых случайных чисел
// заполнить массив случайными числами в диапазоне от -50 до 50
public class examplLes {
    public static void main(String[] args) {
        Random random = new Random();
        int[] ints = new int[random.nextInt(11) + 5];
        System.out.println("размер массива " + ints.length);

        System.out.print("[");

        // fori + tab

        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(101) - 50; // (0...100) - 50 -> -50...50
            System.out.print(ints[i] + ((i< ints.length - 1)? "," : "]\n"));
        }

    }
    }

