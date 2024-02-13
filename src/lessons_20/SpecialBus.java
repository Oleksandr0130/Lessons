package lessons_20;

public class SpecialBus extends Bus {


    private int bicyclePlaces;
    private int bicyclesCount;//по дефолту инициализируется 0



    public SpecialBus(String model, int yearManufactured, int capacity, int bicyclePlaces) {
        super(model, yearManufactured, capacity);
        this.bicyclePlaces = bicyclePlaces;
    }

    public boolean takePassengerWithBicycle(){
        // Есть ли место для
        // 1. Пассажира
        // 2. Велосипеда
        // есть ли место для обоих - оба садятся
        // если для кого-то нет места - никого не садим в автобус



        //место для велосипеда есть
        if (bicyclesCount < bicyclePlaces && takePassenger() ){
            //boolean isPassengerEntry = takePassenger();

            //if (isPassengerEntry){ // пассажира посадили в автобус
                bicyclesCount++; // берем на борт велосипед
                System.out.println("Пассажир и велосипед  поместились в автобус" + getModel());
                return true;
            }
     //   }
        System.out.println("Пассажир и велосипед Не поместились в автобус: " + getModel());
        return false;
    }

    public int getBicyclePlaces() {
        return bicyclePlaces;
    }

    public int getBycyclesCount() {
        return bicyclesCount;
    }

    public int example(){
        return super.getCapacity();
    }
}
