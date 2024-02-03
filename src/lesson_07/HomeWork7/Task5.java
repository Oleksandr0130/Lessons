package lesson_07.HomeWork7;


import java.util.Scanner;
import java.util.SortedMap;

//Task 5 Программа просит пользователя слово "hello"
// Если пользователь вводит правильное слово - программа распечатывает на экран благодарность и завершает работу
// Если вводится не верное слово - программа просит ввести слово снова.
// До тех пор, пока не будет введено запрашиваемое слово
//
//*опционально - считать кол-во попыток, которые потребовались пользователю для введения правильного слова По окончанию - вывести число попыток на экран
public class Task5 {
    public static void main(String[] args) {
        //   do{
        //
        //    }while (Условие)

//        int count = 10;
//
//        while (count < 5 ){
//            System.out.println("Тело цикла While");
//            count++;
//        }
//
//        count = 4;
//
//        do {
//            // тело цикла
//            System.out.println("Тело цикла Do-While");
//            count++;
//        } while (count < 5);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово hello");

        String hello = scanner.nextLine();

        while (!hello.equalsIgnoreCase("hello")){ //цикл с предусловием. Т.е тело цикла вообще может не выполнится ( зависит от условия)

            System.out.println("Введите слово hello");
            hello = scanner.nextLine();
        }
        System.out.println("До свидания!");

        //Option_02
        String helloDo;
        do { // цикл с постусловием. Т.е тело ГАРАНТИРОВАНО выполнится один раз( Не зависит от условия)
            System.out.println("Введите слово hello (Do-While)");
            helloDo = scanner.nextLine();
        } while (!helloDo.equalsIgnoreCase("hello"));

        System.out.println("До свидания!");
    }
}
