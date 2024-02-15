package lessons_22.HomeWorkTask2;

public class Vehicle {
    private final boolean hasEngine;

    public Vehicle(boolean hasEngine) {
        this.hasEngine = hasEngine;
    }

    public void startEngine(){

    }

    public boolean hasEngine() {
        return hasEngine;
    }

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car();
        vehicles[1] = new Bicycle();
        vehicles[2] = new Motorcycle();

        for (int i = 0; i < vehicles.length; i++) {
                Vehicle vehicle =  vehicles[i];
            System.out.println("Есть ли двигатель: " + vehicle.hasEngine());
                vehicle.startEngine();
            System.out.println("===================");
            }

        }
    }

