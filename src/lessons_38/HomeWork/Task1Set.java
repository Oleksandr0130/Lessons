package lessons_38.HomeWork;


//Напишите метод,
//принимающий строку и возвращающий Список ее слов без повторений,
// отсортированный в порядке увеличения длин слов.
//Если строки имеют одинаковую длину - сортировать в естественном порядке

import java.util.*;

//Избавиться от знаков препинания (если получится)
//2. Разбить на слова
//3. Поместить в коллекцию, которая обеспечивает уникальность и сортировку
//4. Преобразовать в список и вернуть
public class Task1Set {
public static String removeP (String strings){
    return strings.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");
}
public static void printWords(String strings){
    String[] words = (removeP(strings).split(" "));
    List<String> wordsList = Arrays.asList(words);

    for (String word : words) {
        System.out.println(word);
    }
    System.out.println(wordsList);
}

public static Set<String> getUniqueWord(String strings){
    String[] words = (removeP(strings).split(" "));
    Set<String> uniqueWords = new TreeSet<>(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
    uniqueWords.addAll(Arrays.asList(words));
    return uniqueWords;
}


    public static void main(String[] args) {
        String strings = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(strings);
        System.out.println(removeP(strings));

        printWords(strings);

    Set<String> uniqueWords = getUniqueWord(strings);
        System.out.println(uniqueWords);
    }
}
