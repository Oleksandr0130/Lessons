package lessons_40;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        // Stream API

        // Stream

        // Промежуточные методы
        /*
        filter(Predicate<T>) - отфильтровывает элементы, соответствующие данному предикату
        sorted() - сортирует элементы
        map(Function <T,R> mapper) - преобразует элементы потока с импользованием маппера
        peek(Consumer <T> action) - выполняет действия для каждого элемента потока

        Терминальные методы
        .collect(Collectors.toList());// преобразует элементы потока в список


         */

//        task1();

//        task2();
//task3();

//        task4();
        task5();
    }// main

    private static void task5() {
        // получить список имен котов чей вес больше 4

        List<Cat> cats = getListCats();

        List<String> catNames = cats
                .stream()
                .filter(cat -> cat.getWeight() > 4)
                .map(cat -> cat.getName())
                .collect(Collectors.toList());

        System.out.println(catNames);
    }

    private static void task4() {
        // получить список имен котов
        List<Cat> cats = getListCats();

        Stream<String>stringsStream = cats
                .stream()
                .map(cat -> cat.getName());

        List<String> getNames = cats.stream()
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println(getNames);
    }

    private static void task3() {
        List<Cat> cats = getListCats();
        // фильтрация по длинне имени
        // список котов чье имя длиннее 4 символов

        Stream<Cat> catsStream = cats
                .stream()
                .filter(cat -> cat.getName().length() > 4);

        List<Cat> catList = catsStream.collect(Collectors.toList());

        System.out.println("End task3 method");
    }

    private static void task2() {
        List<Cat> cats = getListCats();
        // список кошек, чей вес больше 4 кг

        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);

        List<Cat> fatCats = catStream.collect(Collectors.toList());
        System.out.println(fatCats);
    }

    private static List<Cat> getListCats() {
        return List.of(
                new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "white"),
                new Cat("Tiger", 3, "grey"),
                new Cat("Panda", 4, "black")
        );
    }

    private static void task1() {
        List<Integer> integers = List.of(-1, 12, 0, 4, 1, -15, 24, 0);
        // список, положительных чисел
        // список должен быть отсортирован в порядке возрвстания

        List<Integer> result = new ArrayList<>();
        for (Integer intg : integers) {
            if (intg > 0) result.add(intg);
        }
        Collections.sort(result);
        System.out.println(result);

        List<Integer> resultStream = integers.stream()
//                .filter(new Predicate<Integer>() {
//                    @Override
//                    public boolean test(Integer integer) {
//                        return integer>0;
//                    }
//                })

                .filter(integer -> integer <= 0)
                .sorted()
                .collect(Collectors.toList());// преобразует элементы потока в список
        System.out.println(resultStream);
    }


}
