package lessons_14.HomeWork;



//Написать метод swap, принимающий на вход массив целых чисел, и два индекса.
// Метод должен поменять местами значения, хранящихся в этих индексах
//
//{0, 1, 2, 3, 4, 5, 6} -> swap(arr, 1, 5} -> {0, 5, 2, 3, 4, 1, 6}
//Если индексы за пределами массива?
//
//Перегрузка метода для работы с массивами строк.
public class task1 {
    public static void main(String[] args) {
        int[] ints = {0, 1, 2, 3, 4, 5, 6};
        printArray(ints);
        swap(ints,1, 5, 3, 4);
        printArray(ints);


    }


    public static void printArray(int[] arr) {

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ((i < arr.length - 1) ? ", " : "]\n"));
        }
    }

    public static void swap(int[] arr, int index1, int index2, int index3, int index4) {
        if (index1 >= 0 && index1 < arr.length &&
                index2 >= 0 && index2 < arr.length &&
                index3 >= 0 && index3 < arr.length &&
                index4 >= 0 && index4 < arr.length) {
            int temp = arr[index1];
            int temp1 = arr[index3];
            arr[index1] = arr[index2];
            arr[index3] = arr[index4];
            arr[index2] = temp;
            arr[index4] = temp1;
            }else {
            System.out.println("Ошибка! Замена не произведена.");
        }
        }
    }
