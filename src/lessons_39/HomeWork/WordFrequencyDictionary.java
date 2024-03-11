package lessons_39.HomeWork;


import java.util.*;

/*
Частотный словарь слов:
Напишите метод, который принимает строку текста и возвращает Map<String, Integer>,
где каждому слову соответствует количество его вхождений в текст.
 */
public class WordFrequencyDictionary {

    public static void main(String[] args) {

        String text = "Напишите метод, который который принимает строку текста и возвращает Map<String, Integer>";
        System.out.println(text);
        System.out.println(getLineOfText(text));
    }
    public static Map<String, Integer> getLineOfText(String text){

        Map<String, Integer> wordMap = new HashMap<>();

        String withoutSymbols = text.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");
        String[] words = withoutSymbols.split("\\s+");
        System.out.println(Arrays.toString(words));
        for (String word : words){
        wordMap.put(word, wordMap.getOrDefault(word, 0)+1);
        }
        return wordMap;
    }

}
