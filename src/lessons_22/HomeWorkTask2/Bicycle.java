package lessons_22.HomeWorkTask2;

public class Bicycle extends Vehicle{
    public Bicycle() {
        super(false);

    }

    @Override
    public void startEngine() {
        System.out.println("У велосипеда нет двигателя, крутите педали");

    }

}
