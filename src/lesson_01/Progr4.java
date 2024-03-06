package lesson_01;
//Объявите 10 переменных типа int со значениями 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.
// Объявите ещё одну переменную int
// и сохраните в неё сумму этих переменных, деленную на 10.
// Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
// Распечатайте её через println. Сколько программа отбросила в дробной части?
public class Progr4 {
    public static void main(String[] args) {
        int v = 0, v1 = 1, v2 = 2, v3 = 3, v4 = 4, v5 = 5, v6 = 6, v7 = 7, v8 = 8, v9 = 9;
        int var = 10;
        int sredniaja;
        int result;
        int divresult;
        double dresult;

        result = (v + v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9);
        sredniaja = result / var;
        dresult = (double) result / var;
        divresult = result % var;
        System.out.println("Среднее арифметическое чисел: " + sredniaja);
        System.out.println("Остаток от деления: " + divresult);
        System.out.println("Результат с точкой: " +  dresult);

    }
}
