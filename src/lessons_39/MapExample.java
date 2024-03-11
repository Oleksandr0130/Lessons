package lessons_39;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        //добавить пару ключ-значения
        // put - Возвращает старое значение

        System.out.println(map.put(1, "Hello"));

        map.put(2, "Java");
        map.put(3, "World");
        String oldValue = map.put(1, "Python");
        System.out.println("Старое значение: " + oldValue);
        map.put(17,"Orange");

        System.out.println(map);

        String value = map.get(17);
        System.out.println("value: " + value);

        String value1 = map.get(17);
        String defaultValue = "Default";
        if (value1 == null) value1 = defaultValue;
        System.out.println(value1);

        System.out.println("===========================================");

        // v getOrDefault(Object key, v defaultValue)
        String valueWithCheckNull = map.getOrDefault(1, "NotNullDefault");
        System.out.println("valueWithCheckNull: " + valueWithCheckNull);

        System.out.println("===========================================");

        System.out.println(map.containsKey(100));
        System.out.println(map.containsValue("Java"));

        System.out.println("===========================================");

        map.isEmpty();

        System.out.println("===========================================");

        int size = map.size();
        System.out.println(size + " | " + map.isEmpty());

        System.out.println("===========================================");

        // void clear() - очищает карты

        System.out.println("===========================================");

        // V remove(Object key) = по ключу удаляет пару "ключ-значение " и Возвращает значение из удаленной пары
        System.out.println(map.remove(100));

        System.out.println("===========================================");

        // V remove(Object key, Object value) =  удаляет пару "ключ-значение " и Возвращает true в случае успешного удаленной пару ключ-значение
        System.out.println(map.remove(1, "Java"));
        System.out.println(map);

        System.out.println(map.remove(1, "Python"));
        System.out.println(map);

        System.out.println("===========================================");

        // put vs replace
        // replace(K key, V value)
        map.put(99, "Banana");
        System.out.println(map.replace(2, "Value"));
        System.out.println(map);
        System.out.println(map.replace(100, "New value"));

        // boolean replace(K key, V oldValue, V newValue)
        System.out.println(map.replace(99, "Banana", "Kiwi"));
        System.out.println(map.replace(99, "Banan", "avokado"));
        System.out.println(map);

        System.out.println("===========================================");

        // Set<K> keySet() - возвращает Set всех ключей словаря
        Set<Integer> keySet = map.keySet();
        System.out.println("keySet: " + keySet);
        for (Integer key: map.keySet()){
            System.out.println("Current value: " + map.get(key));

        }

        System.out.println("===========================================");

            // Collection<V> map.value()- возвращает коллекцию всех значений карты
        Collection<String> collection = map.values();
        System.out.println(collection);

        // Map.Entry<K, V>
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();

        for (Map.Entry<Integer,String> entry : map.entrySet()){

            System.out.println("entry.getKey(): " + entry.getKey());
            if (entry.getValue().equals("Value")){
                entry.setValue("Banana");
            }
            System.out.println("entry.getValue(): " + entry.getValue());
        System.out.println("===========================================");

        }
        System.out.println(map);

        System.out.println("\n===========================================\n");

        map.forEach((key, val) -> System.out.println("Key: " + key + " | Value: " + val));

        System.out.println("\n===========================================\n");

        Map<Integer,String> newMap = new LinkedHashMap<>();
        newMap.put(77, "Kotlin");
        newMap.put(87, "JS");
        System.out.println("newMap: " + newMap);

        map.put(87,"DuplicatedValue");
        System.out.println("map: " + map);

        newMap.putAll(map);
        System.out.println(newMap);


    }
}
