package lessons_36.HomeWork;

import java.util.Arrays;
import java.util.Comparator;

//Напишите MyComparator2 с методом сравнения для сортировки массива целых чисел в следующем порядке:
//
//Четные целые числа должны идти перед нечетными числами в порядке возрастания.
//Нечетные целые числа должны идти после четных в порядке убывания
//Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
//[2, 4, 6, 8, 9, 7, 7, 5, 3, 1] // Outpur
public class MyComparator2 {
    public static void main(String[] args) {
        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};

        Arrays.sort(integers, Comparator.comparing((Integer num) -> num % 2)
                .thenComparing(Comparator.naturalOrder())

                .thenComparing(Comparator.reverseOrder()));

        System.out.println(Arrays.toString(integers));
    }
}

