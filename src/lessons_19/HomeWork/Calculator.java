package lessons_19.HomeWork;

public class Calculator {

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 + num2;
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
        double b = 0;

        double result;


        System.out.println("Add: " + add(a, b));
        System.out.println("Subtraction: " + subtraction(a, b));
        System.out.println("Multiplication: " + multiplication(a, b));
        System.out.println("Division: " + division(a, b));


        if (Double.isNaN(result = division(a,b))){
            System.out.println("Arror");
        }else{
            System.out.println("Result division: " + result);
        }
    }
}
