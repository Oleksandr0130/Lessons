package lessons_27;

public class GenericMethods {

    public static <T extends Number> int sum(T... elements){
        int sum = 0;
        for (T value: elements){
            sum += value.intValue();
        }
        return sum;
    }
}
