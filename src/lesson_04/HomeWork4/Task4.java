package lesson_04.HomeWork4;

public class Task4 {
    public static void main(String[] args) {
        String var1 = "string";
        String var2 = "code";
        String var3 = "Practice";

        int middle = var1.length()/2;
        String slowo1 = var1.substring(middle - 1, middle + 1);
        System.out.println(slowo1);

        int middle2 = var2.length()/2;
        String slowo2 = var2.substring(middle2 - 1, middle2 + 1);
        System.out.println(slowo2);

        int middle3 = var3.length()/2;
        String slowo3 = var3.substring(middle3 - 1, middle3 + 1);
        System.out.println(slowo3);
    }
}
