package lesson_9;

public class BreakContinue {
    public static void main(String[] args) {

        // Перебирать числа от 1..10

        // continue - при вызове оператора он завершает текущую итерацию цикла и переходит к след.
        // break

        for (int i = 1; i < 11; i++) {
            System.out.println("before if: " + i);

            if (i == 4) continue;

            System.out.println("after if: " + i);

            if (i == 8) break;

            System.out.println("after break: " + i);

        } // тело цикла

        System.out.println(" После цикла");

    }
}
