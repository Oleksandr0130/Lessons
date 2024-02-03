package lesson_8;

public class DoWhile {
    public static void main(String[] args) {

        int i = 6;
        //

        while (i <= 5) { // Цикл с предусловием. Т.е. тело цикла может вообще ни разу не выполнится (зависит от условия)
            System.out.println(i);
            i++;
        }



        System.out.println(" =============== ");


        int j = 2;
        do {  // Цикл с постусловием. Т.е. тело цикла ГАРАНТИРОВАННО выполнится один раз (НЕ зависит от условия)
            System.out.println(j);
            j++;
        } while (j <= 5); // а вот выполнится ли второй раз тело цикла - зависит от условия


    }
}

