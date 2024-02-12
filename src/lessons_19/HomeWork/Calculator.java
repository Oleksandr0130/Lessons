package lessons_19.HomeWork;

//Класс "Калькулятор" Создайте класс Calculator,
// который будет предоставлять базовые арифметические операции: сложение, вычитание, умножение и деление.

//Класс должен содержать: Статические методы для каждой операции, принимающие два аргумента и возвращающие результат операции.


public class Calculator {

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Делить на ноль нельзя!!!");
            return Double.NaN;
        }


    }


    public static void main(String[] args) {
        double a = 10;
        double b = 10;


        System.out.println("Add: " + Calculator.add(a, b));
        System.out.println("Subtraction: " + Calculator.subtraction(a, b));
        System.out.println("Multiplication: " + Calculator.multiplication(a, b));
        System.out.println("Division: " + Calculator.division(a, b));

    }
}
