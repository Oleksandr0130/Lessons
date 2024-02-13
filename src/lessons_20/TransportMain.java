package lessons_20;

public class TransportMain {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Телега", 1910);
        System.out.println(vehicle.toString());
        vehicle.go();
        vehicle.stop();

        System.out.println("\n==============================================\n");

        Bus bus = new Bus("Man", 2020, 3);
        System.out.println(bus.toString());
        bus.go();
        bus.stop();

        System.out.println("bus.getCapacity: " + bus.getCapacity());

        System.out.println("\n==============================================\n");

        bus.getOut();
        bus.takePassenger();
        bus.takePassenger();
        bus.setCapacity(1);
        bus.takePassenger();
        bus.takePassenger();
        System.out.println("В автобусе: " + bus.countPassengers);
        bus.takePassenger();

        System.out.println("\n========================================================\n");

        System.out.println("Всего перевезено пассажиров: " + Bus.getTotalPassangers());

        System.out.println("\n========================================================\n");

        Train train = new Train("Express-1", 2024, 3);
        System.out.println(train.toString());
        train.go();
        train.stop();

        System.out.println(train.getWagonCounter());

        System.out.println("\n===============================================\n");

        SpecialBus specialBus = new SpecialBus("Ikarus", 1978, 30, 3);
        specialBus.go();
        System.out.println(specialBus.toString());
        specialBus.stop();

        System.out.println(specialBus.example());
    }
}
