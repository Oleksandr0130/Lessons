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

        Arrays.sort(integers, (int1, int2) ->{
            boolean isFirstEven = (int1 % 2) == 0;
            boolean isSecondEven = (int2 % 2) == 0;

            if (isFirstEven && isSecondEven){
                return  int1 - int2;
            }else if (isFirstEven){
                return -1;
            } else if (isSecondEven) {
                return 1;
            }else {
                return  int2 - int1;
            }
                });

        System.out.println(Arrays.toString(integers));
        System.out.println("\n==================================\n");
        Arrays.sort(integers, Comparator
                .<Integer>comparingInt(n -> n % 2 == 0 ? -1 : 1)
                .thenComparingInt(x -> x % 2 == 0 ? x : -x)
        );
        System.out.println(Arrays.toString(integers));
    }
}

