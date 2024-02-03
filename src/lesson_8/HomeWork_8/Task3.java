package lesson_8.HomeWork_8;


//Дан массив целых чисел. *Выберите произвольную длину. Заполните случайными значениями.
//
//Вывести на экран:
//
//минимальное значение, хранящееся в массиве
//максимальное
//среднее арифметическое всех значений в массиве

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[10];
        int i = 0;

        while (i < nums.length) {
            nums[i] = random.nextInt(100);
            System.out.print(nums[i++] + ", ");
        }

        i = 1;
        int min = nums[0];
        while (i < nums.length) {
            if (nums[i] > min) {
                min = nums[i];
            }
            i++;
        }
        System.out.println("\n Минимальное число: " + min);

        i = 1;
        int max = nums[0];
        while (i < nums.length) {
            if (nums[i] < max) {
                max = nums[i];
            }
            i++;

        }
        System.out.println("\n Максимальное число: " + max);

        i = 0;
        int sum = nums[0];
        while ((i < nums.length)){
            if (nums[i] > sum){
                sum += nums[i];
            }
            i++;
            }
        System.out.println("\n Среднее число: " + (double)sum / nums.length);
        }
    }



