package lessons_39.HomeWork;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
Напишите метод, возвращающий частотный словарь вхождения символов в строку
 */
public class Task2 {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v + "; "));
        System.out.println();
    }

    private static Map<Character, Integer> frequencyCharsDictionary(String text) {
        Map<Character, Integer> frequencyCharsMap = new TreeMap<>();
        char[] chars = text.toCharArray();
        for (char c: chars){
            frequencyCharsMap.put(c, frequencyCharsMap.getOrDefault(c, 0)+1);
        }
        return frequencyCharsMap;
    }

    private static Map<String, Integer> frequencyDictionary(String text) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        String withOutSymbols = text.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "") ;
            String[] words = withOutSymbols.split("\\s+");
            System.out.println(Arrays.toString(words));
            for (String word : words) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
            return frequencyMap;
        }
    }

