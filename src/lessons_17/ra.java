package lessons_17;



/*
1. Динамическое изменение размера массива
2. Добавлять в массив элементы
3. Добавлять в массив сразу несколько элементов
4. Создать вывод в консоль значений массива
 */

public class ra {

    int[] array;

    int cursor; // присвоенно значение по умолчанию 0

    public ra() {
        array = new int[10];

    }

    public ra(int[] ints) {
        array = new int[ints.length * 2];

        for (int i = 0; i < ints.length; i++) {
            add(ints[i]);
        }
    }

    void add(int number) {
        //Добавлять значение в наш массив

        //Проверка. Есть ли место в нашем внутреннем массиве

        if (cursor > array.length * 0.9) {
            expandArray(); // метод расширяющий наш массив
        }
        array[cursor] = number;
        cursor++;
    }

    void add(int... ints) {
        // ints - можем обращатся с ним точно также как с ссылкой на массив

        for (int i = 0; i < ints.length; i++) {
            add(ints[i]);
        }
    }

    void expandArray() {
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

    public String toString() {
        if (cursor == 0) return "[]";
        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + ((i < cursor - 1) ? ", " : "]");
        }
        return result;
    }


//    Task 0
//    Повторить код, написанный на уроке
//
//    В резиновом массиве должны быть реализованы методы:
//
//    Добавление элемента
//    Вывести все значения в массиве в консоль
//    Поиск элемента по значению
//    Возвращение значения по индексу
//    Текущее количество элементов в массиве
//    Удаление элемента по индексу
//    Добавление нескольких элементов (в качестве аргументов передает последовательность значений)
//    Конструктор, принимающий в себя обычный массив и создающий RubberArray с такими де значениями
//    Удаление элемента по значению
//    Замена значения по индексу (есть индекс и новое значение)
//    Замена значения по значению (есть старое и новое значение)


    public int size() {
        return cursor;
    }

    public int get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        } else {
            return Integer.MIN_VALUE;
        }

    }


    //Поиск элемента по значению (у нас есть значение, надо узнать есть ли такое значение)
    public int indexOf (int value) {
        //так как int, в качестве значения, а не индекса - проверять не нужно на null
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) return i;
        }
return -1;
    }

    //    Удаление элемента по индексу


    //показываем курсор
    public void showCursor() {
        System.out.println(array[cursor -1]);
        System.out.println(array[cursor]);
    }

    public int remove (int index) {
        // 1.Проверка
        if (index < 0 && index >= cursor) {
            //такого индекса в массиве нет
            return Integer.MIN_VALUE;
        }

        int value = array[index];

        for (int i = index; i < cursor - 1; i++) {

                array[i] = array[i + 1];

        }
        cursor--;
        return value;
    }

    //    Удаление элемента по значению
    public boolean removeByValue(int value){
        // Понять есть ли такой элемент в массиве
        // если нет вернуть false и закончить работу методы
        //если есть получить индекс
        // переиспользовать метод удаляющий по индексу

        int index = indexOf(value);

        if (index == -1) return  false;

        remove(index);
        return true;
    }
}




