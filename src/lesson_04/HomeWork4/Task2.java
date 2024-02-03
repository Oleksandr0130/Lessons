package lesson_04.HomeWork4;

public class Task2 {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "is";
        String s3 = "a";
        String s4 = "powerful";
        String s5 = "language";

        String result_concat = s1 + " " + s2 + " " + s3 + " " + s4 + " " + s5;
        String result_join = String.join(" ",s1, s2, s3, s4, s5);
        result_concat = result_concat.replace("powerful", "super");
        boolean agecontains = result_concat.contains("age");

        System.out.println("Konkatinacja: " + result_concat);
        System.out.println();
        System.out.println("Dlinna stroki: " + result_concat.length());
        System.out.println("========================");
        System.out.println("join: " + result_join);
        System.out.println("========================");
        System.out.println("Dlinna stroki: " + result_concat.length());
        System.out.println("========================");
        System.out.println("Wywod posle zameny: " + result_concat);
        System.out.println("========================");
        System.out.println("Podstroka age: " + agecontains);
    }
}
