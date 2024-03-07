package lessons_37.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
  //  Напишите метод, который принимает на вход две реализации интерфейса List.
    // Метод должен возвращать список состоящий из элементов, которые присутствуют в обоих коллекциях.

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        List<Integer> list2 = new ArrayList<>();
        list2.add(7);
        list2.add(2);
        list2.add(8);
        list2.add(4);
        list2.add(9);
        list2.add(6);

        list1.retainAll(list2);
        System.out.println(list1);
    }
}
