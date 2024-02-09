package lessons_19;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        //Класс Arrays - набор статических методов для операции над массивами
        int[] ints = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};

        // toString - возвращает представление массива в виде строки
        String  stringArray = Arrays.toString(ints);


        System.out.println(Arrays.toString(ints));
        System.out.println(stringArray);

        //copyOf()
        // создает новый массив указанной длинны. Приэтом копирует элементы из указанного массива

        int[] newints = Arrays.copyOf(ints,9);
        System.out.println(Arrays.toString(newints));

        //можно скопировать диапазон значений из старого массива

        int[] intsRange = Arrays.copyOfRange(ints, 2, 7);// индекс от - включительно, до - не включительно
        System.out.println(Arrays.toString(intsRange));

        // метод fill заполняющий массив значениями
        int[]fillArray =new int[10];
        Arrays.fill(fillArray,10);
        System.out.println("fillArray: " + Arrays.toString(fillArray));

        int[]number = {1,2,3,4};
        int[]digits = {1,2,3,4};

        System.out.println(number == digits);// false
        System.out.println(number.equals(digits));// false

        // (Arrays.equals(digits, number) - сравнивает два массива по значению элементов
        System.out.println(Arrays.equals(digits, number));// true

        // deepToString - позволяет получать строковое представление многомерных массивов
        int[][]matrix = new int[3][4];
        System.out.println(Arrays.deepToString(matrix));

        //сортировка, поиск, System.arraycopy
    }
}
