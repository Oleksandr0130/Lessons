package lessons_22.HomeWorkTask2;

public class Car extends Vehicle{
    public Car() {
        super(true);

    }

    @Override
    public void startEngine() {
        System.out.println("Запуск двигателя");

    }

}
