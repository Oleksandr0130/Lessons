package lesson_04.HomeWork4;

public class Task1 {
    public static void main(String[] args) {
        String name = "Aleksandr";
        int len = name.length();
        char c1 = name.charAt(0);
        char x = name.charAt(len - 1);
            char letter = c1;
            char lastletter = x;
        int decimalCode2 =  lastletter;
        System.out.println("Imia sostoit i3: " + len + " Bykw" );
        System.out.println("Perwaja bykwa: " + c1);
        System.out.println("Posledniaja bykwa: " + x);
        System.out.println("Desiaticznyj kod perwoj bykwy: " + (int) letter + " \n" + "Desiaticznyj kod poslednej bykwy: " + decimalCode2);
    }
}
