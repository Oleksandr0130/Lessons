package lessons_19;

public class FinalDemo {

    public static final double PI = 3.141519; // Константа

    public static final int[] INTS = new int[10]; //не является КОНСТАНТОЙ, т.к значение элементов
    private final int x;

    private final int[] ints;

    public FinalDemo(int x) {
        this.x = x;
        ints = new int[10];
        // this.x = 15: изменить значение Final int нельзя
    }


    public void setX(int newValue){
        //  this.x = newValue;  изменить значение Final int нельзя
    }

    public void setNewSize(int size) {

        //ints = new int[size]: Нельзя переписать ссылку для final переменной ссылочного типа
    }

    public void setNewValue() {
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i * 10;
        }
    }

    public void printArray(){
        System.out.print("[");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + (i < ints.length-1 ? ", ": "]\n"));

        }
    }
}
