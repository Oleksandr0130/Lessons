package lessons_36.HomeWork;


import java.util.Arrays;
import java.util.Comparator;

//Напишите MyComparator, реализующий Comparator с методом сравнения для сортировки массива целых чисел в следующем порядке: Четные целые числа должны идти перед нечетными числами
//
//Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
//[2, 4, 6, 8, 1, 3, 5, 7, 7, 9] // Outpur
public class MyComparator {
    public static void main(String[] args) {

        Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };

        Arrays.sort(integers, Comparator.comparing((Integer num)-> num % 2)
                .thenComparing(Comparator.naturalOrder()));

        System.out.println(Arrays.toString(integers));
    }
}
