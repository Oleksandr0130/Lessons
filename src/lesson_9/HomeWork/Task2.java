package lesson_9.HomeWork;


import java.util.Random;

//Заполните массив 50 случайными числами от 1 до 100.
// Программа должна найти, и вывести на экран все простые числа.
// Посчитайте сколько получилось таких чисел в массиве.
// Простое число - число, которое делится на цело только на 1 и само себя.
//
//Пример простых чисел: 3, 5, 7, 11, 13 и т.д.
public class Task2 {
    public static void main(String[] args) {
       Random random = new Random();
       int size = 50;
       int range = 101;

       int[] ints = new int[size];


        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(range);
            System.out.println(ints[i] + ((i < ints.length - 1) ? ", " : "]\n"));
        }
       long start = System.currentTimeMillis();

        int countPrime = 0;

        System.out.print("[");
        for (int i = 0; i < ints.length; i++) {

            int number = ints[i];

            boolean isPrime = true;

            for (int j = 2; j < number ; j++) {
                if (number % j == 0){
                    isPrime = false;
            }
        }
            if (number < 1) isPrime = false;
            if (isPrime) {
                System.out.print( number + ", ");
                countPrime++;
            }
        }
        System.out.println("]");
        System.out.println("Кол-во простых чисел: " + countPrime);


       long end = System.currentTimeMillis();
        System.out.println("затраченное время: " + (end - start));



        //Вариант 2

         start = System.currentTimeMillis();

        int countPrime2 = 0;

        System.out.print("[");
        for (int i = 0; i < ints.length; i++) {

            int number = ints[i];

            boolean isPrime = true;

            if (number == 2 || number == 3) {
                isPrime = true;
            }
            if (number != 2 && number % 2 == 0 ||number != 3 && number % 3 == 0) {
                isPrime = false;
            }

            // 5..7; 11..13; 17..19; 23..25

            for (int j = 5; j <= Math.sqrt(number) ; j += 6) {
                if (number % j == 0 || number % (j + 2) == 0){
                    isPrime = false;
                }
            }
            if (number < 1) isPrime = false;
            if (isPrime) {
                System.out.print( number + ", ");
                countPrime++;
            }
        }
        System.out.println("]");
        System.out.println("Кол-во простых чисел: " + countPrime);


        end = System.currentTimeMillis();
        System.out.println("затраченное время: " + (end - start));


    }

            }

        






