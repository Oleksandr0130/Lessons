package lesson_04.HomeWork4;

public class Task3 {
    public static void main(String[] args) {
        String var1 = "String";
        String var2 = "code";
        String var3 = "Practice";

        int middlevar1 = var1.length() / 2;
        int middlevar2 = var2.length() / 2;
        int middlevar3 = var3.length() /2;

        String substring = var1.substring(middlevar1 -1, middlevar1 + 1);
        String substring2 = var2.substring(middlevar2 -1, middlevar2 + 1);
        String substring3 = var3.substring(middlevar3 -1, middlevar3 + 1);
        System.out.println("substring: " + substring);
        System.out.println("substring2: " + substring2);
        System.out.println("substring3: " + substring3);
    }
}
