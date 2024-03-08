package lessons_38.HomeWork;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Создайте два множества строк (Set<String>), каждое из которых будет заполнено различными словами.
// Некоторые слова должны повторяться в обоих множествах.
//
//Реализуйте метод union(Set<String> set1, Set<String> set2),
// который возвращает множество, содержащее все уникальные элементы из обоих множеств (объединение множеств).
//
//Реализуйте метод intersection(Set<String> set1, Set<String> set2),
// который возвращает множество, содержащее только элементы, которые присутствуют в обоих исходных множествах (пересечение множеств).
//
//Реализуйте метод difference(Set<String> set1, Set<String> set2),
// который возвращает множество элементов, которые есть в первом множестве, но отсутствуют во втором (разность множеств).
//
//Результат каждого метода необходимо выводить в консоль для наглядности.
//Следует обеспечить, чтобы в исходных множествах были как уникальные, так и общие элементы для наглядности результатов операций.
public class Task2Set {

    public static Set<String> union (Set<String> set1, Set<String> set2){
        Set<String> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static Set<String> intersection(Set<String> set1, Set<String> set2){
        Set<String> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static Set<String> difference(Set<String> set1, Set<String> set2){
        Set<String> result = new HashSet<>(set2);
        result.removeAll(set1);
        return result;
    }
    public static void main(String[] args) {
    Set<String> set1 = new HashSet<>(List.of("Hello", "world", "we", "learning", "JAVA"));
    Set<String> set2 = new HashSet<>(List.of("Hallo", "Oleksandr", "is", "learning", "JAVA"));


        System.out.println("\n===== Создайте два множества строк (Set<String> =====");
        System.out.println(set1);
        System.out.println(set2);

        System.out.println("\n===== метод union =====");
        System.out.println(union(set1,set2));
        System.out.println(set2);

        System.out.println("\n===== метод intersection =====");
        System.out.println(intersection(set1,set2));
        System.out.println(set2);

        System.out.println("\n===== метод difference =====");
        System.out.println(difference(set1,set2));
        System.out.println(set1);
    }
}
