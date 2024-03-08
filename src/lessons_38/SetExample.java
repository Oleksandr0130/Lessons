package lessons_38;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        /*Контракт hashCode() и equals()
        1. Если два объекта равны по методу equals(Object), то их хеш-коды тоже должны быть равны.
        2. Если хеш-коды двух объектов различны, то объекты точно не равны (обратное не всегда верно — разные объекты могут иметь одинаковый хеш-код).
        3. Вызов метода hashCode() должен возвращать одинаковое значение при многократных вызовах на неизменном объекте.
        */

        Set<Integer> integersConstr = new HashSet<>(); // 16 корзин , loadfactor 0.75
        Set<Integer> integersConstr1 = new HashSet<>(28); // 32 корзины () , loadfactor 0.75
        Set<Integer> integersConstr2 = new HashSet<>(28, 0.80f); // 32 корзины () , loadfactor 0.75
        Set<Integer> integersConstr3 = new HashSet<>(integersConstr); // Принимает коллекцию. И создает set из уникальных элементов этой коллекции


        List<Integer> startValues = List.of(15, 1, 2, 3, 3, 4, 5, 6, 8, 8, 15, 7, 15, 7, 0, 16, 32);
        Set<Integer> integers = new HashSet<>(startValues);
        System.out.println("integers -> " + integers);

//        Set<Integer> integersSet = new HashSet<>(List.of(15, 1, 2, 3, 3, 4, 5, 6, 8, 8, 15, 7, 15, 7, 0, 16, 32));
//        System.out.println(integersSet);
//
//        Set<String> strings = new HashSet<>(List.of("STRING", "Java", "Python", "Hello", "hello","STRING"));
//        System.out.println(strings);

        Set<Integer> linkedSet = new LinkedHashSet<>(startValues);
        System.out.println(linkedSet);

        //add(E e): Добавляет указанный элемент в Set (если он ещё не присутствует в коллекции).
        System.out.println(integers.add(100)); // true - добавляет так как данного значения небыло в сетте
        System.out.println(integers.add(100)); // false - не добавит этот элемент второй раз поскольку он уже существует

        //remove(Object o): Удаляет указанный элемент из Set, если он присутствует.
        System.out.println(integers.remove(100));

        //contains(Object o): Возвращает true, если Set содержит указанный элемент.
        System.out.println(integers.contains(33));

        //size(): Возвращает количество элементов в Set.

        //isEmpty(): Проверяет, пуст ли Set.

        //iterator(): Возвращает итератор для элементов в Set.
        Iterator<Integer> iterator = integers.iterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());

        //clear(): Удаляет все элементы из Set.


        Set<Integer> treeSet0 = new TreeSet<>(); // пустое, упорядоченное, сортируемое в естественном порядке множеством
        Set<Integer> treeSet1 = new TreeSet<>(integers);
        Set<Integer> treeSet2 = new TreeSet<>(Comparator.reverseOrder());
//        Set<Integer>treeSet3 = new TreeSet<>(TreeSet<T>); создает новое множество, содержающее те же элементы в том же порядке

        Set<Integer> treeSet = new TreeSet<>(startValues);
        System.out.println(treeSet);

        Set<Integer> sortedReversed = new TreeSet<>((i1, i2) -> i2.compareTo(i1));
        sortedReversed.addAll(startValues);
        System.out.println(sortedReversed);

        System.out.println("=======Task1========");//Task1
        //Task1
        // Написать метод, принимает список и возвращает список, состоящий из уникальных элементов

        System.out.println("startValues      -> " + startValues);
        List<Integer> uniqueList = getUniqueList(startValues);
        System.out.println("uniqueList       -> " + uniqueList);


        //Task2
        // Написать метод, принимает список и возвращает список, состоящий из уникальных элементов, отсортированных в порядке убывания

        System.out.println("UniqueSortedList -> " + getUniqueSortedList(startValues));

    }

    public static <T> List<T> getUniqueList(List<T> list) {
        // получу set, состоящий из уникальных элементов списка
        Set<T> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }

    public static <T> List<T> getUniqueSortedList(List<T> list) {
        // получу set, состоящий из уникальных элементов списка
        Set<T> set = (Set<T>) new TreeSet<>(Comparator.reverseOrder());
        set.addAll(list);
        return new ArrayList<>(set);
    }
}


