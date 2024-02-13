package lessons_20;

public class Vehicle {

    private String model;

    private final int yearManufactured;

    public Vehicle(String model, int yearManufactured) {
        System.out.println("Конструктор Bus start");
        this.model = model;
        this.yearManufactured = yearManufactured;
    }

    public void go(){
        System.out.println("vehicle " + model + " начинает ехать");
    }

    public void stop() {
        System.out.println("vehicle " + model + " остановился");
    }
    public String toString(){
        return "Vehicle " + model + "; year: " + yearManufactured;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearManufactured() {
        return yearManufactured;
    }

}