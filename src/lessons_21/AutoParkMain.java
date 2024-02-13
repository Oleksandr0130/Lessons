package lessons_21;

public class AutoParkMain {
    public static void main(String[] args) {
        BusDriver busDriver = new BusDriver("LN-19549459");

        Autobus bus = new Autobus(busDriver,25);

        System.out.println(bus.toString());

        BusDriver busDriver1 = new BusDriver("AE-545434435");
        bus.setDriver(busDriver1);

        System.out.println(bus.toString());

        Passenger passenger = new Passenger("John");
        Passenger passenger1 = new Passenger("Margo");
        Passenger passenger2 = new Passenger("Peter");
        Passenger passenger3 = new Passenger("Hanna");
        Passenger passenger4 = new Passenger("Seba");

        bus.takePassenger(passenger);
        bus.takePassenger(passenger1);
        bus.takePassenger(passenger2);
        bus.takePassenger(passenger3);
        bus.takePassenger(passenger4);
        bus.takePassenger(new Passenger("test"));

        System.out.println(bus.getStringPassengersList());

    }
}