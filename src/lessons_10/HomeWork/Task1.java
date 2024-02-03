package lessons_10.HomeWork;

public class Task1 {
    public static void main(String[] args) {

        powTwo(0);
    }

    public static void powTwo(int pow){
        // мы должны обработать входящие значения
        //Если пришла степень отрицательная .. 2 ^ (-n) = 1 / (2 ^ n)
        // если пришел 0

        int absPow = (pow > 0) ? pow : pow * - 1;

        int result = 1;

        for (int i = 0; i < absPow; i++) {
            result *= 2;
        }

        if (pow >= 0){
            System.out.println(result);
        }else{
            System.out.printf("1 / %d\n", result);
            System.out.printf("%.2f\n",(double)1 / result);
        }
    }
}
