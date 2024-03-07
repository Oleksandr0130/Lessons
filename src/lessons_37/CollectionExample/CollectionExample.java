package lessons_37.CollectionExample;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        //Методы интерфейса Collection
        // Все эти методы гарантированно есть во всех коллекциях (кроме Map)

        // boolean add(E e) -> добавляет элемент в коллекцию
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(2, 100);
        System.out.println(list);

        // int size() -> Колличество Элементов  в коллекции
        System.out.println("list.size() ->" + list.size());

        // boolean remove(Object obj) - удаляет элемент из коллекции по значению
        list.remove(Integer.valueOf(100));
        System.out.println(list);

        // T remove(int index) - удаляет элемент из коллекции по индексу
        list.remove(Integer.valueOf(100));
        System.out.println("list.remove: " + list.remove(0));
        System.out.println(list);

        // boolean isEmpty() - возвращает true, если коллекция пустая
        System.out.println("list.isEmpty: " + list.isEmpty());

        // boolean contains(Object obj) - возвращает true, если коллекция содержит такой элемент
        System.out.println("list.contains(100): " + list.contains(4));

        System.out.println("\n=========================================\n");
        // addAll(Collection<? extend T> c)

        List<Integer> listA = new ArrayList<>();
        listA.add(5);
        listA.add(6);
        listA.add(7);
        listA.add(8);

        System.out.println(list);
        System.out.println(listA);

        list.addAll(listA);

        System.out.println(list);

        System.out.println("\n=========================================\n");

        // addAll(int index, Collection<? extend T> c) - добавляет все элементы из указанной коллекции в  коллекцию у которой был вызван метод.
        list.addAll(listA);

        System.out.println(list);
        list.addAll(1, listA);

        System.out.println(list);

        // boolean containsAll(collection c) - возвращает true, если коллекция содержит все элементы из указанной коллекции
        List<Integer> listB = new ArrayList<>();
        listB.add(8);
        listB.add(7);
        listB.add(2);
        System.out.println("listB: " + listB);

        System.out.println("list.containsAll(listB): " + list.containsAll(listB));


        System.out.println("\n=========================================\n");

        // boolean removeAll(collection c) -> удаляет все элементы из текущей коллекции , которые содержатся в указанной коллекции
        System.out.println("list: " + list);
        System.out.println("listB: " + listB);
        System.out.println("list.removeAll(listB): " + list.removeAll(listB));
        System.out.println("list: " + list);


        System.out.println("\n=========================================\n");
        System.out.println(list);
        System.out.println(listA);

        //boolean retainAll(collection c) -> оставляет в текущей коллекции только те элементы которые содержатся в указанной коллекции
        System.out.println("list.retainAll(listA) -> " + list.retainAll(listA));
        System.out.println(list);

        System.out.println("\n=========================================\n");

        // listA.clear() - удаляет все элементы из коллекции
        listA.clear();
        System.out.println(listA);
        System.out.println(listA.size());
        System.out.println(listA.isEmpty());

        System.out.println("\n=========================================\n");

        // Object[] toArray()
        // T[] toArray(T[] array)
        Object[] objects = list.toArray();
        System.out.println(Arrays.toString(objects));

        Integer[] integers = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integers));

        // removeIf(Predicate<T> pr) - позваляет удалить все элементы из коллекции , удовлетворяющие условию предиката
        list.removeIf(i -> i % 2 == 0);
        System.out.println(list);
    }
}
