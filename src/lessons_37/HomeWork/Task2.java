package lessons_37.HomeWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task2 {


    //    Создайте два списка. Один на реализации ArrayList, второй на LinkedList.
//
//    Заполните их 5_000 одинаковыми случайными значениями от 0 до 1_000.
//
//    Создайте 4 метода, принимающий реализацию интерфейса List.
//
//    В первом методе - получение всех значений элементов списка по его индексу
//    Второй метод - вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
//    Третий метод - удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции)
//    Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)
//    Все методы должны возвращать время, затраченное на выполнение метода в миллисекундах.
//
//    Сравните для каждого из списка время выполнения каждого метода.
//
//    И сравните время последовательного выполнения всех методов для каждой реализации List-а.
    public static void main(String[] args) {
//    Создайте два списка. Один на реализации ArrayList, второй на LinkedList.
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new LinkedList<>();


//        Заполните их 5_000 одинаковыми случайными значениями от 0 до 1_000.
        Random random = new Random();
        for (int i = 0; i < 5000; i++) {
            list.add(random.nextInt(1000) + 1);
            list1.add(random.nextInt(1000) + 1);
        }

        System.out.println("\n======================================================\n");

        compareMethods(list, "ArrayList");

        System.out.println("\n======================================================\n");

        compareMethods(list1, "LinkedList");

        System.out.println("\n======================================================\n");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list1);
        System.out.println(list1.size());





        System.out.println("=== получение всех значений элементов списка по его индексу ===");
        getListByIndex(list);
        getListByIndex(list1);



        System.out.println("==== вставка 2_000 новых значений по случайному индексу ====");
        addValue(list);
        addValue(list1);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list1);
        System.out.println(list1.size());


        System.out.println("==== удалить 1_000 элементов по случайному индексу ====");
        removeValueByIndex(list);
        System.out.println(list);
        System.out.println(list.size());


        System.out.println("==== Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000) ====");
        retainAllValueByValue(list);
        System.out.println(list);
        System.out.println(list.size());
    }



    //    Создайте 4 метода, принимающий реализацию интерфейса List.

//    В первом методе - получение всех значений элементов списка по его индексу
    public static long getListByIndex (List<Integer> list){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {

        System.out.print(list.get(i) + ", ");
        }
        System.out.println();
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
//    Второй метод - вставка 2_000 новых значений по случайному индексу
//    (диапазон индексов от 0 до размера списка)
    public static long addValue(List<Integer> list){
            Random random = new Random();
            int listSize = list.size();
            long startTime = System.currentTimeMillis();
        for (int i = 0; i < 2000; i++) {

            int randomValue = random.nextInt(listSize + 1);
            list.add(randomValue);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
//    Третий метод - удалить 1_000 элементов по случайному индексу.
//    (диапазон индексов от 0 до размера коллекции)
    public static long removeValueByIndex(List<Integer> list){
        Random random = new Random();
        int listSize = list.size();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            int randomIndex = random.nextInt(listSize);
            list.remove(randomIndex);
            listSize--;

        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

//    Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)
    public static long retainAllValueByValue(List<Integer>list){
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.remove(Integer.valueOf(random.nextInt(10000 + 1)));
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }



    public static long compareMethods(List<Integer> list, String listType) {
        System.out.println("=== Сравнение времени выполнения методов для " + listType + " ===");

        long time = getListByIndex(list);
        System.out.println("Метод getListByIndex занял " + time + " мс");

        time = addValue(list);
        System.out.println("Метод addValue занял " + time + " мс");

        time = removeValueByIndex(list);
        System.out.println("Метод removeValueByIndex занял " + time + " мс");

        time = retainAllValueByValue(list);
        System.out.println("Метод retainAllValueByValue занял " + time + " мс");

        System.out.println("=== Последовательное выполнение всех методов для " + listType + " ===");

        long startTime = System.currentTimeMillis();

        getListByIndex(list);
        addValue(list);
        removeValueByIndex(list);
        retainAllValueByValue(list);

        long endTime = System.currentTimeMillis();
        long totalTime = (endTime - startTime);
        System.out.println("Все методы заняли в сумме " + totalTime + " мс");

        return totalTime;


    }

}


