package lesson_8;

import java.util.Random;

public class ArrayExample {
    public static void main(String[] args) {

        // Обьявление массива
        //Variable 1
        int[] array;

        //Variable 2 альтернатианый способ. Не рекомендуется к использованию
        int numbers[];

        // Иницифлизация массива
        array = new int[5]; // Массив, как обьект, создается в памяти. При инициализации мы обязаны указать размер массива
        // 5 - размер массива (кол-во ячеек)

        String[] strings = new String[7]; // обьявление и инициализация массива
        // Мысоздали переменную, которая будет хранить ссылку на массив Строк (в Stack)
        // Мы создали обьект в памяти (в Heap)
        // каждую ячейку массива мы заполнили значение "  по умолчанию"

        // Значение по умолчанию:
        //для всез числовых типов (в том числе char) это будет 0 (0.0)
        // для Boolean - false
        //Для всех ссылочных типов - значение null (null - ничего)

        // явная инициализация массива:
        int[] digits = new int[] {56, -98, 14, 1004, 1143};
        String[] strings1 = {"Str", "hello", "Java", "JS", "Orange"};

        int bum = 15;

        // Доступ к значениям в ячейках массива осуществляется по индексам:

        int value = digits[0]; // в переменную value было записано значение ячеки с индексом (номером) 0;

        System.out.println("value: " + value);

        System.out.println(" В ячейки под номером 2 в массиве strings1 хранится : " + strings1[2].toUpperCase());
        System.out.println(" В ячейки под номером 3 в массиве digits хранится : " + digits[3]);
        System.out.println(" В ячейки под номером 3 в массиве digits хранится : " + (digits[3] / 2 - 15));
        System.out.println(" Мы можем производить с полученным значением допустимые типом операции : " + (digits[3] / 2 - 15));


        System.out.println(digits);

        // размер массива
        int arraylength = digits.length;

        int i = 0;
        while (i < arraylength){
            System.out.print(digits[i++] + ", ");

        }
        System.out.println();

        // изменение значение в ячейке массива
        digits[2] = 5000;

        i = 0;
        while (i< digits.length){
            System.out.print(digits[i] + ", ");
            i++;
        }

        System.out.println("array[2]: " + array[2]); // проверяем значение в ячейках массивов, заполненых значениями по умолчанию
        System.out.println("string1[2]: " + strings[5]); //  попытка вызова у null каких либо методов вызовет исключение (аварийное завершение программы)

        strings[5] = "Pascal"; // изменяем значениие в ячейке с индексом 5

        System.out.println("string1[2]: " + strings[5]); //  попытка вызова у null каких либо методов вызовет исключение (аварийное завершение программы)

        // создать массив из 10 елементов и заполние его случайными числами (0..100):

        Random random = new Random();

        int[] nums = new int[10];

        int k = 0;
        System.out.println("[");
        while (k<nums.length){
            nums[k] = random.nextInt(101);
            System.out.print(nums[k] + ", ");
            k++;
        }

        System.out.println("]");

        k = 1;
        int min = nums[0];
        while (k < nums.length){
            if ( nums[k] < min){
                min = nums[k];
            }
            k++;
        }
        System.out.println(min);


    }
}
