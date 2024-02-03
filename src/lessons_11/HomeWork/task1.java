package lessons_11.HomeWork;



//Написать метод принимающий целое число и проверяющий является ли число простым.
// Если является, метод должен вернуть true, не является - false
public class task1 {
    public static void main(String[] args) {
        int number = 13;
        boolean isPrime = isPrimeNumber(number);

        if (isPrime) {
            System.out.println(number + " число является простым");
        }else {
            System.out.println(number + " число не является простым");
        }

    }

    // Метод
    public static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <=Math.sqrt(num) ; i++) {
            if (num % i == 0){
                return false; // Если нашли делитель, число не простое
            }

        }
        return true; // если не нашли делителей, число простое
    }



}
