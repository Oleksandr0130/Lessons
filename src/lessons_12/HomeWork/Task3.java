package lessons_12.HomeWork;


//Написать свой метод copyOfArray, дублирующий функционал метода Arrays.copyOf()
//
//на вход принимает массив целых чисел и число - длину нового массива.
// Метод должен создать и распечатать массив заданной в параметрах длинны.
// В начало массива должны быть скопированы элементы из входящего массива:
//
//{0, 1, 2, 3, 4 , 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
public class Task3 {
    public static void main(String[] args) {
        int[] originalArray = {0, 1, 2, 3, 4, 5, 6};
        int newLength = 3;

        int[] newArray = copyOfArray(originalArray, newLength);

        // Вывод на печать нового массива
        System.out.print("{");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
            if (i < newArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static int[] copyOfArray(int[] original, int newLength) {
        // Создание нового массива заданной длины
        int[] newArray = new int[newLength];

        // Копирование элементов из оригинального массива в новый массив
        for (int i = 0; i < newLength && i < original.length; i++) {
            newArray[i] = original[i];
        }

        return newArray;
    }
}
