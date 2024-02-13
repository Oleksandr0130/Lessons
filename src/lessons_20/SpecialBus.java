package lessons_20;

public class SpecialBus extends Bus {

    private int bicyclePlaces;
    private int bycyclesCount;//по дефолту инициализируется 0



    public SpecialBus(String model, int yearManufactured, int capacity, int bicyclePlaces) {
        super(model, yearManufactured, capacity);
        this.bicyclePlaces = bicyclePlaces;
    }

    public void takePassengerWithBicycle(){
        // Есть ли место для
        // 1. Пассажира
        // 2. Велосипеда
        // есть ли место для обоих - оба садятся
        // если для кого-то нет места - никого не садим в автобус

    }

    public int getBicyclePlaces() {
        return bicyclePlaces;
    }

    public int getBycyclesCount() {
        return bycyclesCount;
    }

    public int example(){
        return super.getCapacity();
    }
}
