package lessons_21;

public class StringBuilderExampl {
    public static void main(String[] args) {
        // StringBuilder- класс для работы с последовательностью символов
        // в отличии от String обьекты SB можно изменять после их создания
        // это делает его особо удобным и полезным в ситуациях когда нам требуеться
        // много операций по изменению строки( конкатенация, вставка вырезание в / из середины строки
        // существенно уменьшает нагрузку на память и повышает производительность)

        StringBuilder sb = new StringBuilder();

                // append - н добовляет строковое представление любого типа данных (строка, символ, число) к текущему объекту

        sb.append("Hello").append(", ").append("world!");

        // toString - возвращающий строку - представление

        String result = sb.toString();
        System.out.println(result);
    //insert - вставляет строку в указанную позицию текущего sb
    sb.insert(3, "JAVA");
        System.out.println(sb.toString());

        // delete, deleteCharAt - удаление диапазона по индексам, удаление 1 символа по индексу
        sb.delete(3, 6); // первый включительно, второй не включительно. Удалит 3,4,5 символ
        System.out.println(sb.toString());
        sb.deleteCharAt(3);
        System.out.println(sb.toString());

        //reverse() переворачивает строку объекта,делая строку зеркальной
        sb.reverse();
        System.out.println(sb.toString());

        // length - возвращает текущее кол-во символов в обьекте
        System.out.println(sb.length());

        // setLength установить новую длину

        sb.setLength(11);
        System.out.println(sb.toString());

        //брат близнец но работает медленнее т.к потокобезопасен
        StringBuffer stringBuffer = new StringBuffer();
    }


}
