package lessons_21;

public class AutoParkMain {
    public static void main(String[] args) {
        BusDriver busDriver = new BusDriver("LN-19549459");

        Autobus bus = new Autobus(busDriver,25);

        System.out.println(bus.toString());

        BusDriver busDriver1 = new BusDriver("AE-545434435");
        bus.setDriver(busDriver1);

        System.out.println(bus.toString());
    }
}
