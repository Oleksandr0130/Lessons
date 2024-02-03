package lessons_12;

public class ArrayUtils {
    public static void main(String[] args) {

        int[] ints = {11, 0, 77, 33, 24, 56, 83, 99, 105, 45, -8, -15};
        int minIndex = minIndexSearch(ints);
        System.out.println(minIndex + "|" + ints[minIndex]);

        printArr(ints);

        sortArray(ints);

        printArr(ints);

        System.out.println(linearSearch(ints, 33));

        System.out.println(binarySearch(ints, 105));

    }

    public static int binarySearch(int[]array, int searchValue){
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;


        // Проверяем можно ли разделить массив пополам
        while (startIndex <= endIndex){


            //вычислить индекс середины
            middleIndex = startIndex + (endIndex - startIndex) / 2;

            //сравниваем на равенство значение в середине с искомым
            if (array[middleIndex]== searchValue){
                return  middleIndex;
            }

            // нало понять в какой части массива может быть искомое значение
            // отбросить ненужную половину массива т.е сместить индексы

            if (array[middleIndex] > searchValue){
                // мы должны отбросить правую часть

                endIndex = middleIndex -1;
            }else {
                //отбросываем левую часть
                startIndex = middleIndex + 1;
            }
        }
        return -1;
    }

    //найти элемент в массиве ро значению
    // линейный поиск. индекс элемента на выходе

    public static int linearSearch(int[] ints, int value){
        // перебираем все элементы и сравниваем с искомым значением.
        //если найдено совпадение возвращаем индекс

        // для того чтобы сказать/подтвердить что число отсутствует в массиве
        // нам надо совершить ints.length операций. Сложность этого алгоритма будет о(n)

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == value) return  i;

        }

        return -1;
    }
    //Сортировка

    public static void sortArray(int[] array) {
        //Запускаем цикл.Ищем мин элемент. Меняем местами с " самым левым"
        // Уменьшаем зону поиска (смещаем в право)

        for (int i = 0; i < array.length; i++) {
            //находим минимум в текущей части массива
            int minIndex = minIndexSearch(array, i);

            //нужно поменять местами значения самого левого и минимального элемента
            // есть индексы. Индекс самого левого значения

            int temp = array[i];
            array[i] = array[minIndex]; // одна операция- константная сложность от 0 до 1
            array[minIndex] = temp;
        }


    }

    public static int minIndexSearch(int[] array, int startIndex) {
        int min = array[startIndex];
        int minIndex = startIndex;

        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }


    // метод поиска минимального значения в массиве
    //будем возвращать индекс минимального элемента
    public static int minIndexSearch(int[] array) {
        int min = array[0];
        int minIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void printArr (int[]arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ((i < arr.length -1) ? ", ":"]\n"));

        }
    }
}
