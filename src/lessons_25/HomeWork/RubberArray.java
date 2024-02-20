package lessons_25.HomeWork;

import java.util.Arrays;

public class RubberArray<T> implements MyList <T>{

    T[] array;
    int cursor; // присвоенно значение по умолчанию 0
    @Override
    public void add(T value) {
        if (cursor > array.length * 0.9) {
            expandArray();
        }
        array[cursor] = value;
        cursor++;
    }

    public RubberArray() {
        array = (T[]) new Object[10];
    }

    void expandArray(){
        System.out.println("Расширяем массив!!! ========================= ");
        //1.создать новый массив большого размера
        //2.Переписать значение из старого массива в новый
        //3.перебросить ссылку
        T [] newArray =  (T[]) new Object[array.length * 2]; //  создать новый массив в 2 раза больше старого

        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i]; // переписываем значение из старого массива в новый
        }

        array = newArray; // перебрасываем ссылку. Переменная array Теперь хранит ссылку на "новый  " массив
        System.out.println(" Завершаем расширение массива!!!! ================ ");
    }

    @Override
    public String toString() {
        return "RubberArray{" +
                "array=" + Arrays.toString(array) +
                ", cursor=" + cursor +
                '}';
    }
}
