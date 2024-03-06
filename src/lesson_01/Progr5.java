package lesson_01;
// Пусть цена товара A обычно составляет 1000 Euro,
// и товара B составляет 500 Euro.
// Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.
// Выведите на экран переменную, которая соответствует стоимости суммы A+B со скидкой.
// Отдельно выведите на экран сумму скидки от этой покупки.
public class Progr5 {
    public static void main(String[] args) {
        double computer = 1000;
        double phone = 500;
        int var = 10;
        double resultS, resultWithP, resultR;

        resultS = computer + phone;
        resultWithP = resultS / var;
        resultR = resultS - resultWithP;

        System.out.println("цена со скидкой: " + resultR);
        System.out.println("Скидка: " + resultWithP);


    }
}
