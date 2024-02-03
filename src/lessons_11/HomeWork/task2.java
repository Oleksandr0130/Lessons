package lessons_11.HomeWork;


import java.util.Random;

//Написать метод, принимающий массив целых чисел.
// Метод должен вернуть количество простых чисел в массиве.
// Для проверки на "простоту" числа рекомендуется использовать метод из Task 1
public class task2 {
    public static void main(String[] args) {
        int number = 13;
        boolean isPrime = isPrimeNumber(number);


        if (isPrime) {
            System.out.println(number + " число является простым");
        } else {
            System.out.println(number + " число не является простым");
        }

        int[] array = {3, 5, 7, 11, 13,22, 12};
        int result = countPrime(array);
        System.out.println("Кол-во простых чисел:" + result);


    }//метод


    public static int countPrime(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (isPrimeNumber(num)) {
                count++;
            }
        }
        return count;
    }


        public static boolean isPrimeNumber ( int num){
            if (num <= 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false; // Если нашли делитель, число не простое
                }

            }
            return true; // если не нашли делителей, число простое
        }

    }


