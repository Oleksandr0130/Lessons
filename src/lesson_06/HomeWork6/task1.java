package lesson_06.HomeWork6;


//Запишите в 4 переменные случайные числа от 0 до 100
//Выведите все 4 на экран
//Программа должна определить максимальное из этих четырех чисел
//Результат вывести на экран


import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        Random random = new Random();


        int ran1 = random.nextInt(100);
        int ran2 = random.nextInt(100);
        int ran3 = random.nextInt( 100);
        int ran4 = random.nextInt(100);
        System.out.println("Random1: " + ran1 + "\n" + "Random1: " + ran2 + "\n" + "Random2: " + ran3 + "\n" + "Random3: " + ran4);

        int maxNumber;

        if (ran1 >= ran2 && ran1 >= ran3 && ran1 >= ran4) {
            maxNumber = ran1;
        } else if (ran2 >= ran1 && ran2 >= ran3 && ran2 >= ran4) {
            maxNumber = ran2;
        } else if (ran3 >= ran2 && ran3 >= ran1 && ran3 >= ran4) {
            maxNumber = ran3;
        } else   maxNumber = ran4;
        System.out.println("Maximal ran: " + maxNumber);
        }



    }




