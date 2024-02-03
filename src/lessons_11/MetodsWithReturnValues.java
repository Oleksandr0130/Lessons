package lessons_11;

public class MetodsWithReturnValues {
    public static void main(String[] args) {
        int  x = 5;
        int y = 10;
        sumNumbers(x, y);

        int sum = sumNumbersWithReturn(x, y);
        System.out.println("sum" + sum);

        System.out.println(sumNumbersWithReturn(10, 45));

        int[] testArrey = {11, 55,34, 68,43};
        int findMe = 68;

        boolean isExist = isDigit(testArrey, findMe);
        System.out.println("is digit in Array? ->" + isExist);
    }

    // Написать метод который определяет присутствует ли число в массиве
    // тип возвращаемого значения Boolean
    // Если число есть - возвращаем true, если нет - false

    public static boolean isDigit(int[] numbers, int searchMe){
        // 1. Перебрать значения в массиве
        // Сравнить текущий элемент в искомом значении
        // Если равны - вернуть из метода True
        // А если ни одно из значений не равно , то вернуть false

        for (int i = 0; i < numbers.length; i++) {
            // 11, 55,34, 68,43 ||| ищем 100
            if (numbers[i] == searchMe) return true;

        }

        return false;
    }
    public static void sumNumbers (int i, int k) {
        int result = i + k;
        System.out.println(result);
    }

    public static int sumNumbersWithReturn(int i, int k) {
        int result = i + k;
        return result;
    }
}
