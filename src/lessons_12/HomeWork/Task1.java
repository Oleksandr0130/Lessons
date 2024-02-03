package lessons_12.HomeWork;


//Написать метод, принимающий на вход массив строк.
// Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.


public class Task1 {
    public static void main(String[] args) {
        String[] inputArray = {"Hello", "Hello World", "MY name is Oleksandr"};

        String[] resultArray = findMinMaxString(inputArray);

        System.out.println("Минимальная строка: " + resultArray[0]);
        System.out.println("Мaксимальная строка: " + resultArray[1]);


    }

    public static String[] findMinMaxString(String[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new String[]{};
        }
        String minStr = inputArray[0];
        String maxStr = inputArray[1];

        for (String str : inputArray) {
            if (str.length() < minStr.length()) {
                minStr = str;
            }
            if (str.length() > maxStr.length()) {
                maxStr = str;
            }

        }
        return new String[]{minStr, maxStr};
    }


}
