package lessons_10.HomeWork;


//Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.
//
//{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]


import java.util.Arrays;

public class Task0 {
    public static void main(String[] args) {
        int [] array = {1, 4, 3, 6, 7};

        System.out.print(Arrays.toString(array) + " -> ");
        changeVar(array);
    }

    public static void changeVar (int[] arr) {
        System.out.print("[");
        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.print(arr[i] +  ", ");

        }
        System.out.println("]");

    }
}
