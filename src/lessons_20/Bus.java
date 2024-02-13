package lessons_20;

public class Bus extends Vehicle {

    public static int totalPassengers;
    private int capacity;

    int countPassengers; // по умолчанию установленно в 0

    public Bus(String model, int yearManufactured, int capacity) {
        // чтобы создать обьект - родителя нам нужно вызвать конструктор!!!
        // конструктор родителя вызывается (super)
        super(model, yearManufactured);
        System.out.println("Конструктор Vehicle start");
        this.capacity = capacity;
    }

    public boolean takePassenger(){
        //Проверить есть ли место в автобусе
        if (countPassengers < capacity){
            // свободное место есть. Добавляем пассажира
            countPassengers++;
            totalPassengers++;
            System.out.println("Пассажир залез в автобус " + this.getModel());
        return true;
        }
        System.out.println("Пассажир не залез-Мест нет!!!");
        return false;
    }

    public void getOut(){
        if (countPassengers > 0) {
            countPassengers--;
            totalPassengers--;
            System.out.println("Пассажир вышел из автобуса " + this.getModel());
        }else{
            System.out.println("В бусе больше нет пассажиров некому выходить");
        }
    }

    public static int getTotalPassangers(){
        return totalPassengers;
    }
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        //TODO надо проверять, есть ли лишние места в автобусе
        this.capacity = capacity;
    }
}
