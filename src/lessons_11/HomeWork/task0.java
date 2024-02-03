package lessons_11.HomeWork;



//Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.
//
//{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]


import java.util.Arrays;

public class task0 {
    public static void main(String[] args) {

        int [] array = {1, 4, 3, 6, 7};
        System.out.print(Arrays.toString(array) + " -> ");
        changeVar(array);

        int index = 1;
        System.out.print(Arrays.toString(array) + " -> ");
        changeVar(array, index);

        boolean flag = true;
        System.out.print(Arrays.toString(array) + " -> ");
        changeVar(array, flag);





    }//Метод

    public static void changeVar (int[] arr) {
        System.out.print("[");
        for (int i = arr.length -1; i >= 0 ; i--) {
            System.out.print (arr[i] + ((i > 0) ? ", " : "]\n" ));
        }
    }

    //Перегрузить метод, если в него приходит индекс, то часть массива слева до этого индекса распечатывается в обычном порядке, а начиная с этого индекса в обратном:
    //
    //{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]

    public static void changeVar (int[] arr , int index) {
        System.out.print("[");
        for (int i = 0; i <= index; i++) {
            System.out.print(arr[i] + ((i< index) ? ", " : ""));
        }
        for (int i = arr.length -1; i > index ; i--) {
            System.out.print(", " + arr[i]);
        }
        System.out.println("]");

    }

    //Еще одна перегрузка: метод принимает массив и булевый флаг.
    // Если флаг == true -> печатает массив в обратном порядке
    // Если флаг == false -> печатает массив в прямом порядке

    public static void changeVar (int[] arr, boolean flag) {


            if (flag){
                System.out.print("[");
                for (int i = arr.length - 1; i >= 0; i--){
                    System.out.print (arr[i] + ((i > 0) ? ", " : "]\n" ));
                }
            }else {
                System.out.print("[");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + ((i < arr.length - 1) ? ", " : "]\n"));

                }
            }

            }
        }



