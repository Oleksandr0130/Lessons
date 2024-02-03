package lesson_07.HomeWork7;

import java.util.Random;


//Реализовать с использованием switch Ваш ребенок принес оценку за контрольную работу по математике.
// В школе 12 бальная система. Запишите в переменную случайное число от 0 до 12.
// Вы разрешаете ребенку смотреть телевизор не более 60 минут в день.
// (Оставшееся время не может быть больше 1 часа) На сегодня у него осталось 45 минут. (записать в переменную)
//
//Если оценка от 10 до 12 баллов -> Скажите ему, как вы рады и добавьте к оставшемуся на сегодня времени 1 час
// от 7 до 9 -> Слова похвалы на экран + ко времени 45 минут
// от 4 до 6 -> Нейтральные слова + ко времени 15 минут
// 3 -> Огорчитесь. Минус 30 минут ко времени оценка меньше -> Трагедия. Сегодня ТВ смотреть запрещено
//
//Выведите на экран оставшееся на сегодня время для просмотра ТВ
//
//P.S. Реализовать с использованием switch
public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int lastTime = 45;


        int bal = random.nextInt(12)+1;

        System.out.println("Оценка:  " + bal);

        switch (bal){
            case 10:
            case 11:
            case 12:
                System.out.println("Отлично! ");
                lastTime +=60;
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Отличная работа! ");
                lastTime +=45;
                  break;
            case 6:
            case 5:
            case 4:
                System.out.println("Хороший результат");
                lastTime +=15;
                break;
            case 3:
                System.out.println("Ужас");
                lastTime -=30;
                break;
            case 2:
            case 1:
                System.out.println("Трагедия. Сегодня ТВ смотреть запрещено");
                lastTime = 0;
                break;
            default:
                System.out.println("Оценка не определена");
        }
        if (lastTime > 60){
            lastTime = 60;
        }
        System.out.println("Оставшееся время для просмотра ТВ на сегодня: " + lastTime + " минут.");

    }
}
