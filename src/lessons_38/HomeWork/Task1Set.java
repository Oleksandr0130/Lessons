package lessons_38.HomeWork;


import java.util.*;

//Напишите метод,
// принимающий строку и возвращающий Список ее слов без повторений,
// отсортированный в порядке увеличения длин слов.
// Если строки имеют одинаковую длину - сортировать в естественном порядке
public class Task1Set {
    public static List<String> getUniqueSortedWords(String string){
        List<String>words = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();
        for (char c : string.toCharArray()){
            if (Character.isLetter(c)){
                currentWord.append(c);
            } else {
                if (currentWord.length()> 0){
                    words.add(currentWord.toString());
                    currentWord.setLength(0);
                }
            }
        }
        if (currentWord.length()> 0){
            words.add(currentWord.toString());
        }

        Set<String> uniqueWordsSet = new HashSet<>(words);
        List<String> uniqueSortedWords = new ArrayList<>(uniqueWordsSet);
        uniqueSortedWords.sort(Comparator.comparing(String::length)
                .thenComparing(Comparator.naturalOrder()));
return uniqueSortedWords;
    }

    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(getUniqueSortedWords(testString));
    }
}
