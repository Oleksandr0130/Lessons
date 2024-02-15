package lessons_22.HomeWorkTask2;


public class Motorcycle extends Vehicle{
    public Motorcycle() {
        super(true);
    }

    @Override
    public void startEngine() {
        System.out.println("Запуск двигателя");
    }
}
