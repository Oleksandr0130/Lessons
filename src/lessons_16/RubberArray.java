package lessons_16;

/*
1. Динамическое изменение размера массива
2. Добавлять в массив элементы
3. Добавлять в массив сразу несколько элементов
4. Создать вывод в консоль значений массива
 */

public class RubberArray {

    int[] array;

    int cursor; // присвоенно значение по умолчанию 0
    public  RubberArray(){
        array = new int[10];

    }

    void  add (int number){
        //Добавлять значение в наш массив

        //Проверка. Есть ли место в нашем внутреннем массиве

        if (cursor > array.length * 0.9){
            expandArray(); // метод расширяющий наш массив
        }
        array[cursor] = number;
        cursor++;
    }

    void  add( int... ints){
        // ints - можем обращатся с ним точно также как с ссылкой на массив

        for (int i = 0; i < ints.length; i++) {
            add(ints[i]);
        }
    }

    void expandArray(){
        System.out.println("Расширяем массив!!! ========================= ");
        //1.создать новый массив большого размера
        //2.Переписать значение из старого массива в новый
        //3.перебросить ссылку
        int[] newArray = new int[array.length * 2]; //  создать новый массив в 2 раза больше старого

        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i]; // переписываем значение из старого массива в новый
        }

        array = newArray; // перебрасываем ссылку. Переменная array Теперь хранит ссылку на "новый  " массив
        System.out.println(" Завершаем расширение массива!!!! ================ ");
    }

    public String toString(){
        if (cursor == 0)return "[]";
        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + ((i < cursor - 1) ? ", ": "]");
        }
        return result;
    }
}
