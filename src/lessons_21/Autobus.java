package lessons_21;

public class Autobus {

    //Для создания связи типа HAS-A мы определяем поле класса,
    // которое будет хранить ссылку на обьект другого класса
    // Направленность связи - однонаправленная или двунаправленная

    // Кардинальность связи - определяет б сколько обьектов одного класса,
    // может быть ассоциировано  с обьектом другого класса.


    private  BusDriver driver; // агрегация (мягкая связь)

    private final Autopilot autopilot; // композиция (жесткая неразрывная связь)

    private int capacity;

    private final Passenger[] passengers;
    public Autobus(BusDriver busDriver, int capacity){
        this.driver = busDriver;
        autopilot = new Autopilot("AP-005");
        this.capacity = capacity;
        this.passengers = new Passenger[capacity];
    }

    public boolean takePassenger(Passenger passenger) {
        for (int i = 0; i < passengers.length; i++){
            if (passengers[i] == null){
                passengers[i] = passenger;
                return true;
            }
        }

            return false;
        }


    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }

    @Override
    public String toString() {
        return "Autobus:  {" + " driver: " + driver.getLicenseNumber() + " ; autopilot: " + autopilot.getSoftwareVer() + "}";
    }


}
