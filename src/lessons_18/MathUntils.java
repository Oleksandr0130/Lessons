package lessons_18;

public class MathUntils {

    public static int sumOfints(int x, int...ints){

        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];

        }
        return sum;
    }
}
