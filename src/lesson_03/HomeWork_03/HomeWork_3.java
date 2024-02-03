package lesson_03.HomeWork_03;

public class HomeWork_3 {
    public static void main(String[] args) {
        int mon = -1, di = -3, mitt = -3, don= -2, fr = -1, sa = -1, so = 5;
        int allD = 7;
        double sredniajaT;
        sredniajaT = ((double) mon + di + mitt + don + fr + sa + so) / allD;
        System.out.printf("sredniaja temperatura za nedelu: %f\n", + sredniajaT);
        System.out.printf("sredniaja temperatura za nedelu: %.2f\n", + sredniajaT);
    }
}
