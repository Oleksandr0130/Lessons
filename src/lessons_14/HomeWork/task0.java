package lessons_14.HomeWork;


// Написать метод переводящие все маленькие буквы латинского алфавита в строке в верхний регистр.
public class task0 {
    public static void main(String[] args) {

        String inputString = "kfjdghlsdkjbns" ;

        String result = converter(inputString);

        System.out.println(result);

    }

    public static String converter(String input) {
        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];

            if (currentChar >= 'a' && currentChar <= 'z') {

                charArray[i] -= 32;
            }
        }
        return new String(charArray);
    }
}
