package lessons_12.HomeWork;

import java.util.Arrays;


//Написать метод, принимающий на вход массив целых чисел.
// Метод должен вернуть массив, состоящий только из простых чисел, присутствующих в изначальном массиве
//
//вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {13, 56, 45, 89, 45, 41, 533, 56, 87, 0, 3, 23, 56};
        int[] primes = filterPrimes(numbers);

        System.out.println("Исходный массив: " + Arrays.toString(numbers));
        System.out.println("Массив простых чисел: " + Arrays.toString(primes));
    }

    public static int[] filterPrimes(int[] numbers) {
        int[] primes = new int[numbers.length];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (isPrimeNumber(num)) {
                primes[count] = num;
                count++;
            }
        }

        return Arrays.copyOf(primes, count);
    }

    public static boolean isPrimeNumber(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Если нашли делитель, число не простое
            }
        }

        return true; // Если не нашли делителей, число простое
    }
}
