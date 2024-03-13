package lessons_40.HomeWork;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


/*
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.
Используйте несколько предикатов для фильтрации списка чисел,
 где числа должны быть четными, больше 10 и меньше 100
 */
public class Task1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(0, 1, 2, 25, -30, -30, -100, 3, 6, -7, 100, 150, 123));

        List<Integer> list1 = getList(list,integer -> integer < 100);
        System.out.println(list1);

        List<Integer> list2 = getList(list,integer -> integer > 10);
        System.out.println(list2);

        List<Integer> list3 = getList(list,integer -> integer % 2 == 0);
        System.out.println(list3);
    }

    public static List<Integer> getList(List<Integer>integers, Predicate<Integer>predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer val : integers) {
            if (predicate.test(val)) {
                result.add(val);
            }
        }
        return result;
    }
}