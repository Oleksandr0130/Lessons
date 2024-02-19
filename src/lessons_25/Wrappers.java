package lessons_25;

public class Wrappers {

    //Byte - обертка для примитива byte
    // Short - short
    //  Integer - int
    // Long - long
    // Float - float
    // Double - double
    // Character - char
    // Boolean - boolean
    public static void main(String[] args) {
        Integer integer;
        int maxValue = Integer.MAX_VALUE;
        System.out.println("max " + maxValue);
        System.out.println("min " + Integer.MAX_VALUE);

        integer = null; // поддержка null

        // Автоматическое приведение типов
        // Авто-упоковка и авто-распаковка

        Integer integer1 = 5; // автоупаковка примитива int в ссылочный тип Integer


        Integer wrappedInt = 5; // автораспаковка типа Integer приобразовало в int
        System.out.println(wrappedInt);
        int primitiveInt = wrappedInt;

        // Сравнивание объектов. == сравнивание по ссылке
        // -128..127 - сравнение по ссылкам может работать не так как мы ожидаем

        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b); //true

        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d); //false
        System.out.println(c.equals(d));// true

//        Integer g = new Integer(127);
//        Integer h = new Integer(127);
//        System.out.println(g == h);

        //Схожие методы для всех оберточных типов
        //1. valueOf(). Преобразует явным образом примитив или строку в соответствующю обертку
        Integer e = Integer.valueOf(127);
        Integer f = Integer.valueOf(127);
        System.out.println("valueOf ==: " + (e == f));

        Integer intStr = Integer.valueOf(123);
        System.out.println(intStr + 100);

        // 2. parseXXX() - преобразует строку в соответствкющий примитив,
        System.out.println(Integer.parseInt("456") + 100);
        System.out.println(Double.parseDouble("344.56") + 2.0);

        // toString - возвращает строковое представление числа

        System.out.println(intStr.toString() + ", Hello");

        // equals - сравнивает два объекта по значению

        // compareTo() - Сравнивает текущий объект с другим объектом
        System.out.println(e.compareTo(f));// 127 vs 127 -> 0
        System.out.println(e.compareTo(d));// 127 vs 128 -> отрицательное значение

        // xxxValue() - возвращает объект как соответствующий примитив

        Double d1 = Double.valueOf(125.67); // явная / принудительная запаковал
        double dPrimitive = d1.valueOf(125.67); // явная / принудительная распаковка

        // ========================

        // все числовые обертки над примитивами наследуются от обстрактного класса Number

        Number number = Integer.valueOf(125);

        /* Методы для приведения любого числового оберточного типа к примитиву
        byteValue()
        shortValue()
        intValue()
        longValue()
        floatValue()
        doubleValue()
         */

        Integer integer2 = 31844;
        Double dbVal = 345.78;


        System.out.println(integer2.doubleValue());
        short sh = integer2.shortValue();

        int intFromDouble = dbVal.intValue();
        System.out.println(intFromDouble);

        System.out.println(0.1 + 0.2);

        Double s1 = 0.1;
        Double s2 = 0.2;
        System.out.println(s1 + s2);

    }
}
