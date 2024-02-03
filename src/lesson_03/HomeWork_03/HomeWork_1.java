package lesson_03.HomeWork_03;

public class HomeWork_1 {
    public static void main(String[] args) {
        int var0 = 0, var1 = 1, var2 = 2, var3 = 3, var4 = 4, var5 = 5, var6 = 6, var7 = 7, var8 = 8, var9 = 9;
        int var = 10;
        int sredniaja;
        int divSredniaja;
        double result;
        int intResult = var0 + var1 + var2 + var3 + var4 + var5 + var6 + var7 + var8 + var9;
         sredniaja = intResult / var;
         divSredniaja = intResult % var;
         result = (double) intResult / var;

        System.out.println("intResult: " + intResult);
        System.out.println("sredniaja: " + sredniaja);
        System.out.println("otbroszeno: " + divSredniaja);
        System.out.println("wywod s plawajuszej: " + result);

    }
}
